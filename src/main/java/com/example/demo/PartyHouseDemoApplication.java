package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class PartyHouseDemoApplication {
	
//	private static final Logger log = LogManager.getLogger(PartyHouseDemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(PartyHouseDemoApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner demo(LocationRepository locationRepository, PartyHouseRepository partyHouseRepository, CategoryRepository categoryRepository) {
//		return (args) -> {
//			
//			// save a couple of Location
//			Location tsingyi = new Location("青衣", "Tsing Yi");
//			Location tsuenwan = new Location("荃灣", "Tsuen Wan");
//			
//			locationRepository.save(tsuenwan);
//			locationRepository.save(tsingyi);
//			
//			Category simple = new Category("簡約","Simple");
//			Category cartoon = new Category("卡通","Cartoon");
//			Category singK = new Category("唱K","SingK");
//			
//			categoryRepository.save(simple);
//			categoryRepository.save(cartoon);
//			categoryRepository.save(singK);
//			
//			
//			partyHouseRepository.save(new PartyHouse("派對屋1","PartyHouse1","長康","Cheung Hong","9:00~12:00",Arrays.asList(simple,cartoon,singK), tsingyi));
//			partyHouseRepository.save(new PartyHouse("派對屋2","PartyHouse2","長康","Cheung Hong","9:00~12:00",Arrays.asList(simple),tsingyi));
//			partyHouseRepository.save(new PartyHouse("派對屋3","PartyHouse3","綠楊","Green Yeung","9:00~12:00",Arrays.asList(simple,cartoon),tsuenwan));
//			partyHouseRepository.save(new PartyHouse("派對屋4","PartyHouse4","綠楊","Green Yeung","9:00~12:00",Arrays.asList(simple,singK),tsuenwan));
//			
//			
//
//			// fetch all Location
//			log.info("Location found with findAll():");
//			for (Location location : locationRepository.findAll()) {
//				log.info(location.toString());
//			}
//			log.info("-------------------------------");
//			log.info("Category found with findAll():");
//			for (Category category : categoryRepository.findAll()) {
//				log.info(category.toString());
//			}
//			log.info("-------------------------------");
//			log.info("PartyHouse found with findAll():");
//			for (PartyHouse partyHouse : partyHouseRepository.findAll()) {
//				log.info(partyHouse.toString());
//			}
//			log.info("-------------------------------");
//			log.info("PartyHouse found with findByLocation_locationId(1L):");
//			log.info("-------------------------------");
//			for (PartyHouse partyHouse : partyHouseRepository.findByLocation_locationId(1L)) {
//				log.info(partyHouse.toString());
//			}
//			log.info("-------------------------------");
//			log.info("PartyHouse found with findByLocation_locationIdOrderByPartyHouseIdAsc(1L):");
//			log.info("-------------------------------");
//			for (PartyHouse partyHouse : partyHouseRepository.findByLocation_locationIdOrderByPartyHouseIdAsc(1L)) {
//				log.info(partyHouse.toString());
//			}
//			log.info("-------------------------------");
//			log.info("PartyHouse found with findByLocation_locationIdOrderByPartyHouseIdDesc(1L):");
//			log.info("-------------------------------");
//			for (PartyHouse partyHouse : partyHouseRepository.findByLocation_locationIdOrderByPartyHouseIdDesc(1L)) {
//				log.info(partyHouse.toString());
//			}
//			log.info("-------------------------------");
//			log.info("PartyHouse found with findByCategory_categoryId(2L):");
//			for (PartyHouse partyHouse : partyHouseRepository.findByCategory_categoryId(2L)) {
//				log.info(partyHouse.toString());
//			}
//
//		};
//	}
}
