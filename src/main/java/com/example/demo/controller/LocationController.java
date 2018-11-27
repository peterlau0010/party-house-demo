package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Location;
import com.example.demo.repository.LocationRepository;

@RestController
public class LocationController {

	@Autowired
	private LocationRepository locationRepository;

	@RequestMapping(value = "/readLocation", method = RequestMethod.GET)
	public List<Location> retrieveAllLocations(@RequestParam(value = "LocationID", required = false) Long LocationID,
			@RequestParam(value = "LocationChinese", required = false) String LocationChinese,
			@RequestParam(value = "LocationEnglish", required = false) String LocationEnglish) {

		if (LocationID != null) {
			return locationRepository.findByLocationId(LocationID);
		} else if (LocationChinese != null) {
			return locationRepository.findByLocationChinese(LocationChinese);
		} else if (LocationEnglish != null) {
			return locationRepository.findByLocationEnglish(LocationEnglish);
		}

		return (List<Location>) locationRepository.findAll();

	}

}
