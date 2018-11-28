package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.PartyHouse;

public interface PartyHouseRepository extends CrudRepository<PartyHouse, Long> {

	//Query By LocationID
	List<PartyHouse> findByLocation_locationId(Long locationId);
	
	List<PartyHouse> findByLocation_locationIdOrderByPartyHouseIdAsc(Long locationId);
	
	List<PartyHouse> findByLocation_locationIdOrderByPartyHouseIdDesc(Long locationId);
	
	List<PartyHouse> findByLocation_locationIdOrderByPartyHouseNameChineseAsc(Long locationId);
	
	List<PartyHouse> findByLocation_locationIdOrderByPartyHouseNameChineseDesc(Long locationId);
	
	List<PartyHouse> findByLocation_locationIdOrderByPartyHouseNameEnglishAsc(Long locationId);
	
	List<PartyHouse> findByLocation_locationIdOrderByPartyHouseNameEnglishDesc(Long locationId);
	
	//Query By CategoryID
	List<PartyHouse> findByCategory_categoryId(Long categoryId);
	
	List<PartyHouse> findByCategory_categoryIdOrderByPartyHouseIdAsc(Long categoryId);
	
	List<PartyHouse> findByCategory_categoryIdOrderByPartyHouseIdDesc(Long categoryId);
	
	List<PartyHouse> findByCategory_categoryIdOrderByPartyHouseNameChineseAsc(Long categoryId);
	
	List<PartyHouse> findByCategory_categoryIdOrderByPartyHouseNameChineseDesc(Long categoryId);
	
	List<PartyHouse> findByCategory_categoryIdOrderByPartyHouseNameEnglishAsc(Long categoryId);
	
	List<PartyHouse> findByCategory_categoryIdOrderByPartyHouseNameEnglishDesc(Long categoryId);
	
	//Query By PartyHouseId
	List<PartyHouse> findByPartyHouseId(Long partyhouseId);	

	//Query By PartyHouseChinese
	List<PartyHouse> findByPartyHouseNameChineseContaining(String partyHouseNameChinese);

	//Query By PartyHouseEnglish
	List<PartyHouse> findByPartyHouseNameEnglishContaining(String partyHouseNameEnglish);

	

}
