package com.infybuzz.cloud;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsProjectDemoApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(JenkinsProjectDemoApplication.class);


	@Test
	pp void contextLoads() {
		logger.info("Test Case Executing....");
		logger.info("Test Case Executing Second....");
		assertEquals(true, true);
	}

}
