package com.luv2code.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("thatsillycoach")
//@Scope("singleton")      // if two objects are created for this class then they will have same memory address  and it is default
@Scope("prototype")   // now for same class two different objects will be created with different memory address 
public class TennisCoach implements Coach {
	
	@Autowired //field injection 
	
	@Qualifier("restService")
	private FortuneService fortuneservice;
	
	
	public TennisCoach()
	{
		System.out.println("inside default constructor");
		
	}
	
	/*
	@Autowired  //setter injection
	public void setFortuneService(FortuneService thefortune)
	{
		System.out.println("inside setter methodr");
		fortuneservice=thefortune;
	}
	*/ 
	/*
	@Autowired // constructor injection
	public TennisCoach(FortuneService thefortune)
	{
		fortuneservice=thefortune;
	
	}
	*/

	@Override
	public String getdailyworkout() {
		// TODO Auto-generated method stub
		return "practice the back hand volley";
	}

	@Override
	public String getdailyfortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getdailyrtune();
	}

}
