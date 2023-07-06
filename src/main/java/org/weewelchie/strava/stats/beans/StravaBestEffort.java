package org.weewelchie.strava.stats.beans;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "achievements",
        "activity",
        "distance",
        "athlete",
        "resource_state",
        "start_date_local",
        "end_index",
        "start_index",
        "name",
        "elapsed_time",
        "id",
        "pr_rank",
        "moving_time",
        "start_date"
})

public class StravaBestEffort implements Serializable
{

    @JsonProperty("achievements")
    private List<StravaAchievement> achievements;
    @JsonProperty("activity")
    private StravaActivity activity;
    @JsonProperty("distance")
    private Integer distance;
    @JsonProperty("athlete")
    private StravaAthlete athlete;
    @JsonProperty("resource_state")
    private Integer resourceState;
    @JsonProperty("start_date_local")
    private String startDateLocal;
    @JsonProperty("end_index")
    private Integer endIndex;
    @JsonProperty("start_index")
    private Integer startIndex;
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
    private final static long serialVersionUID = 5856011820426195577L;

    @JsonProperty("achievements")
    public List<StravaAchievement> getAchievements() {
        return achievements;
    }

    @JsonProperty("achievements")
    public void setAchievements(List<StravaAchievement> achievements) {
        this.achievements = achievements;
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
    public Integer getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Integer distance) {
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
        StravaBestEffort that = (StravaBestEffort) o;
        return Objects.equals(achievements, that.achievements) && Objects.equals(activity, that.activity) && Objects.equals(distance, that.distance) && Objects.equals(athlete, that.athlete) && Objects.equals(resourceState, that.resourceState) && Objects.equals(startDateLocal, that.startDateLocal) && Objects.equals(endIndex, that.endIndex) && Objects.equals(startIndex, that.startIndex) && Objects.equals(name, that.name) && Objects.equals(elapsedTime, that.elapsedTime) && Objects.equals(id, that.id) && Objects.equals(prRank, that.prRank) && Objects.equals(movingTime, that.movingTime) && Objects.equals(startDate, that.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(achievements, activity, distance, athlete, resourceState, startDateLocal, endIndex, startIndex, name, elapsedTime, id, prRank, movingTime, startDate);
    }

    @Override
    public String toString() {
        return "StravaBestEffort{" +
                "achievements=" + achievements +
                ", activity=" + activity +
                ", distance=" + distance +
                ", athlete=" + athlete +
                ", resourceState=" + resourceState +
                ", startDateLocal='" + startDateLocal + '\'' +
                ", endIndex=" + endIndex +
                ", startIndex=" + startIndex +
                ", name='" + name + '\'' +
                ", elapsedTime=" + elapsedTime +
                ", id=" + id +
                ", prRank=" + prRank +
                ", movingTime=" + movingTime +
                ", startDate='" + startDate + '\'' +
                '}';
    }
}