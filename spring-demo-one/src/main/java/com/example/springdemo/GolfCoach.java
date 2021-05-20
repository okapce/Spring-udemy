package com.example.springdemo;

import com.example.springdemo.services.FortuneService;

public class GolfCoach implements Coach {
	private FortuneService fortuneService;
	
	
	public GolfCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "swing that club... 1 hour!!!";
	}

	@Override
	public String getDailyfortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
