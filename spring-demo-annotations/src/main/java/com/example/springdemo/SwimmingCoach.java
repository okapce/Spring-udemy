package com.example.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "do those strokes!!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
