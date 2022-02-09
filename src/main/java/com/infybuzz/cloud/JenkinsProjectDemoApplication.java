package com.infybuzz.cloud;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsProjectDemoApplication {
	
	public static Logger logger = LoggerFactory.getLogger(JenkinsProjectDemoApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application Startred");
	}
	
	public static void main(String[] args) {
		logger.info("Application Executed");
		SpringApplication.run(JenkinsProjectDemoApplication.class, args);
	}

}
