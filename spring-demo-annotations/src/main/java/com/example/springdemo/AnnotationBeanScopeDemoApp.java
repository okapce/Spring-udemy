package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = ctx.getBean("tennisCoach", Coach.class);
		
		Coach bestCoach = ctx.getBean("tennisCoach", Coach.class);
		
		//check if they're the same beans
		boolean result = (theCoach == bestCoach);
		
		//print results
		System.out.println("\nPointin to the same object: "+result);
		System.out.println("\nMemory location of object theCoach: "+theCoach);

		System.out.println("\nMemory location of object bestCoach: "+bestCoach);
		/* all objects are the same, therefore -> singleton. */
		
		//close
		ctx.close();

	}

}
