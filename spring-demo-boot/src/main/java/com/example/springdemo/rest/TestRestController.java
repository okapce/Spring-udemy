package com.example.springdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
	@GetMapping("/")
	public String sayHello() {
		return "Hello World!";
	}
	
	@GetMapping("/workout")
	public String getWorkout() {
		return "ruuuuuun!";
	}
	
	@GetMapping("/fortune")
	public String geFortune() {
		return "luckyyyyy!";
	}
	
	@GetMapping("/fortunePlus")
	public String geFortunePlus() {
		return "lucky deluxe!";
	}
	
	
}
