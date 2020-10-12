package org.weewelchie.strava.stats;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.api.AthletesApi;
import io.swagger.client.auth.OAuth;
import io.swagger.client.model.ActivityStats;
import io.swagger.client.model.DetailedActivity;
import io.swagger.client.model.DetailedAthlete;

public class StravaActivities {

	private static final String ACCESS_TOKEN = "4b2c7d8dc012a8d5af862949f1483dd783e10460";
	private static final String CLIENT_ID = "48445";
	
	
	public static void main(String[] args) {

		ApiClient defaultClient = Configuration.getDefaultApiClient();

		// Configure OAuth2 access token for authorization: strava_oauth
		//defaultClient.setApiKey(CLIENT_ID);
		OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
		strava_oauth.setAccessToken(ACCESS_TOKEN);
		
		List<Pair> queryParams = new ArrayList<Pair>();
		queryParams.add(new Pair("client_id", CLIENT_ID));
		queryParams.add(new Pair("redirect_uri", "https://www.strava.com/oauth/authorize"));
		queryParams.add(new Pair("response_type", "code"));
		queryParams.add(new Pair("approval_prompt", "auto"));
		queryParams.add(new Pair("scope", "activity:write,read"));
		
		
		Map<String, String> headerParams = new HashMap<String, String>();
		headerParams.put("Authorization", "Bearer " + ACCESS_TOKEN);
		strava_oauth.applyToParams(queryParams, headerParams);
		strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
		
		
		//.appendQueryParameter("client_id", "1234321")
        //.appendQueryParameter("redirect_uri", "https://www.yourapp.com")
        //.appendQueryParameter("response_type", "code")
        //.appendQueryParameter("approval_prompt", "auto")
        //.appendQueryParameter("scope", "activity:write,read")
		 String[] authNames = new String[1];
		    
		 authNames[0] = "strava_oauth";
		 defaultClient.updateParamsForAuth(authNames, queryParams, headerParams);
		//Authentice user
		AthletesApi apiInstance = new AthletesApi(defaultClient);

		//AthletesApi apiInstance = new AthletesApi();
		Long id = 13986969L; // Long | The identifier of the athlete. Must match the authenticated athlete.
		try {
		    ActivityStats result = apiInstance.getStats(id);
		    System.out.println(result);

		    apiInstance.setApiClient(defaultClient);
		    //Login athlete
		    DetailedAthlete detAthlete = apiInstance.getLoggedInAthlete();
		    DetailedActivity detailedActivity =new DetailedActivity();


		} catch (ApiException e) {
		    System.err.println("Exception when calling AthletesApi#getStats");
		    e.printStackTrace();
		}
		
		
//		apiInstance = new ActivitiesApi();
//		String name = "name_example"; // String | The name of the activity.
//		String type = "type_example"; // String | Type of activity. For example - Run, Ride etc.
//		OffsetDateTime startDateLocal = OffsetDateTime.now(); // OffsetDateTime | ISO 8601 formatted date time.
//		Integer elapsedTime = 56; // Integer | In seconds.
//		String description = "description_example"; // String | Description of the activity.
//		Float distance = 3.4F; // Float | In meters.
//		Integer trainer = 56; // Integer | Set to 1 to mark as a trainer activity.
//		Integer commute = 56; // Integer | Set to 1 to mark as commute.
//		try {
//			DetailedActivity result = apiInstance.createActivity(name, type, startDateLocal, elapsedTime, description,
//					distance, trainer, commute);
//			System.out.println(result);
//		} catch (ApiException e) {
//			System.err.println("Exception when calling ActivitiesApi#createActivity");
//			e.printStackTrace();
//		}

	}

}
