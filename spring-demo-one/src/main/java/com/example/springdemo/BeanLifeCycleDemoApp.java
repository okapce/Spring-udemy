package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve bena from spring container
		Coach theCoach = ctx.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		ctx.close();
		
	}

}
