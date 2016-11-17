package com.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	//create non argument constructor
	public CricketCoach(){
		System.out.println("We are in empty CricketCoach constructor");
	}
	@Override
	public String getDailyWorkout() {
		
		return "DailyWorkout CricketCoach";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	//Getter and Setters
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("We are in setFortuneService method in CricketCoach constructor");
		this.fortuneService = fortuneService;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setEmailAddress method.");
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setTeam method.");
		this.team = team;
	}
}
