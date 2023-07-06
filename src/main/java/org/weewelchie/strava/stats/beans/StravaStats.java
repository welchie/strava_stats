package org.weewelchie.strava.stats.beans;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "recent_run_totals",
        "all_run_totals",
        "recent_swim_totals",
        "biggest_ride_distance",
        "all_swim_totals",
        "ytd_swim_totals",
        "recent_ride_totals",
        "biggest_climb_elevation_gain",
        "all_ride_totals",
        "ytd_ride_totals",
        "ytd_run_totals"
})

public class StravaStats implements Serializable {

    @JsonProperty("recent_run_totals")
    private StravaTotals recentRunTotals;
    @JsonProperty("all_run_totals")
    private StravaTotals allRunTotals;
    @JsonProperty("recent_swim_totals")
    private StravaTotals recentSwimTotals;
    @JsonProperty("biggest_ride_distance")
    private Double biggestRideDistance;
    @JsonProperty("all_swim_totals")
    private StravaTotals allSwimTotals;
    @JsonProperty("ytd_swim_totals")
    private StravaTotals ytdSwimTotals;
    @JsonProperty("recent_ride_totals")
    private StravaTotals recentRideTotals;
    @JsonProperty("biggest_climb_elevation_gain")
    private Double biggestClimbElevationGain;
    @JsonProperty("all_ride_totals")
    private StravaTotals allRideTotals;
    @JsonProperty("ytd_ride_totals")
    private StravaTotals ytdRideTotals;
    @JsonProperty("ytd_run_totals")
    private StravaTotals ytdRunTotals;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("recent_run_totals")
    public StravaTotals getRecentRunTotals() {
        return recentRunTotals;
    }

    @JsonProperty("recent_run_totals")
    public void setRecentRunTotals(StravaTotals recentRunTotals) {
        this.recentRunTotals = recentRunTotals;
    }

    @JsonProperty("all_run_totals")
    public StravaTotals getAllRunTotals() {
        return allRunTotals;
    }

    @JsonProperty("all_run_totals")
    public void setAllRunTotals(StravaTotals allRunTotals) {
        this.allRunTotals = allRunTotals;
    }

    @JsonProperty("recent_swim_totals")
    public StravaTotals getRecentSwimTotals() {
        return recentSwimTotals;
    }

    @JsonProperty("recent_swim_totals")
    public void setRecentSwimTotals(StravaTotals recentSwimTotals) {
        this.recentSwimTotals = recentSwimTotals;
    }

    @JsonProperty("biggest_ride_distance")
    public Double getBiggestRideDistance() {
        return biggestRideDistance;
    }

    @JsonProperty("biggest_ride_distance")
    public void setBiggestRideDistance(Double biggestRideDistance) {
        this.biggestRideDistance = biggestRideDistance;
    }

    @JsonProperty("all_swim_totals")
    public StravaTotals getAllSwimTotals() {
        return allSwimTotals;
    }

    @JsonProperty("all_swim_totals")
    public void setAllSwimTotals(StravaTotals allSwimTotals) {
        this.allSwimTotals = allSwimTotals;
    }

    @JsonProperty("ytd_swim_totals")
    public StravaTotals getYtdSwimTotals() {
        return ytdSwimTotals;
    }

    @JsonProperty("ytd_swim_totals")
    public void setYtdSwimTotals(StravaTotals ytdSwimTotals) {
        this.ytdSwimTotals = ytdSwimTotals;
    }

    @JsonProperty("recent_ride_totals")
    public StravaTotals getRecentRideTotals() {
        return recentRideTotals;
    }

    @JsonProperty("recent_ride_totals")
    public void setRecentRideTotals(StravaTotals recentRideTotals) {
        this.recentRideTotals = recentRideTotals;
    }

    @JsonProperty("biggest_climb_elevation_gain")
    public Double getBiggestClimbElevationGain() {
        return biggestClimbElevationGain;
    }

    @JsonProperty("biggest_climb_elevation_gain")
    public void setBiggestClimbElevationGain(Double biggestClimbElevationGain) {
        this.biggestClimbElevationGain = biggestClimbElevationGain;
    }

    @JsonProperty("all_ride_totals")
    public StravaTotals getAllRideTotals() {
        return allRideTotals;
    }

    @JsonProperty("all_ride_totals")
    public void setAllRideTotals(StravaTotals allRideTotals) {
        this.allRideTotals = allRideTotals;
    }

    @JsonProperty("ytd_ride_totals")
    public StravaTotals getYtdRideTotals() {
        return ytdRideTotals;
    }

    @JsonProperty("ytd_ride_totals")
    public void setYtdRideTotals(StravaTotals ytdRideTotals) {
        this.ytdRideTotals = ytdRideTotals;
    }

    @JsonProperty("ytd_run_totals")
    public StravaTotals getYtdRunTotals() {
        return ytdRunTotals;
    }

    @JsonProperty("ytd_run_totals")
    public void setYtdRunTotals(StravaTotals ytdRunTotals) {
        this.ytdRunTotals = ytdRunTotals;
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
        StravaStats that = (StravaStats) o;
        return Objects.equals(recentRunTotals, that.recentRunTotals) && Objects.equals(allRunTotals, that.allRunTotals) && Objects.equals(recentSwimTotals, that.recentSwimTotals) && Objects.equals(biggestRideDistance, that.biggestRideDistance) && Objects.equals(allSwimTotals, that.allSwimTotals) && Objects.equals(ytdSwimTotals, that.ytdSwimTotals) && Objects.equals(recentRideTotals, that.recentRideTotals) && Objects.equals(biggestClimbElevationGain, that.biggestClimbElevationGain) && Objects.equals(allRideTotals, that.allRideTotals) && Objects.equals(ytdRideTotals, that.ytdRideTotals) && Objects.equals(ytdRunTotals, that.ytdRunTotals) && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recentRunTotals, allRunTotals, recentSwimTotals, biggestRideDistance, allSwimTotals, ytdSwimTotals, recentRideTotals, biggestClimbElevationGain, allRideTotals, ytdRideTotals, ytdRunTotals, additionalProperties);
    }

    @Override
    public String toString() {
        return "StravaStats{" +
                "recentRunTotals=" + recentRunTotals +
                ", allRunTotals=" + allRunTotals +
                ", recentSwimTotals=" + recentSwimTotals +
                ", biggestRideDistance=" + biggestRideDistance +
                ", allSwimTotals=" + allSwimTotals +
                ", ytdSwimTotals=" + ytdSwimTotals +
                ", recentRideTotals=" + recentRideTotals +
                ", biggestClimbElevationGain=" + biggestClimbElevationGain +
                ", allRideTotals=" + allRideTotals +
                ", ytdRideTotals=" + ytdRideTotals +
                ", ytdRunTotals=" + ytdRunTotals +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
