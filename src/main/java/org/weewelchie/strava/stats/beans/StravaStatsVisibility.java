package org.weewelchie.strava.stats.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "visibility",
        "type"
})

public class StravaStatsVisibility implements Serializable
{

    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("type")
    private String type;
    private final static long serialVersionUID = -8958695186856637308L;

    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StravaStatsVisibility that = (StravaStatsVisibility) o;
        return Objects.equals(visibility, that.visibility) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(visibility, type);
    }

    @Override
    public String toString() {
        return "StravaStatsVisibility{" +
                "visibility='" + visibility + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}