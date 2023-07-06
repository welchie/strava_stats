package org.weewelchie.strava.stats.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "mid_speed",
        "current_activity_index",
        "max_speed",
        "speeds",
        "min_speed",
        "direction"
})

public class StravaTrend implements Serializable
{

    @JsonProperty("mid_speed")
    private Double midSpeed;
    @JsonProperty("current_activity_index")
    private Integer currentActivityIndex;
    @JsonProperty("max_speed")
    private Double maxSpeed;
    @JsonProperty("speeds")
    private List<Double> speeds;
    @JsonProperty("min_speed")
    private Double minSpeed;
    @JsonProperty("direction")
    private Integer direction;
    private final static long serialVersionUID = -1031511655105129265L;

    @JsonProperty("mid_speed")
    public Double getMidSpeed() {
        return midSpeed;
    }

    @JsonProperty("mid_speed")
    public void setMidSpeed(Double midSpeed) {
        this.midSpeed = midSpeed;
    }

    @JsonProperty("current_activity_index")
    public Integer getCurrentActivityIndex() {
        return currentActivityIndex;
    }

    @JsonProperty("current_activity_index")
    public void setCurrentActivityIndex(Integer currentActivityIndex) {
        this.currentActivityIndex = currentActivityIndex;
    }

    @JsonProperty("max_speed")
    public Double getMaxSpeed() {
        return maxSpeed;
    }

    @JsonProperty("max_speed")
    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @JsonProperty("speeds")
    public List<Double> getSpeeds() {
        return speeds;
    }

    @JsonProperty("speeds")
    public void setSpeeds(List<Double> speeds) {
        this.speeds = speeds;
    }

    @JsonProperty("min_speed")
    public Double getMinSpeed() {
        return minSpeed;
    }

    @JsonProperty("min_speed")
    public void setMinSpeed(Double minSpeed) {
        this.minSpeed = minSpeed;
    }

    @JsonProperty("direction")
    public Integer getDirection() {
        return direction;
    }

    @JsonProperty("direction")
    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StravaTrend that = (StravaTrend) o;
        return Objects.equals(midSpeed, that.midSpeed) && Objects.equals(currentActivityIndex, that.currentActivityIndex) && Objects.equals(maxSpeed, that.maxSpeed) && Objects.equals(speeds, that.speeds) && Objects.equals(minSpeed, that.minSpeed) && Objects.equals(direction, that.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(midSpeed, currentActivityIndex, maxSpeed, speeds, minSpeed, direction);
    }

    @Override
    public String toString() {
        return "StravaTrend{" +
                "midSpeed=" + midSpeed +
                ", currentActivityIndex=" + currentActivityIndex +
                ", maxSpeed=" + maxSpeed +
                ", speeds=" + speeds +
                ", minSpeed=" + minSpeed +
                ", direction=" + direction +
                '}';
    }
}