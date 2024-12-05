package com.edureka.demo_development_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoDevelopmentProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDevelopmentProjectApplication.class, args);
	}
	
	@GetMapping("/")
	public String hello() {
      return String.format("<h1>Greetings from Spring Boot!</h1>");
	}
}
