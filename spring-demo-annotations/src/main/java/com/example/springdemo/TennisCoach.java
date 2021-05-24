package com.example.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.springdemo.service.FortuneService;

@Component//("thatSillyCoach") /* default bean just uses class name, but lowercase
// @Scope("prototype") //creates new instance everytime
public class TennisCoach implements Coach {
	//field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	//default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach inside default construct, no autowired");
	}
	
	//define init method 
	@PostConstruct
	public void doInitMethod() {
		System.out.println(">> TennisCoach inside doInitMethod");
	}
	
	//define destroy method
	@PreDestroy
	public void doDestroyMethod() {
		System.out.println(">> TennisCoach inside doDestroyMethod");
	}
	/*
	@Autowired //constructor injection -> injecting FortuneService into coach
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	/*
	//method injection
	@Autowired
	public void doCrazyStuff(FortuneService fortuneService) { //setFortuneService
		System.out.println(">> TennisCoach inside autowired doCrazyStuff"); //setter
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "practice your serve!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
