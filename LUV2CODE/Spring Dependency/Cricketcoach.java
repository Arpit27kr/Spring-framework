package com.luv2code.springs;

public class Cricketcoach implements Coach {

	private Fortuneservice fortuneservice;
	
	private String emailaddress;
	private String team;
	
	
	
	
	
	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		System.out.println("This is setter method : setemailaddress");
		this.emailaddress = emailaddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("This is setter method : setteam");
		this.team = team;
	}

	public Fortuneservice getFortuneservice() {
		return fortuneservice;
	}

	public void setFortuneservice(Fortuneservice fortuneservice) {
		System.out.println("This is setter method : setfortuneservice");
		this.fortuneservice = fortuneservice;
	}
	
	public Cricketcoach()
	{
		System.out.println("Cricket coach inside no arg constructor");
	}

	public Cricketcoach(Fortuneservice fortuneservice) {
		super();
		this.fortuneservice = fortuneservice;
	}




	@Override
	public String getdailyworkout() {
		// TODO Auto-generated method stub
		return "Play cricket for 15 minutes";
	}

	@Override
	public String getdailyfortune() {
		// TODO Auto-generated method stub
		return "Hope you have lucky day : its function of Cricket class";
	}

}
