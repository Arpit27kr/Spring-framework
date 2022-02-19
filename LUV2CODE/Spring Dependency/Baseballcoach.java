package com.luv2code.springs;

public class Baseballcoach implements Coach {
	
	
	private Fortuneservice fortuneservice;
	
	public Baseballcoach(Fortuneservice thefortuneservice)
	{
		fortuneservice=thefortuneservice;
		
	}
	
	public String getdailyworkout()
	{
		return "I spend 30 minutes for batting";
		
	}

	@Override
	public String getdailyfortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getfortune();
	}
	
	
	

}
