package org.weewelchie.strava.stats;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthBearerClientRequest;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthAuthzResponse;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.client.response.OAuthResourceResponse;
import org.apache.oltu.oauth2.common.OAuth.HttpMethod;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

@WebServlet(name = "StravaStatsServlet", urlPatterns = "/stats/v1")
public class StravaStatsServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public boolean authorize = true;
	private static final String URL = "http://localhost:8888/strava-stats/stats/v1";
	private String CLIENT_SECRET = "";
	private String CLIENT_ID = "99999";
	private static String ID = "";
	private static final Double METRES_TO_MILES = 0.000621371;
	private static final int MINUTES = 60;

	private final static Logger LOGGER = Logger.getLogger(StravaStatsServlet.class.getName());

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Boolean error = false;
		List<String> errors = new ArrayList<String>();
		LOGGER.info("doPost");
		// Validate input Clint_id and client_secret are mandatory.
		CLIENT_ID = request.getParameter("clientId");
		if (CLIENT_ID == null || CLIENT_ID == "") {
			String err = "Error Client ID must be entered";
			LOGGER.severe("err");
			errors.add(err);
			error = true;
		}
		
		CLIENT_SECRET = request.getParameter("clientSecret");
		if (CLIENT_SECRET == null || CLIENT_SECRET == "") {
			String err = "Error Client Secret must be entered";
			LOGGER.severe("err");
			errors.add(err);
			error = true;
		}
		

		if (error)
		{
			PrintWriter writer = response.getWriter();
			String htmlResponse = "<html>";
			htmlResponse += "<body>";
			for(String err:errors)
			{
				htmlResponse += "<h2>" + err + "</h2>";
			}
			htmlResponse += "<form name=\"errorForm\" action=\"return\" method=\"GET\">" ;
			htmlResponse += "<button type=\"submit\">Return</button>" ;
			htmlResponse += "</form>";
			htmlResponse +="</body>";
			htmlResponse += "</html>";
			
			writer.println(htmlResponse);
			return;
		}
		else
		{
			LOGGER.info("CLIENT_ID:" + CLIENT_ID);
			LOGGER.info("CLIENT_SECRET:" + CLIENT_SECRET);
			LOGGER.info("Data validated - Calling doGet");
			try {
				doGet(request, response);
			} catch (ServletException e) {
				LOGGER.severe("ServletException: " + e.getMessage());
			}
		}

	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		StravaData sData = new StravaData();

		LOGGER.info("doGet");

		List<String> stats = new ArrayList<String>();

		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");

		if (authorize) {
			try {
				// Create the End User Authorization Request by
				OAuthClientRequest request = OAuthClientRequest
						// providing the Strava authorization endpoint,
						.authorizationLocation("https://www.strava.com/oauth/authorize")
						// setting the Client ID of your registered application,
						.setClientId(CLIENT_ID)
						// setting response type to code,
						.setResponseType("code")
						// setting scope to view_private (optional),
						.setScope("activity:read")
						// setting the redirect URI back to the servlet.
						.setRedirectURI(URL).buildQueryMessage();
				authorize = false;
				/*
				 * If scope is not public the user is redirected to Strava asking for
				 * permission. After the user is redirected to the servlet with filled 'code'
				 * request parameter.
				 */
				response.sendRedirect(request.getLocationUri());
			} catch (OAuthSystemException e) {
				LOGGER.log(Level.SEVERE, "OAuthSystemException : " + e.getMessage());
			}
		} else {
			try {
				// Get the code parameter.
				OAuthAuthzResponse oar = OAuthAuthzResponse.oauthCodeAuthzResponse(req);
				String code = oar.getCode();

				// Create the Application Authorization Request by
				OAuthClientRequest request = OAuthClientRequest
						// providing the Strava token endpoint,
						.tokenLocation("https://www.strava.com/oauth/token")
						// setting grant type to authorization code,
						.setGrantType(GrantType.AUTHORIZATION_CODE)
						// setting the Client ID of your registered application,
						.setClientId(CLIENT_ID)
						// setting the Client secret of your registered application,
						.setClientSecret(CLIENT_SECRET)
						// setting the redirect URI back to the servlet,
						.setRedirectURI(URL)
						// setting the previously requested oauth code.
						.setCode(code).buildQueryMessage();

				// Receive your access token.
				OAuthClient oAuthClient = new OAuthClient(new URLConnectionClient());
				OAuthJSONAccessTokenResponse oAuthResponse = oAuthClient.accessToken(request,
						OAuthJSONAccessTokenResponse.class);
				String accessToken = oAuthResponse.getAccessToken();

				// Get Activity Details
				// https://www.strava.com/api/v3/athlete/activities
				OAuthClientRequest bearerClientRequest = new OAuthBearerClientRequest(
						"https://www.strava.com/api/v3/athlete/activities").setAccessToken(accessToken)
								.buildQueryMessage();

				// Get the response and print the body.
				OAuthResourceResponse resourceResponse = oAuthClient.resource(bearerClientRequest, HttpMethod.GET,
						OAuthResourceResponse.class);

				String responseBody = resourceResponse.getBody();
				String resType = resourceResponse.getContentType();
				LOGGER.log(Level.FINEST, "responseBody: " + responseBody);
				LOGGER.log(Level.FINEST, "resType: " + resType);

				JSONArray array = new JSONArray(responseBody);

				for (int i = 0; i < array.length(); i++) {
					try {
						JSONObject row = array.getJSONObject(i);
						LOGGER.log(Level.FINEST, "JSONObject row(" + i + "): " + row);
						String name = row.getString("name");
						Long activityId = row.getLong("id");

						// Now get the detail activity here and get the description
						bearerClientRequest = new OAuthBearerClientRequest(
								"https://www.strava.com/api/v3//activities/" + activityId).setAccessToken(accessToken)
										.buildQueryMessage();

						// Get the response and print the body.
						resourceResponse = oAuthClient.resource(bearerClientRequest, HttpMethod.GET,
								OAuthResourceResponse.class);

						responseBody = resourceResponse.getBody();
						JSONObject jsonObj = new JSONObject(responseBody);

						String desc = jsonObj.getString("description");
						String finalDesc = this.convertToJson(desc);
						Double distance = jsonObj.getDouble("distance");
						distance = distance * METRES_TO_MILES; // 0.000621371;

						Double movingTime = jsonObj.getDouble("moving_time");
						movingTime = movingTime / MINUTES; /// 60;

						String type = jsonObj.getString("type");

						sData = new StravaData(activityId, name, finalDesc, distance, movingTime, type);
						LOGGER.log(Level.INFO, "Stats: " + sData);
						String statsJsonString = new Gson().toJson(sData);
						stats.add(statsJsonString);
					} catch (JSONException jsonException) {
						LOGGER.log(Level.SEVERE, "JSONException: " + jsonException.getMessage());
					}
				}

				out.print(stats);
				out.flush();

				authorize = true;
			} catch (OAuthSystemException e) {
				LOGGER.log(Level.SEVERE, "OAuthSystemException: " + e.getMessage());
				out.println("OAuthSystemException: " + e.getMessage());
			} catch (OAuthProblemException e) {
				LOGGER.log(Level.SEVERE, "OAuthProblemException: " + e.getMessage());
			}
		}
	}

	String convertToJson(String desc) {
		String finalDesc = "[{";
		String title = "";
		String[] descs = desc.split(",");
		if (descs.length > 1) {

			String desc2 = "";
			for (int j = 0; j < descs.length; j++) {
				if (j == 0) {
					title = "humans";
					desc2 = descs[j].replaceFirst("humans", "").trim();
					desc2 = desc2.replaceFirst("human", "").trim();
				} else if (j == 1) {
					title = "dogs";
					desc2 = descs[j].replaceFirst("dogs", "").trim();
					desc2 = desc2.replaceFirst("dog", "").trim();
				} else if (j == 2) {
					title = "bikes";
					desc2 = descs[j].replaceFirst("bikes", "").trim();
					desc2 = desc2.replaceFirst("bike", "").trim();
				} else {
					title = "misc" + (j - 2);
					desc2 = descs[j];
				}
				;

				finalDesc = finalDesc + "\"" + title + "\" :\"" + desc2 + "\"" + ",";
			}
			finalDesc = finalDesc.substring(0, finalDesc.length() - 1) + "}]";
		} else {
			finalDesc = "";
		}
		return finalDesc;
	}
}
