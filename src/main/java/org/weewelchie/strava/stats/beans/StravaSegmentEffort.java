package org.weewelchie.strava.stats.beans;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "average_cadence",
        "achievements",
        "kom_rank",
        "activity",
        "distance",
        "hidden",
        "athlete",
        "max_heartrate",
        "resource_state",
        "start_date_local",
        "end_index",
        "device_watts",
        "average_heartrate",
        "start_index",
        "segment",
        "name",
        "elapsed_time",
        "id",
        "pr_rank",
        "moving_time",
        "start_date"
})

public class StravaSegmentEffort implements Serializable
{

    @JsonProperty("average_cadence")
    private Double averageCadence;
    @JsonProperty("achievements")
    private List<StravaAchievement> achievements;
    @JsonProperty("kom_rank")
    private Object komRank;
    @JsonProperty("activity")
    private StravaActivity activity;
    @JsonProperty("distance")
    private Double distance;
    @JsonProperty("hidden")
    private Boolean hidden;
    @JsonProperty("athlete")
    private StravaAthlete athlete;
    @JsonProperty("max_heartrate")
    private Integer maxHeartrate;
    @JsonProperty("resource_state")
    private Integer resourceState;
    @JsonProperty("start_date_local")
    private String startDateLocal;
    @JsonProperty("end_index")
    private Integer endIndex;
    @JsonProperty("device_watts")
    private Boolean deviceWatts;
    @JsonProperty("average_heartrate")
    private Double averageHeartrate;
    @JsonProperty("start_index")
    private Integer startIndex;
    @JsonProperty("segment")
    private StravaSegment segment;
    @JsonProperty("name")
    private String name;
    @JsonProperty("elapsed_time")
    private Integer elapsedTime;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("pr_rank")
    private Object prRank;
    @JsonProperty("moving_time")
    private Integer movingTime;
    @JsonProperty("start_date")
    private String startDate;
    private final static long serialVersionUID = 2338139530702314315L;

    @JsonProperty("average_cadence")
    public Double getAverageCadence() {
        return averageCadence;
    }

    @JsonProperty("average_cadence")
    public void setAverageCadence(Double averageCadence) {
        this.averageCadence = averageCadence;
    }

    @JsonProperty("achievements")
    public List<StravaAchievement> getAchievements() {
        return achievements;
    }

    @JsonProperty("achievements")
    public void setAchievements(List<StravaAchievement> achievements) {
        this.achievements = achievements;
    }

    @JsonProperty("kom_rank")
    public Object getKomRank() {
        return komRank;
    }

    @JsonProperty("kom_rank")
    public void setKomRank(Object komRank) {
        this.komRank = komRank;
    }

    @JsonProperty("activity")
    public StravaActivity getActivity() {
        return activity;
    }

    @JsonProperty("activity")
    public void setActivity(StravaActivity activity) {
        this.activity = activity;
    }

    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @JsonProperty("hidden")
    public Boolean getHidden() {
        return hidden;
    }

    @JsonProperty("hidden")
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    @JsonProperty("athlete")
    public StravaAthlete getAthlete() {
        return athlete;
    }

    @JsonProperty("athlete")
    public void setAthlete(StravaAthlete athlete) {
        this.athlete = athlete;
    }

    @JsonProperty("max_heartrate")
    public Integer getMaxHeartrate() {
        return maxHeartrate;
    }

    @JsonProperty("max_heartrate")
    public void setMaxHeartrate(Integer maxHeartrate) {
        this.maxHeartrate = maxHeartrate;
    }

    @JsonProperty("resource_state")
    public Integer getResourceState() {
        return resourceState;
    }

    @JsonProperty("resource_state")
    public void setResourceState(Integer resourceState) {
        this.resourceState = resourceState;
    }

    @JsonProperty("start_date_local")
    public String getStartDateLocal() {
        return startDateLocal;
    }

    @JsonProperty("start_date_local")
    public void setStartDateLocal(String startDateLocal) {
        this.startDateLocal = startDateLocal;
    }

