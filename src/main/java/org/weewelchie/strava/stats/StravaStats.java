package org.weewelchie.strava.stats;

import javastrava.auth.AuthorisationService;
import javastrava.auth.impl.AuthorisationServiceImpl;
import javastrava.auth.model.Token;
import javastrava.auth.ref.AuthorisationScope;
import javastrava.model.StravaAthlete;
import javastrava.service.Strava;

public class StravaStats {

	private static final String ACCESS_TOKEN = "4b2c7d8dc012a8d5af862949f1483dd783e10460";
	private static final Integer CLIENT_ID = 48445;
	private static final String CLIENT_SECRET = "d906ca7e1a4cecc32a33714266d5baeaa6918e75";
	private static final String CODE = "415d6bc9e935a7a92fe7e1e329eee7306d20dc4b";
	private static final Integer ATHLETE_ID = 13986969;
	
	public static void main(String[] args) {
		
		AuthorisationService service = new AuthorisationServiceImpl();
		AuthorisationScope scope = AuthorisationScope.UNKNOWN;
		
		//Call Strava API with CLIENT ID to retrieve CODE
		//https://www.strava.com/oauth/authorize?client_id=48445&response_type=code&redirect_uri=http://localhost/exchange_token&approval_prompt=force&scope=read,activity:read
		//CURL command and then redirect?
		
		Token token = service.tokenExchange(CLIENT_ID, CLIENT_SECRET, CODE);
		
		Strava strava = new Strava(token);
		StravaAthlete athlete = strava.getAthlete(ATHLETE_ID);
		
		String profile = athlete.getProfile();
		
		System.out.println("Athlete Profile: " + profile);
	}

}
