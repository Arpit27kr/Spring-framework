package com.luv2code.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context =new	ClassPathXmlApplicationContext("applicationContext.xml");
		// get bean from context file
		Coach thecoach=context.getBean("thatsillycoach",Coach.class);
		
		
		//call a method from bean
		System.out.println(thecoach.getdailyworkout());
		
		// close the bean
		context.close();

	}

}
