package org.weewelchie.strava.stats.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;


@JsonInclude(JsonInclude.Include.NON_NULL)
 @JsonPropertyOrder({
             "comment_count",
             "max_heartrate",
             "perceived_exertion",
             "segment_efforts",
             "has_kudoed",
             "laps",
             "type",
             "average_heartrate",
             "photos",
             "stats_visibility",
             "end_latlng",
             "hide_from_home",
             "upload_id_str",
             "splits_metric",
             "id",
             "kudos_count",
             "visibility",
             "athlete",
             "athlete_count",
             "resource_state",
             "max_speed",
             "best_efforts",
             "from_accepted_tag",
             "start_latlng",
             "achievement_count",
             "prefer_perceived_exertion",
             "name",
             "embed_token",
             "commute",
             "gear",
             "utc_offset",
             "average_cadence",
             "private",
             "upload_id",
             "distance",
             "timezone",
             "location_country",
             "has_heartrate",
             "description",
             "external_id",
             "location_state",
             "manual",
             "gear_id",
             "elev_low",
             "device_name",
             "flagged",
             "trainer",
             "workout_type",
             "location_city",
             "total_photo_count",
             "elapsed_time",
             "heartrate_opt_out",
             "display_hide_heartrate_option",
             "similar_activities",
             "map",
             "average_speed",
             "moving_time",
             "splits_standard",
             "sport_type",
             "start_date",
             "pr_count",
             "start_date_local",
             "calories",
             "total_elevation_gain",
             "available_zones",
             "photo_count",
             "elev_high",
             "suffer_score"
             })

 public class StravaDetailedActivity implements Serializable
 {
 
 @JsonProperty("comment_count")
 private Integer commentCount;
 @JsonProperty("max_heartrate")
 private Integer maxHeartrate;
 @JsonProperty("perceived_exertion")
 private Object perceivedExertion;
 @JsonProperty("segment_efforts")
 private List<StravaSegmentEffort> segmentEfforts;
 @JsonProperty("has_kudoed")
 private Boolean hasKudoed;
 @JsonProperty("laps")
 private List<StravaLap> laps;
 @JsonProperty("type")
 private String type;
 @JsonProperty("average_heartrate")
 private Double averageHeartrate;
 @JsonProperty("photos")
 private StravaPhotos photos;
 @JsonProperty("stats_visibility")
 private List<StravaStatsVisibility> statsVisibility;
 @JsonProperty("end_latlng")
 private List<Double> endLatlng;
 @JsonProperty("hide_from_home")
 private Boolean hideFromHome;
 @JsonProperty("upload_id_str")
 private String uploadIdStr;
 @JsonProperty("splits_metric")
 private List<StravaSplitsMetric> splitsMetric;
 @JsonProperty("id")
 private Long id;
 @JsonProperty("kudos_count")
 private Integer kudosCount;
 @JsonProperty("visibility")
 private String visibility;
 @JsonProperty("athlete")
 private StravaAthlete athlete;
 @JsonProperty("athlete_count")
 private Integer athleteCount;
 @JsonProperty("resource_state")
 private Integer resourceState;
 @JsonProperty("max_speed")
 private Double maxSpeed;
 @JsonProperty("best_efforts")
 private List<StravaBestEffort> bestEfforts;
 @JsonProperty("from_accepted_tag")
 private Boolean fromAcceptedTag;
 @JsonProperty("start_latlng")
 private List<Double> startLatlng;
 @JsonProperty("achievement_count")
 private Integer achievementCount;
 @JsonProperty("prefer_perceived_exertion")
 private Boolean preferPerceivedExertion;
 @JsonProperty("name")
 private String name;
 @JsonProperty("embed_token")
 private String embedToken;
 @JsonProperty("commute")
 private Boolean commute;
 @JsonProperty("gear")
 private StravaGear gear;
 @JsonProperty("utc_offset")
 private Integer utcOffset;
 @JsonProperty("average_cadence")
 private Double averageCadence;
 @JsonProperty("private")
 private Boolean _private;
 @JsonProperty("upload_id")
 private Long uploadId;
 @JsonProperty("distance")
 private Double distance;
 @JsonProperty("timezone")
 private String timezone;
 @JsonProperty("location_country")
 private String locationCountry;
 @JsonProperty("has_heartrate")
 private Boolean hasHeartrate;
 @JsonProperty("description")
 private String description;
 @JsonProperty("external_id")
 private String externalId;
 @JsonProperty("location_state")
 private Object locationState;
  @JsonProperty("manual")
  private Boolean manual;
  @JsonProperty("gear_id")
  private String gearId;
  @JsonProperty("elev_low")
  private Double elevLow;
  @JsonProperty("device_name")
  private String deviceName;
  @JsonProperty("flagged")
  private Boolean flagged;
  @JsonProperty("trainer")
  private Boolean trainer;
  @JsonProperty("workout_type")
  private Integer workoutType;
  @JsonProperty("location_city")
  private Object locationCity;
  @JsonProperty("total_photo_count")
  private Integer totalPhotoCount;
  @JsonProperty("elapsed_time")
  private Integer elapsedTime;
  @JsonProperty("heartrate_opt_out")
  private Boolean heartrateOptOut;
  @JsonProperty("display_hide_heartrate_option")
  private Boolean displayHideHeartrateOption;
  @JsonProperty("similar_activities")
  private StravaSimilarActivities similarActivities;
  @JsonProperty("map")
  private StravaMap map;
  @JsonProperty("average_speed")
  private Double averageSpeed;
  @JsonProperty("moving_time")
  private Integer movingTime;
  @JsonProperty("splits_standard")
  private List<StravaSplitsStandard> splitsStandard;
  @JsonProperty("sport_type")
  private String sportType;
  @JsonProperty("start_date")
  private String startDate;
  @JsonProperty("pr_count")
  private Integer prCount;
  @JsonProperty("start_date_local")
  private String startDateLocal;
  @JsonProperty("calories")
  private Integer calories;
  @JsonProperty("total_elevation_gain")
  private Double totalElevationGain;
  @JsonProperty("available_zones")
  private List<String> availableZones;
  @JsonProperty("photo_count")
  private Integer photoCount;
  @JsonProperty("elev_high")
  private Double elevHigh;
  @JsonProperty("suffer_score")
  private Integer sufferScore;
  private final static long serialVersionUID = -2752849663607312379L;
 
  @JsonProperty("comment_count")
  public Integer getCommentCount() {
  return commentCount;
  }
 
  @JsonProperty("comment_count")
  public void setCommentCount(Integer commentCount) {
  this.commentCount = commentCount;
  }
 
  @JsonProperty("max_heartrate")
  public Integer getMaxHeartrate() {
  return maxHeartrate;
  }
 
  @JsonProperty("max_heartrate")
  public void setMaxHeartrate(Integer maxHeartrate) {
  this.maxHeartrate = maxHeartrate;
  }
 
  @JsonProperty("perceived_exertion")
  public Object getPerceivedExertion() {
  return perceivedExertion;
  }
 
  @JsonProperty("perceived_exertion")
  public void setPerceivedExertion(Object perceivedExertion) {
  this.perceivedExertion = perceivedExertion;
  }
 
  @JsonProperty("segment_efforts")
  public List<StravaSegmentEffort> getSegmentEfforts() {
  return segmentEfforts;
  }
 
  @JsonProperty("segment_efforts")
  public void setSegmentEfforts(List<StravaSegmentEffort> segmentEfforts) {
  this.segmentEfforts = segmentEfforts;
  }
 
  @JsonProperty("has_kudoed")
  public Boolean getHasKudoed() {
  return hasKudoed;
  }
 
  @JsonProperty("has_kudoed")
  public void setHasKudoed(Boolean hasKudoed) {
  this.hasKudoed = hasKudoed;
  }
 
  @JsonProperty("laps")
  public List<StravaLap> getLaps() {
  return laps;
  }
 
  @JsonProperty("laps")
  public void setLaps(List<StravaLap> laps) {
  this.laps = laps;
  }
 
  @JsonProperty("type")
  public String getType() {
  return type;
  }
 
  @JsonProperty("type")
  public void setType(String type) {
  this.type = type;
  }
 
  @JsonProperty("average_heartrate")
  public Double getAverageHeartrate() {
  return averageHeartrate;
  }
 
  @JsonProperty("average_heartrate")
  public void setAverageHeartrate(Double averageHeartrate) {
  this.averageHeartrate = averageHeartrate;
  }
 
  @JsonProperty("photos")
  public StravaPhotos getPhotos() {
  return photos;
  }
 
  @JsonProperty("photos")
  public void setPhotos(StravaPhotos photos) {
  this.photos = photos;
  }
 
  @JsonProperty("stats_visibility")
  public List<StravaStatsVisibility> getStatsVisibility() {
  return statsVisibility;
  }
 
  @JsonProperty("stats_visibility")
  public void setStatsVisibility(List<StravaStatsVisibility> statsVisibility) {
  this.statsVisibility = statsVisibility;
  }
 
  @JsonProperty("end_latlng")
  public List<Double> getEndLatlng() {
  return endLatlng;
  }
 
  @JsonProperty("end_latlng")
  public void setEndLatlng(List<Double> endLatlng) {
  this.endLatlng = endLatlng;
  }
 
  @JsonProperty("hide_from_home")
  public Boolean getHideFromHome() {
  return hideFromHome;
  }
 
  @JsonProperty("hide_from_home")
  public void setHideFromHome(Boolean hideFromHome) {
  this.hideFromHome = hideFromHome;
  }
 
  @JsonProperty("upload_id_str")
  public String getUploadIdStr() {
  return uploadIdStr;
  }
 
  @JsonProperty("upload_id_str")
  public void setUploadIdStr(String uploadIdStr) {
  this.uploadIdStr = uploadIdStr;
  }
 
  @JsonProperty("splits_metric")
  public List<StravaSplitsMetric> getSplitsMetric() {
  return splitsMetric;
  }
 
  @JsonProperty("splits_metric")
  public void setSplitsMetric(List<StravaSplitsMetric> splitsMetric) {
  this.splitsMetric = splitsMetric;
  }
 
  @JsonProperty("id")
  public Long getId() {
  return id;
  }
 
  @JsonProperty("id")
  public void setId(Long id) {
  this.id = id;
  }
 
  @JsonProperty("kudos_count")
  public Integer getKudosCount() {
  return kudosCount;
  }
 
  @JsonProperty("kudos_count")
  public void setKudosCount(Integer kudosCount) {
  this.kudosCount = kudosCount;
  }
 
  @JsonProperty("visibility")
  public String getVisibility() {
  return visibility;
  }
 
  @JsonProperty("visibility")
  public void setVisibility(String visibility) {
  this.visibility = visibility;
  }
 
  @JsonProperty("athlete")
  public StravaAthlete getAthlete() {
  return athlete;
  }
 
  @JsonProperty("athlete")
  public void setAthlete(StravaAthlete athlete) {
  this.athlete = athlete;
  }
 
  @JsonProperty("athlete_count")
  public Integer getAthleteCount() {
  return athleteCount;
  }
 
  @JsonProperty("athlete_count")
  public void setAthleteCount(Integer athleteCount) {
  this.athleteCount = athleteCount;
  }
 
  @JsonProperty("resource_state")
  public Integer getResourceState() {
  return resourceState;
  }
 
  @JsonProperty("resource_state")
  public void setResourceState(Integer resourceState) {
  this.resourceState = resourceState;
  }
 
  @JsonProperty("max_speed")
  public Double getMaxSpeed() {
  return maxSpeed;
  }
 
  @JsonProperty("max_speed")
  public void setMaxSpeed(Double maxSpeed) {
  this.maxSpeed = maxSpeed;
  }
 
  @JsonProperty("best_efforts")
  public List<StravaBestEffort> getBestEfforts() {
  return bestEfforts;
  }
 
  @JsonProperty("best_efforts")
  public void setBestEfforts(List<StravaBestEffort> bestEfforts) {
  this.bestEfforts = bestEfforts;
  }
 
  @JsonProperty("from_accepted_tag")
  public Boolean getFromAcceptedTag() {
  return fromAcceptedTag;
  }
 
  @JsonProperty("from_accepted_tag")
  public void setFromAcceptedTag(Boolean fromAcceptedTag) {
  this.fromAcceptedTag = fromAcceptedTag;
  }
 
  @JsonProperty("start_latlng")
  public List<Double> getStartLatlng() {
  return startLatlng;
  }
 
  @JsonProperty("start_latlng")
  public void setStartLatlng(List<Double> startLatlng) {
  this.startLatlng = startLatlng;
  }
 
  @JsonProperty("achievement_count")
  public Integer getAchievementCount() {
  return achievementCount;
  }
 
  @JsonProperty("achievement_count")
  public void setAchievementCount(Integer achievementCount) {
  this.achievementCount = achievementCount;
  }
 
  @JsonProperty("prefer_perceived_exertion")
  public Boolean getPreferPerceivedExertion() {
  return preferPerceivedExertion;
  }
 
  @JsonProperty("prefer_perceived_exertion")
  public void setPreferPerceivedExertion(Boolean preferPerceivedExertion) {
  this.preferPerceivedExertion = preferPerceivedExertion;
  }
 
  @JsonProperty("name")
  public String getName() {
  return name;
  }
 
  @JsonProperty("name")
  public void setName(String name) {
  this.name = name;
  }
 
  @JsonProperty("embed_token")
  public String getEmbedToken() {
  return embedToken;
  }
 
  @JsonProperty("embed_token")
  public void setEmbedToken(String embedToken) {
  this.embedToken = embedToken;
  }
 
  @JsonProperty("commute")
  public Boolean getCommute() {
  return commute;
  }
 
  @JsonProperty("commute")
  public void setCommute(Boolean commute) {
  this.commute = commute;
  }
 
  @JsonProperty("gear")
  public StravaGear getGear() {
  return gear;
  }
 
  @JsonProperty("gear")
  public void setGear(StravaGear gear) {
  this.gear = gear;
  }
 
  @JsonProperty("utc_offset")
  public Integer getUtcOffset() {
  return utcOffset;
  }
 
  @JsonProperty("utc_offset")
  public void setUtcOffset(Integer utcOffset) {
  this.utcOffset = utcOffset;
  }
 
  @JsonProperty("average_cadence")
  public Double getAverageCadence() {
  return averageCadence;
  }
 
  @JsonProperty("average_cadence")
  public void setAverageCadence(Double averageCadence) {
  this.averageCadence = averageCadence;
  }
 
  @JsonProperty("private")
  public Boolean getPrivate() {
  return _private;
  }
 
  @JsonProperty("private")
  public void setPrivate(Boolean _private) {
  this._private = _private;
  }
 
  @JsonProperty("upload_id")
  public Long getUploadId() {
  return uploadId;
  }
 
  @JsonProperty("upload_id")
  public void setUploadId(Long uploadId) {
  this.uploadId = uploadId;
  }
 
  @JsonProperty("distance")
  public Double getDistance() {
  return distance;
  }
 
  @JsonProperty("distance")
  public void setDistance(Double distance) {
  this.distance = distance;
  }
 
  @JsonProperty("timezone")
  public String getTimezone() {
  return timezone;
  }
 
  @JsonProperty("timezone")
  public void setTimezone(String timezone) {
  this.timezone = timezone;
  }
 
  @JsonProperty("location_country")
  public String getLocationCountry() {
  return locationCountry;
  }
 
  @JsonProperty("location_country")
  public void setLocationCountry(String locationCountry) {
  this.locationCountry = locationCountry;
  }
 
  @JsonProperty("has_heartrate")
  public Boolean getHasHeartrate() {
  return hasHeartrate;
  }
 
  @JsonProperty("has_heartrate")
  public void setHasHeartrate(Boolean hasHeartrate) {
  this.hasHeartrate = hasHeartrate;
  }
 
  @JsonProperty("description")
  public String getDescription() {
  return description;
  }
 
  @JsonProperty("description")
  public void setDescription(String description) {
  this.description = description;
  }
 
  @JsonProperty("external_id")
  public String getExternalId() {
  return externalId;
  }
 
  @JsonProperty("external_id")
  public void setExternalId(String externalId) {
  this.externalId = externalId;
  }
 
  @JsonProperty("location_state")
  public Object getLocationState() {
  return locationState;
  }
 
  @JsonProperty("location_state")
  public void setLocationState(Object locationState) {
  this.locationState = locationState;
  }
 
  @JsonProperty("manual")
  public Boolean getManual() {
  return manual;
  }
 
  @JsonProperty("manual")
  public void setManual(Boolean manual) {
  this.manual = manual;
  }
 
  @JsonProperty("gear_id")
  public String getGearId() {
  return gearId;
  }
 
  @JsonProperty("gear_id")
  public void setGearId(String gearId) {
  this.gearId = gearId;
  }
 
  @JsonProperty("elev_low")
  public Double getElevLow() {
  return elevLow;
  }
 
  @JsonProperty("elev_low")
  public void setElevLow(Double elevLow) {
  this.elevLow = elevLow;
  }
 
  @JsonProperty("device_name")
  public String getDeviceName() {
  return deviceName;
  }
 
  @JsonProperty("device_name")
  public void setDeviceName(String deviceName) {
  this.deviceName = deviceName;
  }
 
  @JsonProperty("flagged")
  public Boolean getFlagged() {
  return flagged;
  }
 
  @JsonProperty("flagged")
  public void setFlagged(Boolean flagged) {
  this.flagged = flagged;
  }
 
  @JsonProperty("trainer")
  public Boolean getTrainer() {
  return trainer;
  }
 
  @JsonProperty("trainer")
  public void setTrainer(Boolean trainer) {
  this.trainer = trainer;
  }
 
  @JsonProperty("workout_type")
  public Integer getWorkoutType() {
  return workoutType;
  }
 
  @JsonProperty("workout_type")
  public void setWorkoutType(Integer workoutType) {
  this.workoutType = workoutType;
  }
 
  @JsonProperty("location_city")
  public Object getLocationCity() {
  return locationCity;
  }
 
  @JsonProperty("location_city")
  public void setLocationCity(Object locationCity) {
  this.locationCity = locationCity;
  }
 
  @JsonProperty("total_photo_count")
  public Integer getTotalPhotoCount() {
  return totalPhotoCount;
  }
 
  @JsonProperty("total_photo_count")
  public void setTotalPhotoCount(Integer totalPhotoCount) {
  this.totalPhotoCount = totalPhotoCount;
  }
 
  @JsonProperty("elapsed_time")
  public Integer getElapsedTime() {
  return elapsedTime;
  }
 
  @JsonProperty("elapsed_time")
  public void setElapsedTime(Integer elapsedTime) {
  this.elapsedTime = elapsedTime;
  }
 
  @JsonProperty("heartrate_opt_out")
  public Boolean getHeartrateOptOut() {
  return heartrateOptOut;
  }
 
  @JsonProperty("heartrate_opt_out")
  public void setHeartrateOptOut(Boolean heartrateOptOut) {
  this.heartrateOptOut = heartrateOptOut;
  }
 
  @JsonProperty("display_hide_heartrate_option")
  public Boolean getDisplayHideHeartrateOption() {
  return displayHideHeartrateOption;
  }
 
  @JsonProperty("display_hide_heartrate_option")
  public void setDisplayHideHeartrateOption(Boolean displayHideHeartrateOption) {
  this.displayHideHeartrateOption = displayHideHeartrateOption;
  }
 
  @JsonProperty("similar_activities")
  public StravaSimilarActivities getSimilarActivities() {
  return similarActivities;
  }
 
  @JsonProperty("similar_activities")
  public void setSimilarActivities(StravaSimilarActivities similarActivities) {
  this.similarActivities = similarActivities;
  }
 
  @JsonProperty("map")
  public StravaMap getMap() {
  return map;
  }
 
  @JsonProperty("map")
  public void setMap(StravaMap map) {
  this.map = map;
  }
 
  @JsonProperty("average_speed")
  public Double getAverageSpeed() {
  return averageSpeed;
  }
 
  @JsonProperty("average_speed")
  public void setAverageSpeed(Double averageSpeed) {
  this.averageSpeed = averageSpeed;
  }
 
  @JsonProperty("moving_time")
  public Integer getMovingTime() {
  return movingTime;
  }
 
  @JsonProperty("moving_time")
  public void setMovingTime(Integer movingTime) {
  this.movingTime = movingTime;
  }
 
  @JsonProperty("splits_standard")
  public List<StravaSplitsStandard> getSplitsStandard() {
  return splitsStandard;
  }
 
  @JsonProperty("splits_standard")
  public void setSplitsStandard(List<StravaSplitsStandard> splitsStandard) {
  this.splitsStandard = splitsStandard;
  }
 
  @JsonProperty("sport_type")
  public String getSportType() {
  return sportType;
  }
 
  @JsonProperty("sport_type")
  public void setSportType(String sportType) {
  this.sportType = sportType;
  }
 
  @JsonProperty("start_date")
  public String getStartDate() {
  return startDate;
  }
 
  @JsonProperty("start_date")
  public void setStartDate(String startDate) {
  this.startDate = startDate;
  }
 
  @JsonProperty("pr_count")
  public Integer getPrCount() {
  return prCount;
  }
 
  @JsonProperty("pr_count")
  public void setPrCount(Integer prCount) {
  this.prCount = prCount;
  }
 
  @JsonProperty("start_date_local")
  public String getStartDateLocal() {
  return startDateLocal;
  }
 
  @JsonProperty("start_date_local")
  public void setStartDateLocal(String startDateLocal) {
  this.startDateLocal = startDateLocal;
  }
 
  @JsonProperty("calories")
  public Integer getCalories() {
  return calories;
  }
 
  @JsonProperty("calories")
  public void setCalories(Integer calories) {
  this.calories = calories;
  }
 
  @JsonProperty("total_elevation_gain")
  public Double getTotalElevationGain() {
  return totalElevationGain;
  }
 
  @JsonProperty("total_elevation_gain")
  public void setTotalElevationGain(Double totalElevationGain) {
  this.totalElevationGain = totalElevationGain;
  }
 
  @JsonProperty("available_zones")
  public List<String> getAvailableZones() {
  return availableZones;
  }
 
  @JsonProperty("available_zones")
  public void setAvailableZones(List<String> availableZones) {
  this.availableZones = availableZones;
  }
 
  @JsonProperty("photo_count")
  public Integer getPhotoCount() {
  return photoCount;
  }
 
  @JsonProperty("photo_count")
  public void setPhotoCount(Integer photoCount) {
  this.photoCount = photoCount;
  }
 
  @JsonProperty("elev_high")
  public Double getElevHigh() {
  return elevHigh;
  }
 
  @JsonProperty("elev_high")
  public void setElevHigh(Double elevHigh) {
  this.elevHigh = elevHigh;
  }
 
  @JsonProperty("suffer_score")
  public Integer getSufferScore() {
  return sufferScore;
  }
 
  @JsonProperty("suffer_score")
  public void setSufferScore(Integer sufferScore) {
  this.sufferScore = sufferScore;
  }

  @Override
  public boolean equals(Object o) {
   if (this == o) return true;
   if (o == null || getClass() != o.getClass()) return false;
   StravaDetailedActivity that = (StravaDetailedActivity) o;
   return Objects.equals(commentCount, that.commentCount) && Objects.equals(maxHeartrate, that.maxHeartrate) && Objects.equals(perceivedExertion, that.perceivedExertion) && Objects.equals(segmentEfforts, that.segmentEfforts) && Objects.equals(hasKudoed, that.hasKudoed) && Objects.equals(laps, that.laps) && Objects.equals(type, that.type) && Objects.equals(averageHeartrate, that.averageHeartrate) && Objects.equals(photos, that.photos) && Objects.equals(statsVisibility, that.statsVisibility) && Objects.equals(endLatlng, that.endLatlng) && Objects.equals(hideFromHome, that.hideFromHome) && Objects.equals(uploadIdStr, that.uploadIdStr) && Objects.equals(splitsMetric, that.splitsMetric) && Objects.equals(id, that.id) && Objects.equals(kudosCount, that.kudosCount) && Objects.equals(visibility, that.visibility) && Objects.equals(athlete, that.athlete) && Objects.equals(athleteCount, that.athleteCount) && Objects.equals(resourceState, that.resourceState) && Objects.equals(maxSpeed, that.maxSpeed) && Objects.equals(bestEfforts, that.bestEfforts) && Objects.equals(fromAcceptedTag, that.fromAcceptedTag) && Objects.equals(startLatlng, that.startLatlng) && Objects.equals(achievementCount, that.achievementCount) && Objects.equals(preferPerceivedExertion, that.preferPerceivedExertion) && Objects.equals(name, that.name) && Objects.equals(embedToken, that.embedToken) && Objects.equals(commute, that.commute) && Objects.equals(gear, that.gear) && Objects.equals(utcOffset, that.utcOffset) && Objects.equals(averageCadence, that.averageCadence) && Objects.equals(_private, that._private) && Objects.equals(uploadId, that.uploadId) && Objects.equals(distance, that.distance) && Objects.equals(timezone, that.timezone) && Objects.equals(locationCountry, that.locationCountry) && Objects.equals(hasHeartrate, that.hasHeartrate) && Objects.equals(description, that.description) && Objects.equals(externalId, that.externalId) && Objects.equals(locationState, that.locationState) && Objects.equals(manual, that.manual) && Objects.equals(gearId, that.gearId) && Objects.equals(elevLow, that.elevLow) && Objects.equals(deviceName, that.deviceName) && Objects.equals(flagged, that.flagged) && Objects.equals(trainer, that.trainer) && Objects.equals(workoutType, that.workoutType) && Objects.equals(locationCity, that.locationCity) && Objects.equals(totalPhotoCount, that.totalPhotoCount) && Objects.equals(elapsedTime, that.elapsedTime) && Objects.equals(heartrateOptOut, that.heartrateOptOut) && Objects.equals(displayHideHeartrateOption, that.displayHideHeartrateOption) && Objects.equals(similarActivities, that.similarActivities) && Objects.equals(map, that.map) && Objects.equals(averageSpeed, that.averageSpeed) && Objects.equals(movingTime, that.movingTime) && Objects.equals(splitsStandard, that.splitsStandard) && Objects.equals(sportType, that.sportType) && Objects.equals(startDate, that.startDate) && Objects.equals(prCount, that.prCount) && Objects.equals(startDateLocal, that.startDateLocal) && Objects.equals(calories, that.calories) && Objects.equals(totalElevationGain, that.totalElevationGain) && Objects.equals(availableZones, that.availableZones) && Objects.equals(photoCount, that.photoCount) && Objects.equals(elevHigh, that.elevHigh) && Objects.equals(sufferScore, that.sufferScore);
  }

  @Override
  public int hashCode() {
   return Objects.hash(commentCount, maxHeartrate, perceivedExertion, segmentEfforts, hasKudoed, laps, type, averageHeartrate, photos, statsVisibility, endLatlng, hideFromHome, uploadIdStr, splitsMetric, id, kudosCount, visibility, athlete, athleteCount, resourceState, maxSpeed, bestEfforts, fromAcceptedTag, startLatlng, achievementCount, preferPerceivedExertion, name, embedToken, commute, gear, utcOffset, averageCadence, _private, uploadId, distance, timezone, locationCountry, hasHeartrate, description, externalId, locationState, manual, gearId, elevLow, deviceName, flagged, trainer, workoutType, locationCity, totalPhotoCount, elapsedTime, heartrateOptOut, displayHideHeartrateOption, similarActivities, map, averageSpeed, movingTime, splitsStandard, sportType, startDate, prCount, startDateLocal, calories, totalElevationGain, availableZones, photoCount, elevHigh, sufferScore);
  }

  @Override
  public String toString() {
   return "StravaDetailedActivity{" +
           "commentCount=" + commentCount +
           ", maxHeartrate=" + maxHeartrate +
           ", perceivedExertion=" + perceivedExertion +
           ", segmentEfforts=" + segmentEfforts +
           ", hasKudoed=" + hasKudoed +
           ", laps=" + laps +
           ", type='" + type + '\'' +
           ", averageHeartrate=" + averageHeartrate +
           ", photos=" + photos +
           ", statsVisibility=" + statsVisibility +
           ", endLatlng=" + endLatlng +
           ", hideFromHome=" + hideFromHome +
           ", uploadIdStr='" + uploadIdStr + '\'' +
           ", splitsMetric=" + splitsMetric +
           ", id=" + id +
           ", kudosCount=" + kudosCount +
           ", visibility='" + visibility + '\'' +
           ", athlete=" + athlete +
           ", athleteCount=" + athleteCount +
           ", resourceState=" + resourceState +
           ", maxSpeed=" + maxSpeed +
           ", bestEfforts=" + bestEfforts +
           ", fromAcceptedTag=" + fromAcceptedTag +
           ", startLatlng=" + startLatlng +
           ", achievementCount=" + achievementCount +
           ", preferPerceivedExertion=" + preferPerceivedExertion +
           ", name='" + name + '\'' +
           ", embedToken='" + embedToken + '\'' +
           ", commute=" + commute +
           ", gear=" + gear +
           ", utcOffset=" + utcOffset +
           ", averageCadence=" + averageCadence +
           ", _private=" + _private +
           ", uploadId=" + uploadId +
           ", distance=" + distance +
           ", timezone='" + timezone + '\'' +
           ", locationCountry='" + locationCountry + '\'' +
           ", hasHeartrate=" + hasHeartrate +
           ", description='" + description + '\'' +
           ", externalId='" + externalId + '\'' +
           ", locationState=" + locationState +
           ", manual=" + manual +
           ", gearId='" + gearId + '\'' +
           ", elevLow=" + elevLow +
           ", deviceName='" + deviceName + '\'' +
           ", flagged=" + flagged +
           ", trainer=" + trainer +
           ", workoutType=" + workoutType +
           ", locationCity=" + locationCity +
           ", totalPhotoCount=" + totalPhotoCount +
           ", elapsedTime=" + elapsedTime +
           ", heartrateOptOut=" + heartrateOptOut +
           ", displayHideHeartrateOption=" + displayHideHeartrateOption +
           ", similarActivities=" + similarActivities +
           ", map=" + map +
           ", averageSpeed=" + averageSpeed +
           ", movingTime=" + movingTime +
           ", splitsStandard=" + splitsStandard +
           ", sportType='" + sportType + '\'' +
           ", startDate='" + startDate + '\'' +
           ", prCount=" + prCount +
           ", startDateLocal='" + startDateLocal + '\'' +
           ", calories=" + calories +
           ", totalElevationGain=" + totalElevationGain +
           ", availableZones=" + availableZones +
           ", photoCount=" + photoCount +
           ", elevHigh=" + elevHigh +
           ", sufferScore=" + sufferScore +
           '}';
  }
 }

