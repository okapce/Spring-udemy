package com.example.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// create object
		//BaseballCoach thecoach = new BaseballCoach();
		Coach thecoach = new BaseballCoach();
		//use object
		System.out.println(thecoach.getDailyWorkout());
	}

}
