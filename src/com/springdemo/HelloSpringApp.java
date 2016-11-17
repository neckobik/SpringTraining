package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean from Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean
		System.out.println("\n" + theCoach.getDailyWorkout() + "\n");
		
		//call new method for FortuneService
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
