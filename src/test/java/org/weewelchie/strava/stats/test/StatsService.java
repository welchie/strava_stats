package org.weewelchie.strava.stats.test;

import java.util.Optional;

import org.weewelchie.strava.stats.StravaData;

public class StatsService {
	    public Optional<StravaData> getActivity(int id) {
	        switch (id) {
	            case 1:
	                return Optional.of(new StravaData(1L,"Test Activity 1","1 humans,2 dogs, 3 bikes, 1 special thing",3.25D, 35D,"Run"));
	            case 2:
	                return Optional.of(new StravaData(2L,"Test Activity 2","99 humans,88 dogs,77 bikes, 66 special thing",10.0D, 60.25D,"Run"));
	            case 3:
	                return Optional.of(new StravaData(3L,"Test Activity 3","22 humans,0 dogs, 5 bikes, 99 special thing",10.75D, 66.112D,"Ride"));
	            default:
	                return Optional.empty();
	        }
	    }
	}

