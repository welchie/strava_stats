package org.weewelchie.strava.stats.beans;

import java.io.Serializable;


public class StravaData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String desc;
	private Long id;
	private Double distance;
	private Double movingTime;
	private String type;
	
	public StravaData(Long id, String name, String desc, Double distance, Double movingTime, String type)
	{
		this.setName(name);
		this.setDesc(desc);
		this.setId(id);
		this.setDistance(distance);
		this.setMovingTime(movingTime);
		this.setType(type);
	}

	public StravaData() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Double getMovingTime() {
		return movingTime;
	}

	public void setMovingTime(Double movingTime) {
		this.movingTime = movingTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "StravaData [name=" + name + ", desc=" + desc + ", id=" + id + ", distance=" + distance + ", movingTime="
				+ movingTime + ", type=" + type + "]";
	}
}
