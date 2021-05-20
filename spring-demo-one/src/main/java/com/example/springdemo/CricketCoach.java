package com.example.springdemo;

import com.example.springdemo.services.FortuneService;

public class CricketCoach implements FortuneService, Coach {
	private String emailAddress;
	private String team;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	@Override
	public String getFortune() {
		return null;
	}


	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("CricketCoach: inside setter method - setFortuneService");
	}

	@Override
	public String getDailyWorkout() {
		
		return "Bowling time!!, 60 min";
	}

	@Override
	public String getDailyfortune() {
		return fortuneService.getFortune();
	}




}
