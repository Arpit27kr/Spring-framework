package com.luv2code.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SportConfig.class);
		name obj=context.getBean("trackMe",name.class);
		System.out.println(obj.myname());
		System.out.println(obj.yourname());
		context.close();
		

	}

}
