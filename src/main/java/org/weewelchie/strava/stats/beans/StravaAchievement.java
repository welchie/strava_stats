package org.weewelchie.strava.stats.beans;

import java.io.Serializable;
import java.util.Objects;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type_id",
        "rank",
        "type",
        "effort_count"
})

public class StravaAchievement implements Serializable
{

    @JsonProperty("type_id")
    private Integer typeId;
    @JsonProperty("rank")
    private Integer rank;
    @JsonProperty("type")
    private String type;
    @JsonProperty("effort_count")
    private Integer effortCount;
    private final static long serialVersionUID = -3037881894383021373L;

    @JsonProperty("type_id")
    public Integer getTypeId() {
        return typeId;
    }

    @JsonProperty("type_id")
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @JsonProperty("rank")
    public Integer getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("effort_count")
    public Integer getEffortCount() {
        return effortCount;
    }

    @JsonProperty("effort_count")
    public void setEffortCount(Integer effortCount) {
        this.effortCount = effortCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StravaAchievement that = (StravaAchievement) o;
        return Objects.equals(typeId, that.typeId) && Objects.equals(rank, that.rank) && Objects.equals(type, that.type) && Objects.equals(effortCount, that.effortCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeId, rank, type, effortCount);
    }

    @Override
    public String toString() {
        return "StravaAchievement{" +
                "typeId=" + typeId +
                ", rank=" + rank +
                ", type='" + type + '\'' +
                ", effortCount=" + effortCount +
                '}';
    }
}