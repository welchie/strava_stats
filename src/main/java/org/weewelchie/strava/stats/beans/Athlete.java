package org.weewelchie.strava.stats.beans;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "country",
        "profile_medium",
        "firstname",
        "follower",
        "city",
        "resource_state",
        "sex",
        "profile",
        "bio",
        "created_at",
        "weight",
        "summit",
        "lastname",
        "premium",
        "updated_at",
        "badge_type_id",
        "friend",
        "id",
        "state",
        "username"
})

public class Athlete implements Serializable {

    @JsonProperty("country")
    private String country;
    @JsonProperty("profile_medium")
    private String profileMedium;
    @JsonProperty("firstname")
    private String firstname;
    @JsonProperty("follower")
    private Object follower;
    @JsonProperty("city")
    private String city;
    @JsonProperty("resource_state")
    private Integer resourceState;
    @JsonProperty("sex")
    private String sex;
    @JsonProperty("profile")
    private String profile;
    @JsonProperty("bio")
    private String bio;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("weight")
    private Double weight;
    @JsonProperty("summit")
    private Boolean summit;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("premium")
    private Boolean premium;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("badge_type_id")
    private Integer badgeTypeId;
    @JsonProperty("friend")
    private Object friend;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("state")
    private String state;
    @JsonProperty("username")
    private Object username;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("profile_medium")
    public String getProfileMedium() {
        return profileMedium;
    }

    @JsonProperty("profile_medium")
    public void setProfileMedium(String profileMedium) {
        this.profileMedium = profileMedium;
    }

    @JsonProperty("firstname")
    public String getFirstname() {
        return firstname;
    }

    @JsonProperty("firstname")
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @JsonProperty("follower")
    public Object getFollower() {
        return follower;
    }

    @JsonProperty("follower")
    public void setFollower(Object follower) {
        this.follower = follower;
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

    @JsonProperty("sex")
    public String getSex() {
        return sex;
    }

    @JsonProperty("sex")
    public void setSex(String sex) {
        this.sex = sex;
    }

    @JsonProperty("profile")
    public String getProfile() {
        return profile;
    }

    @JsonProperty("profile")
    public void setProfile(String profile) {
        this.profile = profile;
    }

    @JsonProperty("bio")
    public String getBio() {
        return bio;
    }

    @JsonProperty("bio")
    public void setBio(String bio) {
        this.bio = bio;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("weight")
    public Double getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @JsonProperty("summit")
    public Boolean getSummit() {
        return summit;
    }

    @JsonProperty("summit")
    public void setSummit(Boolean summit) {
        this.summit = summit;
    }

    @JsonProperty("lastname")
    public String getLastname() {
        return lastname;
    }

    @JsonProperty("lastname")
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @JsonProperty("premium")
    public Boolean getPremium() {
        return premium;
    }

    @JsonProperty("premium")
    public void setPremium(Boolean premium) {
        this.premium = premium;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("badge_type_id")
    public Integer getBadgeTypeId() {
        return badgeTypeId;
    }

    @JsonProperty("badge_type_id")
    public void setBadgeTypeId(Integer badgeTypeId) {
        this.badgeTypeId = badgeTypeId;
    }

    @JsonProperty("friend")
    public Object getFriend() {
        return friend;
    }

    @JsonProperty("friend")
    public void setFriend(Object friend) {
        this.friend = friend;
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

    @JsonProperty("username")
    public Object getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(Object username) {
        this.username = username;
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
        Athlete that = (Athlete) o;
        return Objects.equals(country, that.country) && Objects.equals(profileMedium, that.profileMedium) && Objects.equals(firstname, that.firstname) && Objects.equals(follower, that.follower) && Objects.equals(city, that.city) && Objects.equals(resourceState, that.resourceState) && Objects.equals(sex, that.sex) && Objects.equals(profile, that.profile) && Objects.equals(bio, that.bio) && Objects.equals(createdAt, that.createdAt) && Objects.equals(weight, that.weight) && Objects.equals(summit, that.summit) && Objects.equals(lastname, that.lastname) && Objects.equals(premium, that.premium) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(badgeTypeId, that.badgeTypeId) && Objects.equals(friend, that.friend) && Objects.equals(id, that.id) && Objects.equals(state, that.state) && Objects.equals(username, that.username) && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, profileMedium, firstname, follower, city, resourceState, sex, profile, bio, createdAt, weight, summit, lastname, premium, updatedAt, badgeTypeId, friend, id, state, username, additionalProperties);
    }

    @Override
    public String toString() {
        return "StravaAthlete{" +
                "country='" + country + '\'' +
                ", profileMedium='" + profileMedium + '\'' +
                ", firstname='" + firstname + '\'' +
                ", follower=" + follower +
                ", city='" + city + '\'' +
                ", resourceState=" + resourceState +
                ", sex='" + sex + '\'' +
                ", profile='" + profile + '\'' +
                ", bio='" + bio + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", weight=" + weight +
                ", summit=" + summit +
                ", lastname='" + lastname + '\'' +
                ", premium=" + premium +
                ", updatedAt='" + updatedAt + '\'' +
                ", badgeTypeId=" + badgeTypeId +
                ", friend=" + friend +
                ", id=" + id +
                ", state='" + state + '\'' +
                ", username=" + username +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}