package com.luv2code.springs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load the spring configuration file 
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml"); 
	//retrieve bean 
	Coach thecoach=context.getBean("myCoach",Coach.class);
	
	
	//call the method of bean
	System.out.println(thecoach.getdailyworkout());
	System.out.println(thecoach.getdailyfortune());

	//close the context
	context.close();
	
	
	
	
	
	
	
		
		

	}

}
