package com.nagarro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DetailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DetailServiceApplication.class, args);
		System.out.println("In detail-service");
	}

}
