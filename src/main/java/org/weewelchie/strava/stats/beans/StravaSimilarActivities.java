package org.weewelchie.strava.stats.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "max_average_speed",
        "trend",
        "resource_state",
        "pr_rank",
        "frequency_milestone",
        "effort_count",
        "average_speed",
        "min_average_speed",
        "mid_average_speed"
})

public class StravaSimilarActivities implements Serializable
{

    @JsonProperty("max_average_speed")
    private Double maxAverageSpeed;
    @JsonProperty("trend")
    private StravaTrend trend;
    @JsonProperty("resource_state")
    private Integer resourceState;
    @JsonProperty("pr_rank")
    private Object prRank;
    @JsonProperty("frequency_milestone")
    private Object frequencyMilestone;
    @JsonProperty("effort_count")
    private Integer effortCount;
    @JsonProperty("average_speed")
    private Double averageSpeed;
    @JsonProperty("min_average_speed")
    private Double minAverageSpeed;
    @JsonProperty("mid_average_speed")
    private Double midAverageSpeed;
    private final static long serialVersionUID = 9211464182757966039L;

    @JsonProperty("max_average_speed")
    public Double getMaxAverageSpeed() {
        return maxAverageSpeed;
    }

    @JsonProperty("max_average_speed")
    public void setMaxAverageSpeed(Double maxAverageSpeed) {
        this.maxAverageSpeed = maxAverageSpeed;
    }

    @JsonProperty("trend")
    public StravaTrend getTrend() {
        return trend;
    }

    @JsonProperty("trend")
    public void setTrend(StravaTrend trend) {
        this.trend = trend;
    }

    @JsonProperty("resource_state")
    public Integer getResourceState() {
        return resourceState;
    }

    @JsonProperty("resource_state")
    public void setResourceState(Integer resourceState) {
        this.resourceState = resourceState;
    }

    @JsonProperty("pr_rank")
    public Object getPrRank() {
        return prRank;
    }

    @JsonProperty("pr_rank")
    public void setPrRank(Object prRank) {
        this.prRank = prRank;
    }

    @JsonProperty("frequency_milestone")
    public Object getFrequencyMilestone() {
        return frequencyMilestone;
    }

    @JsonProperty("frequency_milestone")
    public void setFrequencyMilestone(Object frequencyMilestone) {
        this.frequencyMilestone = frequencyMilestone;
    }

    @JsonProperty("effort_count")
    public Integer getEffortCount() {
        return effortCount;
    }

    @JsonProperty("effort_count")
    public void setEffortCount(Integer effortCount) {
        this.effortCount = effortCount;
    }

    @JsonProperty("average_speed")
    public Double getAverageSpeed() {
        return averageSpeed;
    }

    @JsonProperty("average_speed")
    public void setAverageSpeed(Double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    @JsonProperty("min_average_speed")
    public Double getMinAverageSpeed() {
        return minAverageSpeed;
    }

    @JsonProperty("min_average_speed")
    public void setMinAverageSpeed(Double minAverageSpeed) {
        this.minAverageSpeed = minAverageSpeed;
    }

    @JsonProperty("mid_average_speed")
    public Double getMidAverageSpeed() {
        return midAverageSpeed;
    }

    @JsonProperty("mid_average_speed")
    public void setMidAverageSpeed(Double midAverageSpeed) {
        this.midAverageSpeed = midAverageSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StravaSimilarActivities that = (StravaSimilarActivities) o;
        return Objects.equals(maxAverageSpeed, that.maxAverageSpeed) && Objects.equals(trend, that.trend) && Objects.equals(resourceState, that.resourceState) && Objects.equals(prRank, that.prRank) && Objects.equals(frequencyMilestone, that.frequencyMilestone) && Objects.equals(effortCount, that.effortCount) && Objects.equals(averageSpeed, that.averageSpeed) && Objects.equals(minAverageSpeed, that.minAverageSpeed) && Objects.equals(midAverageSpeed, that.midAverageSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxAverageSpeed, trend, resourceState, prRank, frequencyMilestone, effortCount, averageSpeed, minAverageSpeed, midAverageSpeed);
    }

    @Override
    public String toString() {
        return "StravaSimilarActivities{" +
                "maxAverageSpeed=" + maxAverageSpeed +
                ", trend=" + trend +
                ", resourceState=" + resourceState +
                ", prRank=" + prRank +
                ", frequencyMilestone=" + frequencyMilestone +
                ", effortCount=" + effortCount +
                ", averageSpeed=" + averageSpeed +
                ", minAverageSpeed=" + minAverageSpeed +
                ", midAverageSpeed=" + midAverageSpeed +
                '}';
    }
}