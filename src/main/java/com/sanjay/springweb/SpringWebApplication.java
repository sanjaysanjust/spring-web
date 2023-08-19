package com.sanjay.springweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class SpringWebApplication implements ApplicationRunner,CommandLineRunner{
	private static final Logger logger =
			LoggerFactory.getLogger(SpringWebApplication.class);
	
	@Value("${spring.application.name:spring demo web service local}")
	
	private String name ;

	public static void main(String[] args) {
		
		SpringApplication.run(SpringWebApplication.class, args);
	}
	
	@RequestMapping(value="/hello")
	public String hello() {
		logger.info("this is a info message");
		logger.warn("this is a warn message");
		logger.error("this is a error message");
		logger.debug("this is a debug message");
		System.out.println("Hello Demo Heman");
	return "Hello Heman World Again from application ::"+ name;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Hello World from Application Runner");
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World from Command Line Runner");
		
	}

}