    @JsonProperty("end_index")
    public Integer getEndIndex() {
        return endIndex;
    }

    @JsonProperty("end_index")
    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }

    @JsonProperty("device_watts")
    public Boolean getDeviceWatts() {
        return deviceWatts;
    }

    @JsonProperty("device_watts")
    public void setDeviceWatts(Boolean deviceWatts) {
        this.deviceWatts = deviceWatts;
    }

    @JsonProperty("average_heartrate")
    public Double getAverageHeartrate() {
        return averageHeartrate;
    }

    @JsonProperty("average_heartrate")
    public void setAverageHeartrate(Double averageHeartrate) {
        this.averageHeartrate = averageHeartrate;
    }

    @JsonProperty("start_index")
    public Integer getStartIndex() {
        return startIndex;
    }

    @JsonProperty("start_index")
    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    @JsonProperty("segment")
    public StravaSegment getSegment() {
        return segment;
    }

    @JsonProperty("segment")
    public void setSegment(StravaSegment segment) {
        this.segment = segment;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("elapsed_time")
    public Integer getElapsedTime() {
        return elapsedTime;
    }

    @JsonProperty("elapsed_time")
    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("pr_rank")
    public Object getPrRank() {
        return prRank;
    }

    @JsonProperty("pr_rank")
    public void setPrRank(Object prRank) {
        this.prRank = prRank;
    }

    @JsonProperty("moving_time")
    public Integer getMovingTime() {
        return movingTime;
    }

    @JsonProperty("moving_time")
    public void setMovingTime(Integer movingTime) {
        this.movingTime = movingTime;
    }

    @JsonProperty("start_date")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StravaSegmentEffort that = (StravaSegmentEffort) o;
        return Objects.equals(averageCadence, that.averageCadence) && Objects.equals(achievements, that.achievements) && Objects.equals(komRank, that.komRank) && Objects.equals(activity, that.activity) && Objects.equals(distance, that.distance) && Objects.equals(hidden, that.hidden) && Objects.equals(athlete, that.athlete) && Objects.equals(maxHeartrate, that.maxHeartrate) && Objects.equals(resourceState, that.resourceState) && Objects.equals(startDateLocal, that.startDateLocal) && Objects.equals(endIndex, that.endIndex) && Objects.equals(deviceWatts, that.deviceWatts) && Objects.equals(averageHeartrate, that.averageHeartrate) && Objects.equals(startIndex, that.startIndex) && Objects.equals(segment, that.segment) && Objects.equals(name, that.name) && Objects.equals(elapsedTime, that.elapsedTime) && Objects.equals(id, that.id) && Objects.equals(prRank, that.prRank) && Objects.equals(movingTime, that.movingTime) && Objects.equals(startDate, that.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(averageCadence, achievements, komRank, activity, distance, hidden, athlete, maxHeartrate, resourceState, startDateLocal, endIndex, deviceWatts, averageHeartrate, startIndex, segment, name, elapsedTime, id, prRank, movingTime, startDate);
    }

    @Override
    public String toString() {
        return "StravaSegmentEffort{" +
                "averageCadence=" + averageCadence +
                ", achievements=" + achievements +
                ", komRank=" + komRank +
                ", activity=" + activity +
                ", distance=" + distance +
                ", hidden=" + hidden +
                ", athlete=" + athlete +
                ", maxHeartrate=" + maxHeartrate +
                ", resourceState=" + resourceState +
                ", startDateLocal='" + startDateLocal + '\'' +
                ", endIndex=" + endIndex +
                ", deviceWatts=" + deviceWatts +
                ", averageHeartrate=" + averageHeartrate +
                ", startIndex=" + startIndex +
                ", segment=" + segment +
                ", name='" + name + '\'' +
                ", elapsedTime=" + elapsedTime +
                ", id=" + id +
                ", prRank=" + prRank +
                ", movingTime=" + movingTime +
                ", startDate='" + startDate + '\'' +
                '}';
    }
}