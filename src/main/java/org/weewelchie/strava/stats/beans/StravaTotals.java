package org.weewelchie.strava.stats.beans;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "distance",
        "achievement_count",
        "count",
        "elapsed_time",
        "elevation_gain",
        "moving_time"
})

public class StravaTotals implements Serializable {

    @JsonProperty("distance")
    private Double distance;

    @JsonProperty("achievement_count")
    private Integer achievementCount;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("elapsed_time")
    private Integer elapsedTime;
    @JsonProperty("elevation_gain")
    private Double elevationGain;
    @JsonProperty("moving_time")
    private Integer movingTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @JsonProperty("achievement_count")
    public Integer getAchievementCount() {
        return achievementCount;
    }

    @JsonProperty("achievement_count")
    public void setAchievementCount(Integer achievementCount) {
        this.achievementCount = achievementCount;
    }
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("elapsed_time")
    public Integer getElapsedTime() {
        return elapsedTime;
    }

    @JsonProperty("elapsed_time")
    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    @JsonProperty("elevation_gain")
    public Double getElevationGain() {
        return elevationGain;
    }

    @JsonProperty("elevation_gain")
    public void setElevationGain(Double elevationGain) {
        this.elevationGain = elevationGain;
    }

    @JsonProperty("moving_time")
    public Integer getMovingTime() {
        return movingTime;
    }

    @JsonProperty("moving_time")
    public void setMovingTime(Integer movingTime) {
        this.movingTime = movingTime;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StravaTotals that = (StravaTotals) o;
        return Objects.equals(distance, that.distance) && Objects.equals(achievementCount, that.achievementCount) && Objects.equals(count, that.count) && Objects.equals(elapsedTime, that.elapsedTime) && Objects.equals(elevationGain, that.elevationGain) && Objects.equals(movingTime, that.movingTime) && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(distance, achievementCount, count, elapsedTime, elevationGain, movingTime, additionalProperties);
    }

    @Override
    public String toString() {
        return "StravaTotals{" +
                "distance=" + distance +
                ", achievementCount=" + achievementCount +
                ", count=" + count +
                ", elapsedTime=" + elapsedTime +
                ", elevationGain=" + elevationGain +
                ", movingTime=" + movingTime +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}