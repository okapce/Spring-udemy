package com.example.springdemo;

import com.example.springdemo.services.FortuneService;

public class RugbyCoach implements Coach {
	//private field for dependency
	private FortuneService fortuneService;
	
	//define constructor for DI
	public RugbyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "lift those weights!";
	}

	@Override
	public String getDailyfortune() {
		// TODO Auto-generated method stub
		return "lucky, you're getting muscles";
	}

}
