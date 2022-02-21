package com.luv2code.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach thecoach=context.getBean("thatsillycoach",Coach.class);
		
		Coach obj=context.getBean("thatsillycoach",Coach.class);
		
		boolean result=(thecoach==obj); 
		
		System.out.println(result);
		System.out.println(thecoach);
		System.out.println(obj);
		
		context.close();
		
		
		
	}

}
