package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Location;
import com.example.demo.entity.PartyHouse;
import com.example.demo.repository.LocationRepository;
import com.example.demo.repository.PartyHouseRepository;

@SpringBootApplication
public class PartyHouseDemoApplication {
	
	private static final Logger log = LoggerFactory.getLogger(PartyHouseDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PartyHouseDemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(LocationRepository locationRepository, PartyHouseRepository partyHouseRepository) {
		return (args) -> {
			
			// save a couple of Location
			Location tsingyi = new Location("青衣", "Tsing Yi");
			Location tsuenwan = new Location("荃灣", "Tsuen Wan");
			locationRepository.save(tsuenwan);
			locationRepository.save(tsingyi);
			partyHouseRepository.save(new PartyHouse("派對屋","PartyHouse","長康","Cheung Hong","9:00~12:00",tsingyi));
			partyHouseRepository.save(new PartyHouse("派對屋","PartyHouse","長康","Cheung Hong","9:00~12:00",tsingyi));
			partyHouseRepository.save(new PartyHouse("派對屋","PartyHouse","綠楊","Green Yeung","9:00~12:00",tsuenwan));
			partyHouseRepository.save(new PartyHouse("派對屋","PartyHouse","綠楊","Green Yeung","9:00~12:00",tsuenwan));
			
			

			// fetch all Location
			log.info("Location found with findAll():");
			log.info("-------------------------------");
			for (Location location : locationRepository.findAll()) {
				log.info(location.toString());
			}
			
			log.info("PartyHouse found with findAll():");
			log.info("-------------------------------");
			for (PartyHouse partyHouse : partyHouseRepository.findAll()) {
				log.info(partyHouse.toString());
			}

		};
	}
}
