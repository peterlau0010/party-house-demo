package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class PartyHouse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long partyHouseId;
	private String partyHouseNameChinese;
	private String partyHouseNameEnglish;
	private String addressChinese;
	private String addressEnglish;
	private String openingHour;

	@JsonBackReference
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinTable(name = "PartyHouseCategory", joinColumns = @JoinColumn(name = "category_id", referencedColumnName = "partyHouseId"), inverseJoinColumns = @JoinColumn(name = "party_house_id", referencedColumnName = "categoryId"))
	private List<Category> category = new ArrayList<>();

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(name = "location_id", nullable = false, referencedColumnName = "locationId")
	private Location location;

	public Long getPartyHouseId() {
		return partyHouseId;
	}

	public void setPartyHouseId(Long partyHouseId) {
		this.partyHouseId = partyHouseId;
	}

	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}

	public Long getPartyHouseID() {
		return partyHouseId;
	}

	public void setPartyHouseID(Long partyHouseId) {
		this.partyHouseId = partyHouseId;
	}

	public String getPartyHouseNameChinese() {
		return partyHouseNameChinese;
	}

	public void setPartyHouseNameChinese(String partyHouseNameChinese) {
		this.partyHouseNameChinese = partyHouseNameChinese;
	}

	public String getPartyHouseNameEnglish() {
		return partyHouseNameEnglish;
	}

	public void setPartyHouseNameEnglish(String partyHouseNameEnglish) {
		this.partyHouseNameEnglish = partyHouseNameEnglish;
	}

	public String getAddressChinese() {
		return addressChinese;
	}

	public void setAddressChinese(String addressChinese) {
		this.addressChinese = addressChinese;
	}

	public String getAddressEnglish() {
		return addressEnglish;
	}

	public void setAddressEnglish(String addressEnglish) {
		this.addressEnglish = addressEnglish;
	}

	public String getOpeningHour() {
		return openingHour;
	}

	public void setOpeningHour(String openingHour) {
		this.openingHour = openingHour;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public PartyHouse() {
		super();
	}

	public PartyHouse(String partyHouseNameChinese, String partyHouseNameEnglish, String addressChinese,
			String addressEnglish, String openingHour, List<Category> category, Location location) {
		super();
		this.partyHouseNameChinese = partyHouseNameChinese;
		this.partyHouseNameEnglish = partyHouseNameEnglish;
		this.addressChinese = addressChinese;
		this.addressEnglish = addressEnglish;
		this.openingHour = openingHour;
		this.category = category;
		this.location = location;
	}

	public PartyHouse(Long partyHouseId, String partyHouseNameChinese, String partyHouseNameEnglish,
			String addressChinese, String addressEnglish, String openingHour, List<Category> category,
			Location location) {
		super();
		this.partyHouseId = partyHouseId;
		this.partyHouseNameChinese = partyHouseNameChinese;
		this.partyHouseNameEnglish = partyHouseNameEnglish;
		this.addressChinese = addressChinese;
		this.addressEnglish = addressEnglish;
		this.openingHour = openingHour;
		this.category = category;
		this.location = location;
	}

	@Override
	public String toString() {
		return "PartyHouse [partyHouseId=" + partyHouseId + ", partyHouseNameChinese=" + partyHouseNameChinese
				+ ", partyHouseNameEnglish=" + partyHouseNameEnglish + ", addressChinese=" + addressChinese
				+ ", addressEnglish=" + addressEnglish + ", openingHour=" + openingHour + ", category=" + category
				+ ", location=" + location + "]";
	}



}
