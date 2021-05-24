package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.springdemo.service.FortuneService;

@Component
public class PingPongCoach implements Coach{
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	public PingPongCoach() {
		System.out.println("Inside Constructor for PingPongCoach");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your pingpong drop shot";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
