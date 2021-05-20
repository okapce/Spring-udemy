package com.example.springdemo.services;

public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		
		return "You're SO lucky!";
	}


}
