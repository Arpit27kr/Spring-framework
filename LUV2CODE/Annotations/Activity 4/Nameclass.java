package com.love2code.activity4;

import org.springframework.stereotype.Component;


@Component("that")

public class Nameclass implements Coach {
	
	@Override
	public String myname()
	{
		return "My name is Arpt This is activity 4 ";
	}
	
	

}
