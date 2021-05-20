package com.example.springdemo;

import com.example.springdemo.services.FortuneService;

public class TrackCoach implements Coach {
	//private field for dependency
	private FortuneService fortuneService;
	
	//define constructor for DI
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Run 5k";
	}

	@Override
	public String getDailyfortune() {
		
		return "Lucky!";
	}
	
	//init
	public void startupStuff() {
		System.out.println("trackCoach inside startupStuff method");
	}
	
	//destroy
	public void cleanUp() {
		System.out.println("TrackCoack inside cleanUp method");
	}
}
