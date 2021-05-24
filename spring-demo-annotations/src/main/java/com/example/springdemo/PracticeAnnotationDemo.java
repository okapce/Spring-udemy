package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeAnnotationDemo {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("pingPongCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call a method on the bean
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();	
	}

}
