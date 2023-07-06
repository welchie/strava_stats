package org.weewelchie.strava.stats.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "pace_zone",
        "average_grade_adjusted_speed",
        "split",
        "distance",
        "elapsed_time",
        "elevation_difference",
        "average_speed",
        "average_heartrate",
        "moving_time"
})
public class StravaSplitsStandard implements Serializable
{

    @JsonProperty("pace_zone")
    private Integer paceZone;
    @JsonProperty("average_grade_adjusted_speed")
    private Double averageGradeAdjustedSpeed;
    @JsonProperty("split")
    private Integer split;
    @JsonProperty("distance")
    private Integer distance;
    @JsonProperty("elapsed_time")
    private Integer elapsedTime;
    @JsonProperty("elevation_difference")
    private Double elevationDifference;
    @JsonProperty("average_speed")
    private Double averageSpeed;
    @JsonProperty("average_heartrate")
    private Double averageHeartrate;
    @JsonProperty("moving_time")
    private Integer movingTime;
    private final static long serialVersionUID = -4586364571282187L;

    @JsonProperty("pace_zone")
    public Integer getPaceZone() {
        return paceZone;
    }

    @JsonProperty("pace_zone")
    public void setPaceZone(Integer paceZone) {
        this.paceZone = paceZone;
    }

    @JsonProperty("average_grade_adjusted_speed")
    public Double getAverageGradeAdjustedSpeed() {
        return averageGradeAdjustedSpeed;
    }

    @JsonProperty("average_grade_adjusted_speed")
    public void setAverageGradeAdjustedSpeed(Double averageGradeAdjustedSpeed) {
        this.averageGradeAdjustedSpeed = averageGradeAdjustedSpeed;
    }

    @JsonProperty("split")
    public Integer getSplit() {
        return split;
    }

    @JsonProperty("split")
    public void setSplit(Integer split) {
        this.split = split;
    }

    @JsonProperty("distance")
    public Integer getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @JsonProperty("elapsed_time")
    public Integer getElapsedTime() {
        return elapsedTime;
    }

    @JsonProperty("elapsed_time")
    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    @JsonProperty("elevation_difference")
    public Double getElevationDifference() {
        return elevationDifference;
    }

    @JsonProperty("elevation_difference")
    public void setElevationDifference(Double elevationDifference) {
        this.elevationDifference = elevationDifference;
    }

    @JsonProperty("average_speed")
    public Double getAverageSpeed() {
        return averageSpeed;
    }

    @JsonProperty("average_speed")
    public void setAverageSpeed(Double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    @JsonProperty("average_heartrate")
    public Double getAverageHeartrate() {
        return averageHeartrate;
    }

    @JsonProperty("average_heartrate")
    public void setAverageHeartrate(Double averageHeartrate) {
        this.averageHeartrate = averageHeartrate;
    }

    @JsonProperty("moving_time")
    public Integer getMovingTime() {
        return movingTime;
    }

    @JsonProperty("moving_time")
    public void setMovingTime(Integer movingTime) {
        this.movingTime = movingTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StravaSplitsStandard that = (StravaSplitsStandard) o;
        return Objects.equals(paceZone, that.paceZone) && Objects.equals(averageGradeAdjustedSpeed, that.averageGradeAdjustedSpeed) && Objects.equals(split, that.split) && Objects.equals(distance, that.distance) && Objects.equals(elapsedTime, that.elapsedTime) && Objects.equals(elevationDifference, that.elevationDifference) && Objects.equals(averageSpeed, that.averageSpeed) && Objects.equals(averageHeartrate, that.averageHeartrate) && Objects.equals(movingTime, that.movingTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paceZone, averageGradeAdjustedSpeed, split, distance, elapsedTime, elevationDifference, averageSpeed, averageHeartrate, movingTime);
    }

    @Override
    public String toString() {
        return "StravaSplitsStandard{" +
                "paceZone=" + paceZone +
                ", averageGradeAdjustedSpeed=" + averageGradeAdjustedSpeed +
                ", split=" + split +
                ", distance=" + distance +
                ", elapsedTime=" + elapsedTime +
                ", elevationDifference=" + elevationDifference +
                ", averageSpeed=" + averageSpeed +
                ", averageHeartrate=" + averageHeartrate +
                ", movingTime=" + movingTime +
                '}';
    }
}