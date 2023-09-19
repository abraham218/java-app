package com.example.billa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BillaApplication {
	@RequestMapping("/")
        public String home() {
          return "Abraham AUgustine! Dockerizing Spring Boot Application";
        }

	public static void main(String[] args) {
		SpringApplication.run(BillaApplication.class, args);
	}

}
