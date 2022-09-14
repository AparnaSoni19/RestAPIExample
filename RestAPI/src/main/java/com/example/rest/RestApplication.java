package com.example.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.rest.repository")
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

}
