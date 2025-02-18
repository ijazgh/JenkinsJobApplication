package com.chtech.JenkinsJobApplication;

import jakarta.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class JenkinsJobApplication {

	public static Logger logger = 	LoggerFactory.getLogger(JenkinsJobApplication.class);
    @PostConstruct
	public void init(){
		System.out.println("Welome to Jenkins First Job Application!");
		logger.info("JenkinsJobApplication started.....");
	}
	public static void main(String[] args) {

		logger.info("JenkinsJobApplication executed.....");

		SpringApplication.run(JenkinsJobApplication.class, args);
	}

}
