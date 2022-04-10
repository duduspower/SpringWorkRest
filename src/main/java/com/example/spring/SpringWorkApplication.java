package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class SpringWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWorkApplication.class, args);
	}

}
