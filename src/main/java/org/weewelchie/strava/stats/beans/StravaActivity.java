package org.weewelchie.strava.stats.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "resource_state",
        "id"
})

public class StravaActivity implements Serializable
{

    @JsonProperty("resource_state")
    private Integer resourceState;
    @JsonProperty("id")
    private Long id;
    private final static long serialVersionUID = 56406209833565289L;

    @JsonProperty("resource_state")
    public Integer getResourceState() {
        return resourceState;
    }

    @JsonProperty("resource_state")
    public void setResourceState(Integer resourceState) {
        this.resourceState = resourceState;
    }

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StravaActivity that = (StravaActivity) o;
        return Objects.equals(resourceState, that.resourceState) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceState, id);
    }

    @Override
    public String toString() {
        return "StravaActivity{" +
                "resourceState=" + resourceState +
                ", id=" + id +
                '}';
    }
}