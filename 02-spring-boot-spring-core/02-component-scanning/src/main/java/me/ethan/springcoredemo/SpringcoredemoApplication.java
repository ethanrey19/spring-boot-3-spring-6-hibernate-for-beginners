package me.ethan.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication(
		scanBasePackages = {"me.ethan.springcoredemo", // tells spring boot specific packages to scan when running
							"me.ethan.util"}
)
 */

@SpringBootApplication // autoconfigures most of the application for us with spring boot
public class SpringcoredemoApplication {

	// bootstraps your spring boot application
	// also starts automatically component scanning main spring boot package and subpackages within
	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
