package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	private int aid;
	private String aname;
	private String tech;
	@Autowired
	private laptop lap;
	@Qualifier("lap2")
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
	public laptop getLap() {
		return lap;
	}
	public void setLap(laptop lap) {
		this.lap = lap;
	}
	
	public void show()
	{
		System.out.println("showed details ");
		lap.compile();
	}

}
