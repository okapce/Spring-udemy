package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloApp {

	public static void main(String[] args) {
		// load config file
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach thecoach = ctx.getBean("myGolfCoach", Coach.class);
		
		//call methods
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getDailyfortune());
		
		//close context
		ctx.close();

	}
}
