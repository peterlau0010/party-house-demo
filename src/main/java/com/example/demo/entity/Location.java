package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long locationID;
	private String locationChinese;
    private String locationEnglish;
	public Long getLocationID() {
		return locationID;
	}
	public void setLocationID(Long locationID) {
		this.locationID = locationID;
	}
	public String getLocationChinese() {
		return locationChinese;
	}
	public void setLocationChinese(String locationChinese) {
		this.locationChinese = locationChinese;
	}
	public String getLocationEnglish() {
		return locationEnglish;
	}
	public void setLocationEnglish(String locationEnglish) {
		this.locationEnglish = locationEnglish;
	}
	public Location(Long locationID, String locationChinese, String locationEnglish) {
		super();
		this.locationID = locationID;
		this.locationChinese = locationChinese;
		this.locationEnglish = locationEnglish;
	}
	public Location(String locationChinese, String locationEnglish) {
		super();
		this.locationChinese = locationChinese;
		this.locationEnglish = locationEnglish;
	}
	@Override
	public String toString() {
		return "Location [locationID=" + locationID + ", locationChinese=" + locationChinese + ", locationEnglish="
				+ locationEnglish + "]";
	}
	public Location() {
		super();
	}
	
    
    
	
}
