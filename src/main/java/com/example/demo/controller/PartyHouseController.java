package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PartyHouse;
import com.example.demo.repository.PartyHouseRepository;

@RestController
public class PartyHouseController {

	
	@Autowired
	private PartyHouseRepository partyHouseRepository;

	@RequestMapping(value = "/readPartyHouse", method = RequestMethod.GET)
	public List<PartyHouse> retrieveAllLocations(
			@RequestParam(value = "PartyHouseNameChinese", required = false) String partyHouseNameChinese,
			@RequestParam(value = "PartyHouseNameEnglish", required = false) String partyHouseNameEnglish,
			@RequestParam(value = "LocationID", required = false) Long locationID) {

		List<PartyHouse> result = null;
		
		if (partyHouseNameChinese != null) {
			result = partyHouseRepository.findByPartyHouseNameChineseContaining(partyHouseNameChinese);
		} else if (partyHouseNameEnglish != null) {
			result = partyHouseRepository.findByPartyHouseNameEnglishContaining(partyHouseNameEnglish);
		} else if (locationID != null) {
			result = partyHouseRepository.findByLocation_locationId(locationID);
		}else {
			result = (List<PartyHouse>) partyHouseRepository.findAll();
		}
		
		
		return result;

	}
}
