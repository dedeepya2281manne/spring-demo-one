package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	public FortuneService fortuneService;
	
	//create no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach:Inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach:Inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
