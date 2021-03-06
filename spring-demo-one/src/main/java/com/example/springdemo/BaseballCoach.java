package com.example.springdemo;

import com.example.springdemo.services.FortuneService;

public class BaseballCoach implements Coach{
	//private field for dependency
	private FortuneService fortuneService;
	
	//define constructor for DI
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "30 minute workout";
	}

	@Override
	public String getDailyfortune() {
		// use FortuneService
		return fortuneService.getFortune();
	}
	
	
	
}
