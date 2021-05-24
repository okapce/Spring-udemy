package com.example.springdemo;

import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springdemo.config.SportConfig;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring config
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get bean from spring container
		Coach theCoach = ctx.getBean("tennisCoach", Coach.class); //"thatSillyCoach"
		
		//call method 
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		
		//close context
		ctx.close();
		
	}

}
