package com.luv2code.annotation;

import org.springframework.stereotype.Component;

@Component
public class RestService implements FortuneService {

	@Override
	public String getdailyrtune() {
		// TODO Auto-generated method stub
		return "This is rest service";
	}

}
