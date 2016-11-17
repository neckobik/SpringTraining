package com.springdemo;

public class BaseballCoach implements Coach {

	//define a private field
	private FortuneService fortuneService;
	
	//define a constructor
	public BaseballCoach(FortuneService theFortuneService){
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortuneService to give the fortune
				
		return fortuneService.getFortune();
	}
}
