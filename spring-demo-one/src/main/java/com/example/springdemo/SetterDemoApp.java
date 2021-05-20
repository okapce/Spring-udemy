package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load config file
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoach thecoach = ctx.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods
		System.out.println(thecoach.getDailyfortune());
		System.out.println(thecoach.getDailyWorkout());
		//call literal injection values
		System.out.println("email: "+ thecoach.getEmailAddress());
		System.out.println("team: "+thecoach.getTeam());
		
		//close context
		ctx.close();

	}

}
