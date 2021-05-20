package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		
		//get bean from spring container
		Coach theCoach = ctx.getBean("tennisCoach", Coach.class); //"thatSillyCoach"
		
		//call method 
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		
		//close context
		ctx.close();
		
	}

}
