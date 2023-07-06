package org.weewelchie.strava.stats.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "count",
        "primary"
})

public class StravaPhotos implements Serializable
{

    @JsonProperty("count")
    private Integer count;
    @JsonProperty("primary")
    private Object primary;
    private final static long serialVersionUID = 1151426602303466603L;

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("primary")
    public Object getPrimary() {
        return primary;
    }

    @JsonProperty("primary")
    public void setPrimary(Object primary) {
        this.primary = primary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StravaPhotos that = (StravaPhotos) o;
        return Objects.equals(count, that.count) && Objects.equals(primary, that.primary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, primary);
    }

    @Override
    public String
    toString() {
        return "StravaPhotos{" +
                "count=" + count +
                ", primary=" + primary +
                '}';
    }
}