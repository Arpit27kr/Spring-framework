package com.love2code.activity4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Applicationcontextannotation.xml");
		Coach obj=context.getBean("that",Coach.class);
		System.out.println(obj.myname());
		context.close();
	}

}
