package com.example.springdemo;

public class BaseballCoach implements Coach{
	@Override
	public String getDailyWorkout() {
		return "30 minute workout";
	}
}
