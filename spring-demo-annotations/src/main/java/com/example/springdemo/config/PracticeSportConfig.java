package com.example.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springdemo.Coach;
import com.example.springdemo.WrestlingCoach;
import com.example.springdemo.service.FortuneService;
import com.example.springdemo.service.HappyFortuneService;

@Configuration
public class PracticeSportConfig {

	@Bean
	public FortuneService cheerfulFortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean 
	public Coach wrestlingCoach() {
		return new WrestlingCoach(cheerfulFortuneService());
	}
	
	
}
