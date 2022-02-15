package com.luv2code.springdemo;

import javax.naming.Context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class hellospringapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load the spring configuration file '
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container 
		
		coach thecoach= context.getBean("myCoach",coach.class);
		
		//call methods of bean 
	
		
		System.out.println(thecoach.getDailyworkout());
		
		//close the context
		context.close();
		

	}

}
