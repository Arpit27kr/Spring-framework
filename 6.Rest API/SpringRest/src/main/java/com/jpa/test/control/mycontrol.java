package com.jpa.test.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.entities.course;

import services.courseservice;
import services.courseserviceimpl;

@RestController
public class mycontrol {
	
	@Autowired
	private courseservice Courseservice;
	
	
	@GetMapping("/home")
	@RequestMapping
	@ResponseBody
	
	public String home()
	{
		return "Welcome to homepage";
		
	}
	//get the courses
	
	@GetMapping("/courses")

	public List<course>getCourses()
	{
		return this.Courseservice.getCourses();

	}
	
	@GetMapping("/courses/{id}")
	public course getcourse(@PathVariable String id)
	{

		return this.Courseservice.getcourse(Long.parseLong(id));
	}
	

}
