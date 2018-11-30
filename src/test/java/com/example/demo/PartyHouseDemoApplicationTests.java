package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.configuration.SwaggerConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes= {SwaggerConfiguration.class})
public class PartyHouseDemoApplicationTests {
	
	private static final Logger log = LogManager.getLogger(PartyHouseDemoApplicationTests.class);
	@Test
	public void contextLoads() {
		log.info("JUnit Test Sample");
	}
}
