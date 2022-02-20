package com.luv2code.annotation;

import org.springframework.stereotype.Component;

@Component
public class Defaultannotation implements Coach {
	
	public String getdailyworkout()
	{
		return " class name is Defaultannotation so its default annotation is ---> defaultannotation";
	}

}
