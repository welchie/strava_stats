package org.weewelchie.strava.stats;

import io.swagger.models.AuthorizationScope;
import javastrava.api.v3.auth.AuthorisationService;
import javastrava.api.v3.auth.impl.retrofit.AuthorisationServiceImpl;
import javastrava.api.v3.auth.model.Token;
import javastrava.api.v3.auth.ref.AuthorisationScope;
import javastrava.api.v3.model.StravaAthlete;
import javastrava.api.v3.service.Strava;

public class StravaStats {

	private static final String ACCESS_TOKEN = "4b2c7d8dc012a8d5af862949f1483dd783e10460";
	private static final Integer CLIENT_ID = 48445;
	private static final String CLIENT_SECRET = "d906ca7e1a4cecc32a33714266d5baeaa6918e75";
	private static final String CODE = "ad2ee73738e4b1e88c1132dcefb9701b3505b7b5";
	private static final Integer ATHLETE_ID = 13986969;
	
	public static void main(String[] args) {
		
		AuthorisationService service = new AuthorisationServiceImpl();
		AuthorisationScope scope = AuthorisationScope.UNKNOWN;
		
		Token token = service.tokenExchange(CLIENT_ID, CLIENT_SECRET, CODE);
		
		Strava strava = new Strava(token);
		StravaAthlete athlete = strava.getAthlete(ATHLETE_ID);
		
		String profile = athlete.getProfile();
		
		System.out.println("Athlete Profile: " + profile);
	}

}
