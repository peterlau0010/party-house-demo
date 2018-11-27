package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Location;
import com.example.demo.entity.PartyHouse;

public interface PartyHouseRepository extends CrudRepository<PartyHouse, Long> {
	
	@Query( value= "select * from Party_House where location_Id = ?1" , nativeQuery = true)
	List<PartyHouse> findByLocation(Long locationID);
	
	List<PartyHouse> findByPartyHouseNameChinese(String partyHouseNameChinese);
	
	List<PartyHouse> findByPartyHouseNameEnglish(String partyHouseNameEnglish);
	
	
	
}
