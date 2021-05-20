package com.example.springdemo.service;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

	//create array String
	private String[] data = {
			"Beware...",
			"be curious",
			"you tell'em"
	};
	
	private Random rdm = new Random();
	
	@Override
	public String getFortune() {
		//pick random string from array	
		int index =  rdm.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}
}
