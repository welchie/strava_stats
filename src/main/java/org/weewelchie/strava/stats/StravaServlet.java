package org.weewelchie.strava.stats;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import org.json.JSONObject;

public class StravaServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public boolean authorize = true;
	private static final String URL = "http://localhost:8888/strava-stats";
	private static final String CLIENT_SECRET = "d906ca7e1a4cecc32a33714266d5baeaa6918e75";
	private static final String CLIENT_ID = "48445";
	private static final Double METRES_TO_MILES = 0.000621371;
	private static final int MINUTES = 60;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
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
				resp.sendRedirect(request.getLocationUri());
			} catch (OAuthSystemException e) {
				e.printStackTrace();
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

				//Get Activity Details
				//https://www.strava.com/api/v3/athlete/activities
				OAuthClientRequest bearerClientRequest = new OAuthBearerClientRequest(
							"https://www.strava.com/api/v3/athlete/activities").setAccessToken(accessToken).buildQueryMessage();

				// Get the response and print the body.
				OAuthResourceResponse resourceResponse = oAuthClient.resource(bearerClientRequest, HttpMethod.GET,
							OAuthResourceResponse.class);
				
				String responseBody = resourceResponse.getBody();
				String resType=resourceResponse.getContentType();
				
				
				out.println("Activity Details");
				out.flush();
	
				out.println("<html><head>Heading</head><body><table style='width:100%'>");
				
				JSONArray array = new JSONArray(responseBody);
				JSONArray outputArray = new JSONArray();
				
				for (int i = 0; i < array.length(); i++) {
				  JSONObject row = array.getJSONObject(i);
				  
				  String name = row.getString("name");
				  Long id = row.getLong("id");
				  JSONObject obj = new JSONObject();
				  obj.append("name", name);
				  obj.append("id", id);
			
				  //Now get the detail activity here and get the description
				  bearerClientRequest = new OAuthBearerClientRequest(
							"https://www.strava.com/api/v3//activities/" + id).setAccessToken(accessToken).buildQueryMessage();
			
				  // Get the response and print the body.
				  resourceResponse = oAuthClient.resource(bearerClientRequest, HttpMethod.GET,
							OAuthResourceResponse.class);
				
				  responseBody = resourceResponse.getBody();
				  JSONObject jsonObj = new JSONObject(responseBody);
				  
				  String desc = jsonObj.getString("description");
				  obj.append("description", desc);
				  
				  Double distance = jsonObj.getDouble("distance");
				  distance = distance * METRES_TO_MILES; //0.000621371;
				  obj.append("distance(miles)", distance);
				  
				  Double movingTime = jsonObj.getDouble("moving_time");
				  Double minutes = movingTime/MINUTES; ///60;
				  obj.append("moving_time(mins)", minutes);
				  
				  String type = jsonObj.getString("type");
				  obj.append("type", type);
				  out.println("<tr>");
				  out.println("<td>");
				  out.println(obj);
				  out.println("</td>");
				  out.println("</tr>");				  
				  outputArray.put(obj);
				  
				  //out.println("OutputArray size: " + outputArray.length());
				  System.out.println("OutputArray size: " + outputArray.length());
				  
				  out.flush();
				}
				out.println("</table></body></html>");
				
				System.out.println("******************** End of the loop here **********************");
				System.out.println("==============================================================================");
				System.out.println(outputArray);
				
				
				authorize = true;
			} catch (OAuthSystemException e) {
				e.printStackTrace();
			} catch (OAuthProblemException e) {
				e.printStackTrace();
			}
		}
	}
}
