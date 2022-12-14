package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleeApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello() {
		return "안녕 Github Actions!!!";
	}
	
	@GetMapping("/spring")
	public String spring() {
		return " 봄이다~!";
	}
}
