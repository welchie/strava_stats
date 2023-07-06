package org.weewelchie.strava.stats.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "distance",
        "resource_state",
        "name",
        "nickname",
        "converted_distance",
        "retired",
        "id",
        "primary"
})

public class StravaGear implements Serializable
{

    @JsonProperty("distance")
    private Integer distance;
    @JsonProperty("resource_state")
    private Integer resourceState;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nickname")
    private Object nickname;
    @JsonProperty("converted_distance")
    private Double convertedDistance;
    @JsonProperty("retired")
    private Boolean retired;
    @JsonProperty("id")
    private String id;
    @JsonProperty("primary")
    private Boolean primary;
    private final static long serialVersionUID = -7021199355962765919L;

    @JsonProperty("distance")
    public Integer getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @JsonProperty("resource_state")
    public Integer getResourceState() {
        return resourceState;
    }

    @JsonProperty("resource_state")
    public void setResourceState(Integer resourceState) {
        this.resourceState = resourceState;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("nickname")
    public Object getNickname() {
        return nickname;
    }

    @JsonProperty("nickname")
    public void setNickname(Object nickname) {
        this.nickname = nickname;
    }

    @JsonProperty("converted_distance")
    public Double getConvertedDistance() {
        return convertedDistance;
    }

    @JsonProperty("converted_distance")
    public void setConvertedDistance(Double convertedDistance) {
        this.convertedDistance = convertedDistance;
    }

    @JsonProperty("retired")
    public Boolean getRetired() {
        return retired;
    }

    @JsonProperty("retired")
    public void setRetired(Boolean retired) {
        this.retired = retired;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("primary")
    public Boolean getPrimary() {
        return primary;
    }

    @JsonProperty("primary")
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StravaGear that = (StravaGear) o;
        return Objects.equals(distance, that.distance) && Objects.equals(resourceState, that.resourceState) && Objects.equals(name, that.name) && Objects.equals(nickname, that.nickname) && Objects.equals(convertedDistance, that.convertedDistance) && Objects.equals(retired, that.retired) && Objects.equals(id, that.id) && Objects.equals(primary, that.primary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(distance, resourceState, name, nickname, convertedDistance, retired, id, primary);
    }

    @Override
    public String toString() {
        return "StravaGear{" +
                "distance=" + distance +
                ", resourceState=" + resourceState +
                ", name='" + name + '\'' +
                ", nickname=" + nickname +
                ", convertedDistance=" + convertedDistance +
                ", retired=" + retired +
                ", id='" + id + '\'' +
                ", primary=" + primary +
                '}';
    }
}