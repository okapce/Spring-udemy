package com.example.springdemo;

import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springdemo.config.SportConfig;

public class SwimConfigDemo {

	public static void main(String[] args) {
		//read spring config
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get bean from spring container
		SwimCoach theCoach = ctx.getBean("swimCoach", SwimCoach.class); //"thatSillyCoach"
		
		//call methods 
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//swim coach method with values injected
		System.out.println("email: "+theCoach.getEmail());
		System.out.println("team: "+theCoach.getTeam());
		//close context
		ctx.close();
		
	}

}
