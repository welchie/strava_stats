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
        "country",
        "private",
        "distance",
        "average_grade",
        "maximum_grade",
        "climb_category",
        "city",
        "resource_state",
        "hazardous",
        "elevation_high",
        "elevation_profile",
        "start_latlng",
        "elevation_low",
        "starred",
        "end_latlng",
        "activity_type",
        "name",
        "id",
        "state"
})

public class StravaSegment implements Serializable
{

    @JsonProperty("country")
    private String country;
    @JsonProperty("private")
    private Boolean _private;
    @JsonProperty("distance")
    private Double distance;
    @JsonProperty("average_grade")
    private Double averageGrade;
    @JsonProperty("maximum_grade")
    private Double maximumGrade;
    @JsonProperty("climb_category")
    private Integer climbCategory;
    @JsonProperty("city")
    private String city;
    @JsonProperty("resource_state")
    private Integer resourceState;
    @JsonProperty("hazardous")
    private Boolean hazardous;
    @JsonProperty("elevation_high")
    private Double elevationHigh;
    @JsonProperty("elevation_profile")
    private Object elevationProfile;
    @JsonProperty("start_latlng")
    private List<Double> startLatlng;
    @JsonProperty("elevation_low")
    private Double elevationLow;
    @JsonProperty("starred")
    private Boolean starred;
    @JsonProperty("end_latlng")
    private List<Double> endLatlng;
    @JsonProperty("activity_type")
    private String activityType;
    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("state")
    private String state;
    private final static long serialVersionUID = -8989118761176595773L;

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    @JsonProperty("private")
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @JsonProperty("average_grade")
    public Double getAverageGrade() {
        return averageGrade;
    }

    @JsonProperty("average_grade")
    public void setAverageGrade(Double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @JsonProperty("maximum_grade")
    public Double getMaximumGrade() {
        return maximumGrade;
    }

    @JsonProperty("maximum_grade")
    public void setMaximumGrade(Double maximumGrade) {
        this.maximumGrade = maximumGrade;
    }

    @JsonProperty("climb_category")
    public Integer getClimbCategory() {
        return climbCategory;
    }

    @JsonProperty("climb_category")
    public void setClimbCategory(Integer climbCategory) {
        this.climbCategory = climbCategory;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("resource_state")
    public Integer getResourceState() {
        return resourceState;
    }

    @JsonProperty("resource_state")
    public void setResourceState(Integer resourceState) {
        this.resourceState = resourceState;
    }

    @JsonProperty("hazardous")
    public Boolean getHazardous() {
        return hazardous;
    }

    @JsonProperty("hazardous")
    public void setHazardous(Boolean hazardous) {
        this.hazardous = hazardous;
    }

    @JsonProperty("elevation_high")
    public Double getElevationHigh() {
        return elevationHigh;
    }

    @JsonProperty("elevation_high")
    public void setElevationHigh(Double elevationHigh) {
        this.elevationHigh = elevationHigh;
    }

    @JsonProperty("elevation_profile")
    public Object getElevationProfile() {
        return elevationProfile;
    }

    @JsonProperty("elevation_profile")
    public void setElevationProfile(Object elevationProfile) {
        this.elevationProfile = elevationProfile;
    }

    @JsonProperty("start_latlng")
    public List<Double> getStartLatlng() {
        return startLatlng;
    }

    @JsonProperty("start_latlng")
    public void setStartLatlng(List<Double> startLatlng) {
        this.startLatlng = startLatlng;
    }

    @JsonProperty("elevation_low")
    public Double getElevationLow() {
        return elevationLow;
    }

    @JsonProperty("elevation_low")
    public void setElevationLow(Double elevationLow) {
        this.elevationLow = elevationLow;
    }

    @JsonProperty("starred")
    public Boolean getStarred() {
        return starred;
    }

    @JsonProperty("starred")
    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    @JsonProperty("end_latlng")
    public List<Double> getEndLatlng() {
        return endLatlng;
    }

    @JsonProperty("end_latlng")
    public void setEndLatlng(List<Double> endLatlng) {
        this.endLatlng = endLatlng;
    }

    @JsonProperty("activity_type")
    public String getActivityType() {
        return activityType;
    }

    @JsonProperty("activity_type")
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StravaSegment that = (StravaSegment) o;
        return Objects.equals(country, that.country) && Objects.equals(_private, that._private) && Objects.equals(distance, that.distance) && Objects.equals(averageGrade, that.averageGrade) && Objects.equals(maximumGrade, that.maximumGrade) && Objects.equals(climbCategory, that.climbCategory) && Objects.equals(city, that.city) && Objects.equals(resourceState, that.resourceState) && Objects.equals(hazardous, that.hazardous) && Objects.equals(elevationHigh, that.elevationHigh) && Objects.equals(elevationProfile, that.elevationProfile) && Objects.equals(startLatlng, that.startLatlng) && Objects.equals(elevationLow, that.elevationLow) && Objects.equals(starred, that.starred) && Objects.equals(endLatlng, that.endLatlng) && Objects.equals(activityType, that.activityType) && Objects.equals(name, that.name) && Objects.equals(id, that.id) && Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, _private, distance, averageGrade, maximumGrade, climbCategory, city, resourceState, hazardous, elevationHigh, elevationProfile, startLatlng, elevationLow, starred, endLatlng, activityType, name, id, state);
    }

    @Override
    public String toString() {
        return "StravaSegment{" +
                "country='" + country + '\'' +
                ", _private=" + _private +
                ", distance=" + distance +
                ", averageGrade=" + averageGrade +
                ", maximumGrade=" + maximumGrade +
                ", climbCategory=" + climbCategory +
                ", city='" + city + '\'' +
                ", resourceState=" + resourceState +
                ", hazardous=" + hazardous +
                ", elevationHigh=" + elevationHigh +
                ", elevationProfile=" + elevationProfile +
                ", startLatlng=" + startLatlng +
                ", elevationLow=" + elevationLow +
                ", starred=" + starred +
                ", endLatlng=" + endLatlng +
                ", activityType='" + activityType + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", state='" + state + '\'' +
                '}';
    }
}