package org.weewelchie.strava.stats.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "summary_polyline",
        "resource_state",
        "id",
        "polyline"
})
public class StravaMap implements Serializable
{

    @JsonProperty("summary_polyline")
    private String summaryPolyline;
    @JsonProperty("resource_state")
    private Integer resourceState;
    @JsonProperty("id")
    private String id;
    @JsonProperty("polyline")
    private String polyline;
    private final static long serialVersionUID = 6938174430635601101L;

    @JsonProperty("summary_polyline")
    public String getSummaryPolyline() {
        return summaryPolyline;
    }

    @JsonProperty("summary_polyline")
    public void setSummaryPolyline(String summaryPolyline) {
        this.summaryPolyline = summaryPolyline;
    }

    @JsonProperty("resource_state")
    public Integer getResourceState() {
        return resourceState;
    }

    @JsonProperty("resource_state")
    public void setResourceState(Integer resourceState) {
        this.resourceState = resourceState;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("polyline")
    public String getPolyline() {
        return polyline;
    }

    @JsonProperty("polyline")
    public void setPolyline(String polyline) {
        this.polyline = polyline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StravaMap stravaMap = (StravaMap) o;
        return Objects.equals(summaryPolyline, stravaMap.summaryPolyline) && Objects.equals(resourceState, stravaMap.resourceState) && Objects.equals(id, stravaMap.id) && Objects.equals(polyline, stravaMap.polyline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(summaryPolyline, resourceState, id, polyline);
    }

    @Override
    public String toString() {
        return "StravaMap{" +
                "summaryPolyline='" + summaryPolyline + '\'' +
                ", resourceState=" + resourceState +
                ", id='" + id + '\'' +
                ", polyline='" + polyline + '\'' +
                '}';
    }
}