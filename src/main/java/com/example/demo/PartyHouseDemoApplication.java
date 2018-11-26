package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Location;
import com.example.demo.repository.LocationRepository;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class PartyHouseDemoApplication {
	
	private static final Logger log = LoggerFactory.getLogger(PartyHouseDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PartyHouseDemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(LocationRepository repository) {
		return (args) -> {
			
			// save a couple of Location
			repository.save(new Location("荃灣", "Tsuen Wan"));
			repository.save(new Location("青衣", "Tsing Yi"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Location location : repository.findAll()) {
				log.info(location.toString());
			}
			log.info("");

			repository.findById(1L)
				.ifPresent(location -> {
					log.info("Location found with findById(1L):");
					log.info("--------------------------------");
					log.info(location.toString());
					log.info("");
				});

			log.info("Location found with findByLocationChinese('荃灣'):");
			log.info("--------------------------------------------");
			repository.findByLocationChinese("荃灣").forEach(location -> {
				log.info(location.toString());
			});
			log.info("");
		};
	}
}
