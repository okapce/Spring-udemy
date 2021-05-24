package com.example.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.springdemo.Coach;
import com.example.springdemo.SwimCoach;
import com.example.springdemo.service.FortuneService;
import com.example.springdemo.service.SadFortuneService;

@Configuration
//@ComponentScan("com.example.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//sad fortune bean
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//swim coach bean with sad fortune DI
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
