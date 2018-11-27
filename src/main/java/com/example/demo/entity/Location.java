package com.example.demo.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Location {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long locationId;
	private String locationChinese;
    private String locationEnglish;
    
    @OneToMany(mappedBy="location",fetch = FetchType.EAGER,cascade=CascadeType.MERGE)
    private Set<PartyHouse> partyHouse;
    
	public Long getLocationId() {
		return locationId;
	}
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
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
	public Location(Long locationId, String locationChinese, String locationEnglish) {
		super();
		this.locationId = locationId;
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
		return "Location [locationId=" + locationId + ", locationChinese=" + locationChinese + ", locationEnglish="
				+ locationEnglish + "]";
	}
	public Location() {
		super();
	}
	
    
    
	
}
