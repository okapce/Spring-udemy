package com.example.springdemo;

import org.springframework.stereotype.Component;

import com.example.springdemo.service.FortuneService;

@Component
public class WrestlingCoach implements Coach {
	
	public FortuneService fortuneService;
	
	public WrestlingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "stretch and lift!!!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "today you won't get hurt";
	}

}
