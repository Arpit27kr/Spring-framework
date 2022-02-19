package com.luv2code.springs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Cricketcoach thecoach=context.getBean("myCricketcoach",Cricketcoach.class);
		System.out.println(thecoach.getdailyworkout());
		System.out.println(thecoach.getEmailaddress());
		System.out.println(thecoach.getTeam());
		

	}

}
