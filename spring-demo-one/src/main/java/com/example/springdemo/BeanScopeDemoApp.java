package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bena from spring container
		Coach theCoach = ctx.getBean("myCoach", Coach.class);
		
		Coach bestCoach = ctx.getBean("myCoach", Coach.class);
		
		//check if they're the same beans
		boolean result = (theCoach == bestCoach);
		
		//print results
		System.out.println("\nPointin to the same object: "+result);
		System.out.println("\nMemory location of object theCoach: "+theCoach);

		System.out.println("\nMemory location of object bestCoach: "+bestCoach);
		/* all objects are the same, therefore -> singleton. */
		
	}

}
