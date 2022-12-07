package com.example.CalculatorSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication 

/*
 * In order to run a Spring Boot application, it needs to have a class with
 * the @SpringBootApplication annotation. The Main class has
 * the @SpringBootApplication annotation It simply invokes the
 * SpringApplication.run method. This starts the Spring application as a
 * standalone application.
 */

public class CalculatorSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorSpringApplication.class, args);
	}

}