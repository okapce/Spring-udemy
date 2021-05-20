package com.example.springdemo.services;

import java.util.Random;

public class RandomFortuneService implements FortuneService{
	private String[] data= {
			"Very lucky!",
			"not so lucky",
			"unlucky"
	};
	
	private Random rdm = new Random();

	@Override
	public String getFortune() {
		int index = rdm.nextInt(data.length);
		String fortune = data[index];
		return fortune;
	}


	
}
