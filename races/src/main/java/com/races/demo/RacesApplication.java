package com.races.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="{com.races}")
public class RacesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RacesApplication.class, args);
	}
}
