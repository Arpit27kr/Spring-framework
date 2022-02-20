package com.luv2code.annotation;

import org.springframework.stereotype.Component;

@Component("thatsillycoach")
public class TennisCoach implements Coach {

	@Override
	public String getdailyworkout() {
		// TODO Auto-generated method stub
		return "practice the back hand volley";
	}

}
