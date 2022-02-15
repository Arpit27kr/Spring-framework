package com.luv2code.activity1;
import javax.naming.Context;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Myapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		sport obj=context.getBean("mysport",sport.class);
		System.out.println(obj.getsport());
		context.close();


		
		
		
		

	}

}
