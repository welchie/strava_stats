package org.weewelchie.strava.stats;

import org.json.JSONArray;
import org.json.JSONObject;

public class StravaActivities {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//Test JSON Array Here
		//String jsonArr = new String("[{\"name\": \"One\"},{\"name\":\"two\"},{\"name\":\"three\"}]");
		
		String jsonArr = new String("[{\r\n"
				+ "		\"resource_state\": 2,\r\n"
				+ "		\"athlete\": {\r\n"
				+ "			\"id\": 13986969,\r\n"
				+ "			\"resource_state\": 1\r\n"
				+ "		},\r\n"
				+ "		\"name\": \"Lunch Run Full Monty without the hills.\",\r\n"
				+ "		\"distance\": 10218.6,\r\n"
				+ "		\"moving_time\": 3070,\r\n"
				+ "		\"elapsed_time\": 3070,\r\n"
				+ "		\"total_elevation_gain\": 111.1,\r\n"
				+ "		\"type\": \"Run\",\r\n"
				+ "		\"workout_type\": 0,\r\n"
				+ "		\"id\": 4201988109,\r\n"
				+ "		\"external_id\": \"garmin_push_5684681896\",\r\n"
				+ "		\"upload_id\": 4495631038,\r\n"
				+ "		\"start_date\": \"2020-10-16T11:24:04Z\",\r\n"
				+ "		\"start_date_local\": \"2020-10-16T12:24:04Z\",\r\n"
				+ "		\"timezone\": \"(GMT+00:00) Europe/London\",\r\n"
				+ "		\"utc_offset\": 3600.0,\r\n"
				+ "		\"start_latlng\": [\r\n"
				+ "			56.04,\r\n"
				+ "			-3.37\r\n"
				+ "		],\r\n"
				+ "		\"end_latlng\": [\r\n"
				+ "			56.04,\r\n"
				+ "			-3.37\r\n"
				+ "		],\r\n"
				+ "		\"location_city\": null,\r\n"
				+ "		\"location_state\": null,\r\n"
				+ "		\"location_country\": \"United Kingdom\",\r\n"
				+ "		\"start_latitude\": 56.04,\r\n"
				+ "		\"start_longitude\": -3.37,\r\n"
				+ "		\"achievement_count\": 1,\r\n"
				+ "		\"kudos_count\": 3,\r\n"
				+ "		\"comment_count\": 0,\r\n"
				+ "		\"athlete_count\": 1,\r\n"
				+ "		\"photo_count\": 0,\r\n"
				+ "		\"map\": {\r\n"
				+ "			\"id\": \"a4201988109\",\r\n"
				+ "			\"summary_polyline\": \"wm_uIlfqSABI@[OMK}BmC}@_AYi@EeAHq@N_@D[EO]i@_@SQcAGiAMsAIe@Wu@e@m@c@a@w@g@_@a@c@?c@Gg@D_@_@OeAS}@gAgDMcACkADiAZkCDiAEgAO}@S}@K{@PaAzBaEVo@R}@DcAAcA_AoDQ{@K_AQ{@IeA[_C}AqLO_Aw@sGSsDIqEo@iTGiAg@mGOmCGaCUiC]_CSaASaCa@}B]yBOgCGgAH}@Zy@v@uAVu@G_A[_@e@@e@HMCSaCDiC@gACgAQkCGeEBgAAaAMiEM_C?iCEcAM{HMaFAiADgAn@yIBeAHaABeAE_AQcAg@{BE_@hBkAd@UdAo@h@UhBcA^KF|@C|@Xn@b@TL~@ChCKvBGhBDdARnCZbCR`CPtCFnCCdAMbAWx@Ox@K|@GbA?fALfCR`C@`ACdAShCOdC?~@B`AH`A`@|BZ\\\\LbALlF@dAC~@FbA\\\\`CPv@P~@J`A\\\\|Hn@`ER~@b@zCTx@XtD^xBd@bB^vBPx@j@dB^f@f@Fb@RXn@JdADbALz@Zj@`@Yd@a@bAyA^m@n@kBA_AEcAp@uFLuDP{BZg@d@GlAHZm@RcAT{@PQ\\\\f@P~@\\\\^b@]`@\\\\Zl@HhAF~BP|@VdA^bCd@vAVn@x@rAlAXd@@h@C`@NPv@CbAUhBKdEFtAN`AThADdAM~CbA|@Vr@d@Td@Ch@H^b@Xl@Vt@b@`@f@NnCnAhA]Zf@Nv@JtAb@vBZl@^\\\\XxAd@bED`AI~@AbAThAX`CD`ABvAK`AIdAWn@OVGfGJdAHf@\\\\`B^rBNhCCdAMdAWn@{@zAm@pAo@z@AfAQ`AQv@Wt@cAjAc@Lg@FeBdB]f@OJg@To@DSLCz@a@\\\\]BgAVWP_@f@[p@_BxE[f@c@\\\\e@Le@Be@AkAIg@Oa@Ui@CmAWeAe@c@Y_@c@_@o@_AgC]iAw@gB_AoCs@wA]e@}AcB_@[aByB_A_As@a@q@OUNi@`@?DlAzC`@lAZd@^\\\\`@f@Tx@NfAp@n@F~@I~@Ax@Vt@^l@b@h@bCzB\",\r\n"
				+ "			\"resource_state\": 2\r\n"
				+ "		},\r\n"
				+ "		\"trainer\": false,\r\n"
				+ "		\"commute\": false,\r\n"
				+ "		\"manual\": false,\r\n"
				+ "		\"private\": false,\r\n"
				+ "		\"visibility\": \"everyone\",\r\n"
				+ "		\"flagged\": false,\r\n"
				+ "		\"gear_id\": \"g6382672\",\r\n"
				+ "		\"from_accepted_tag\": false,\r\n"
				+ "		\"upload_id_str\": \"4495631038\",\r\n"
				+ "		\"average_speed\": 3.329,\r\n"
				+ "		\"max_speed\": 4.4,\r\n"
				+ "		\"average_cadence\": 92.7,\r\n"
				+ "		\"has_heartrate\": true,\r\n"
				+ "		\"average_heartrate\": 134.4,\r\n"
				+ "		\"max_heartrate\": 145.0,\r\n"
				+ "		\"heartrate_opt_out\": false,\r\n"
				+ "		\"display_hide_heartrate_option\": true,\r\n"
				+ "		\"elev_high\": 55.1,\r\n"
				+ "		\"elev_low\": 6.5,\r\n"
				+ "		\"pr_count\": 0,\r\n"
				+ "		\"total_photo_count\": 0,\r\n"
				+ "		\"has_kudoed\": false\r\n"
				+ "	},\r\n"
				+ "	{\r\n"
				+ "		\"resource_state\": 2,\r\n"
				+ "		\"athlete\": {\r\n"
				+ "			\"id\": 13986969,\r\n"
				+ "			\"resource_state\": 1\r\n"
				+ "		},\r\n"
				+ "		\"name\": \"Lunch Run coastal path\",\r\n"
				+ "		\"distance\": 5194.8,\r\n"
				+ "		\"moving_time\": 1566,\r\n"
				+ "		\"elapsed_time\": 1566,\r\n"
				+ "		\"total_elevation_gain\": 73.5,\r\n"
				+ "		\"type\": \"Run\",\r\n"
				+ "		\"workout_type\": 0,\r\n"
				+ "		\"id\": 4193450794,\r\n"
				+ "		\"external_id\": \"garmin_push_5675793003\",\r\n"
				+ "		\"upload_id\": 4486564059,\r\n"
				+ "		\"start_date\": \"2020-10-14T11:22:36Z\",\r\n"
				+ "		\"start_date_local\": \"2020-10-14T12:22:36Z\",\r\n"
				+ "		\"timezone\": \"(GMT+00:00) Europe/London\",\r\n"
				+ "		\"utc_offset\": 3600.0,\r\n"
				+ "		\"start_latlng\": [\r\n"
				+ "			56.04,\r\n"
				+ "			-3.37\r\n"
				+ "		],\r\n"
				+ "		\"end_latlng\": [\r\n"
				+ "			56.04,\r\n"
				+ "			-3.37\r\n"
				+ "		],\r\n"
				+ "		\"location_city\": null,\r\n"
				+ "		\"location_state\": null,\r\n"
				+ "		\"location_country\": \"United Kingdom\",\r\n"
				+ "		\"start_latitude\": 56.04,\r\n"
				+ "		\"start_longitude\": -3.37,\r\n"
				+ "		\"achievement_count\": 0,\r\n"
				+ "		\"kudos_count\": 2,\r\n"
				+ "		\"comment_count\": 0,\r\n"
				+ "		\"athlete_count\": 1,\r\n"
				+ "		\"photo_count\": 0,\r\n"
				+ "		\"map\": {\r\n"
				+ "			\"id\": \"a4193450794\",\r\n"
				+ "			\"summary_polyline\": \"op_uIfdqSu@cA_@_@a@Yk@o@Wq@Ay@VuA?QIYq@s@M}@YaECQWu@q@_AwAcAe@Se@Lc@Ka@UWs@c@cBo@gBWy@MgA?kAB_ATkCBgAIoAM_AS{@Gq@\\\\m@`@k@Zm@lAqC^k@jA_@Py@CeA@eAj@wBXw@x@aBn@{AxBuD\\\\g@bCiE~@sA~@{Ab@Yz@MXq@@I?eACk@Jy@h@}BJ_AHgAVeJNgCx@qIAcAGeAYeCP{@`@Yd@If@Tb@h@^n@hAlEr@hB\\\\`@t@b@`@^z@pARx@FbAj@lB\\\\nE\\\\xBG`ACbADdAr@r@\\\\f@`@Tf@Fb@Af@Zx@bB\\\\j@h@J^b@Zh@NPb@Td@M^[f@@Xn@Np@Dt@VjBL^\\\\d@b@^l@fGB`AEdCXvBRbCFdA?bA[zC]j@CRDdAQ|CDbANz@Vt@f@xBXjEE`AMx@sBjEg@|@Sn@K`AQ|@Sx@[l@a@b@c@Vg@?c@N_@h@a@\\\\_@d@_@\\\\g@Rg@FUVCbAe@Rc@@e@Jc@\\\\_@d@[p@k@rBm@fB_@n@a@\\\\e@Lg@CiASi@Ci@Ve@Cg@GmAUg@OgAy@a@]c@O]h@Yp@UrAc@@a@[c@c@g@q@\",\r\n"
				+ "			\"resource_state\": 2\r\n"
				+ "		},\r\n"
				+ "		\"trainer\": false,\r\n"
				+ "		\"commute\": false,\r\n"
				+ "		\"manual\": false,\r\n"
				+ "		\"private\": false,\r\n"
				+ "		\"visibility\": \"everyone\",\r\n"
				+ "		\"flagged\": false,\r\n"
				+ "		\"gear_id\": \"g6382672\",\r\n"
				+ "		\"from_accepted_tag\": false,\r\n"
				+ "		\"upload_id_str\": \"4486564059\",\r\n"
				+ "		\"average_speed\": 3.317,\r\n"
				+ "		\"max_speed\": 4.3,\r\n"
				+ "		\"average_cadence\": 92.6,\r\n"
				+ "		\"has_heartrate\": true,\r\n"
				+ "		\"average_heartrate\": 129.5,\r\n"
				+ "		\"max_heartrate\": 144.0,\r\n"
				+ "		\"heartrate_opt_out\": false,\r\n"
				+ "		\"display_hide_heartrate_option\": true,\r\n"
				+ "		\"elev_high\": 55.1,\r\n"
				+ "		\"elev_low\": 8.9,\r\n"
				+ "		\"pr_count\": 0,\r\n"
				+ "		\"total_photo_count\": 0,\r\n"
				+ "		\"has_kudoed\": false\r\n"
				+ "	}]");
		
		JSONArray array = new JSONArray(jsonArr);
		System.out.println("Array:" + array);
		for (int i = 0; i < array.length(); i++) {
		  JSONObject row = array.getJSONObject(i);
		  
		  String name = row.getString("name");
		  Long id = row.getLong("id");
		  System.out.println("Name: " + name);
		  System.out.println("ID: " + id);
		}

		
		
	}

}
