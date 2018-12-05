package com.example.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.configuration.Log4J2Configuration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class IndexController {
	
	
	@RequestMapping("/")
    public String index() {
		Log4J2Configuration.logger.info("Index Page Called");
		Log4J2Configuration.logger.debug("This is a debug message");
		Log4J2Configuration.logger.info("This is an info message");
		Log4J2Configuration.logger.warn("This is a warn message");
		Log4J2Configuration.logger.error("This is an error message");
		Log4J2Configuration.logger.fatal("This is a fatal message");
        return "Greetings from Spring Boot!";
    }
}
