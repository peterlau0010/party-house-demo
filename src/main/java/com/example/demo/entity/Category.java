package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryId;
	private String categoryChinese;
	private String categoryEnglish;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "PartyHouse_Category", joinColumns = @JoinColumn(name = "category_id"), inverseJoinColumns = @JoinColumn(name = "party_house_id"))
	private List<PartyHouse> partyHouse = new ArrayList<>();

	public Category(Long categoryId, String categoryChinese, String categoryEnglish, List<PartyHouse> partyHouse) {
		super();
		this.categoryId = categoryId;
		this.categoryChinese = categoryChinese;
		this.categoryEnglish = categoryEnglish;
		this.partyHouse = partyHouse;
	}

	public Category(Long categoryId, String categoryChinese, String categoryEnglish) {
		super();
		this.categoryId = categoryId;
		this.categoryChinese = categoryChinese;
		this.categoryEnglish = categoryEnglish;
	}

	public Category(String categoryChinese, String categoryEnglish) {
		super();
		this.categoryChinese = categoryChinese;
		this.categoryEnglish = categoryEnglish;
	}

	public Category() {
		super();
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryChinese() {
		return categoryChinese;
	}

	public void setCategoryChinese(String categoryChinese) {
		this.categoryChinese = categoryChinese;
	}

	public String getCategoryEnglish() {
		return categoryEnglish;
	}

	public void setCategoryEnglish(String categoryEnglish) {
		this.categoryEnglish = categoryEnglish;
	}

	public List<PartyHouse> getPartyHouse() {
		return partyHouse;
	}

	public void setPartyHouse(List<PartyHouse> partyHouse) {
		this.partyHouse = partyHouse;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryChinese=" + categoryChinese + ", categoryEnglish="
				+ categoryEnglish + ", partyHouse=" + partyHouse + "]";
	}



	

	
}
