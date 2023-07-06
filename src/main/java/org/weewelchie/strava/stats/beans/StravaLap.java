package org.weewelchie.strava.stats.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "pace_zone",
        "average_cadence",
        "activity",
        "distance",
        "athlete",
        "max_heartrate",
        "resource_state",
        "start_date_local",
        "end_index",
        "max_speed",
        "device_watts",
        "total_elevation_gain",
        "lap_index",
        "average_heartrate",
        "split",
        "start_index",
        "name",
        "elapsed_time",
        "id",
        "average_speed",
        "moving_time",
        "start_date"
})

public class StravaLap implements Serializable
{

    @JsonProperty("pace_zone")
    private Integer paceZone;
    @JsonProperty("average_cadence")
    private Double averageCadence;
    @JsonProperty("activity")
    private StravaActivity activity;
    @JsonProperty("distance")
    private Double distance;
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
    @JsonProperty("max_speed")
    private Double maxSpeed;
    @JsonProperty("device_watts")
    private Boolean deviceWatts;
    @JsonProperty("total_elevation_gain")
    private Double totalElevationGain;
    @JsonProperty("lap_index")
    private Integer lapIndex;
    @JsonProperty("average_heartrate")
    private Double averageHeartrate;
    @JsonProperty("split")
    private Integer split;
    @JsonProperty("start_index")
    private Integer startIndex;
    @JsonProperty("name")
    private String name;
    @JsonProperty("elapsed_time")
    private Integer elapsedTime;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("average_speed")
    private Double averageSpeed;
    @JsonProperty("moving_time")
    private Integer movingTime;
    @JsonProperty("start_date")
    private String startDate;
    private final static long serialVersionUID = -1670133699755760572L;

    @JsonProperty("pace_zone")
    public Integer getPaceZone() {
        return paceZone;
    }

    @JsonProperty("pace_zone")
    public void setPaceZone(Integer paceZone) {
        this.paceZone = paceZone;
    }

    @JsonProperty("average_cadence")
    public Double getAverageCadence() {
        return averageCadence;
    }

    @JsonProperty("average_cadence")
    public void setAverageCadence(Double averageCadence) {
        this.averageCadence = averageCadence;
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

    @JsonProperty("max_speed")
    public Double getMaxSpeed() {
        return maxSpeed;
    }

    @JsonProperty("max_speed")
    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @JsonProperty("device_watts")
    public Boolean getDeviceWatts() {
        return deviceWatts;
    }

    @JsonProperty("device_watts")
    public void setDeviceWatts(Boolean deviceWatts) {
        this.deviceWatts = deviceWatts;
    }

    @JsonProperty("total_elevation_gain")
    public Double getTotalElevationGain() {
        return totalElevationGain;
    }

    @JsonProperty("total_elevation_gain")
    public void setTotalElevationGain(Double totalElevationGain) {
        this.totalElevationGain = totalElevationGain;
    }

    @JsonProperty("lap_index")
    public Integer getLapIndex() {
        return lapIndex;
    }

    @JsonProperty("lap_index")
    public void setLapIndex(Integer lapIndex) {
        this.lapIndex = lapIndex;
    }

    @JsonProperty("average_heartrate")
    public Double getAverageHeartrate() {
        return averageHeartrate;
    }

    @JsonProperty("average_heartrate")
    public void setAverageHeartrate(Double averageHeartrate) {
        this.averageHeartrate = averageHeartrate;
    }

    @JsonProperty("split")
    public Integer getSplit() {
        return split;
    }

    @JsonProperty("split")
    public void setSplit(Integer split) {
        this.split = split;
    }

    @JsonProperty("start_index")
    public Integer getStartIndex() {
        return startIndex;
    }

    @JsonProperty("start_index")
    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
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
        StravaLap stravaLap = (StravaLap) o;
        return Objects.equals(paceZone, stravaLap.paceZone) && Objects.equals(averageCadence, stravaLap.averageCadence) && Objects.equals(activity, stravaLap.activity) && Objects.equals(distance, stravaLap.distance) && Objects.equals(athlete, stravaLap.athlete) && Objects.equals(maxHeartrate, stravaLap.maxHeartrate) && Objects.equals(resourceState, stravaLap.resourceState) && Objects.equals(startDateLocal, stravaLap.startDateLocal) && Objects.equals(endIndex, stravaLap.endIndex) && Objects.equals(maxSpeed, stravaLap.maxSpeed) && Objects.equals(deviceWatts, stravaLap.deviceWatts) && Objects.equals(totalElevationGain, stravaLap.totalElevationGain) && Objects.equals(lapIndex, stravaLap.lapIndex) && Objects.equals(averageHeartrate, stravaLap.averageHeartrate) && Objects.equals(split, stravaLap.split) && Objects.equals(startIndex, stravaLap.startIndex) && Objects.equals(name, stravaLap.name) && Objects.equals(elapsedTime, stravaLap.elapsedTime) && Objects.equals(id, stravaLap.id) && Objects.equals(averageSpeed, stravaLap.averageSpeed) && Objects.equals(movingTime, stravaLap.movingTime) && Objects.equals(startDate, stravaLap.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paceZone, averageCadence, activity, distance, athlete, maxHeartrate, resourceState, startDateLocal, endIndex, maxSpeed, deviceWatts, totalElevationGain, lapIndex, averageHeartrate, split, startIndex, name, elapsedTime, id, averageSpeed, movingTime, startDate);
    }

    @Override
    public String toString() {
        return "StravaLap{" +
                "paceZone=" + paceZone +
                ", averageCadence=" + averageCadence +
                ", activity=" + activity +
                ", distance=" + distance +
                ", athlete=" + athlete +
                ", maxHeartrate=" + maxHeartrate +
                ", resourceState=" + resourceState +
                ", startDateLocal='" + startDateLocal + '\'' +
                ", endIndex=" + endIndex +
                ", maxSpeed=" + maxSpeed +
                ", deviceWatts=" + deviceWatts +
                ", totalElevationGain=" + totalElevationGain +
                ", lapIndex=" + lapIndex +
                ", averageHeartrate=" + averageHeartrate +
                ", split=" + split +
                ", startIndex=" + startIndex +
                ", name='" + name + '\'' +
                ", elapsedTime=" + elapsedTime +
                ", id=" + id +
                ", averageSpeed=" + averageSpeed +
                ", movingTime=" + movingTime +
                ", startDate='" + startDate + '\'' +
                '}';
    }
}