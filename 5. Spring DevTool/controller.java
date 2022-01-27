package com.jpa.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {
	
	
	@RequestMapping
	@ResponseBody
	
	public String test()
	{
		int a=5;
		int b=6;
		int c=54;
		int d=541;
		return "the sum of numbber is " +(a+b+c); 
		
	}
	
	

}
