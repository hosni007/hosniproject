



package com.bs.collectionsample;

public class Student {
	
	protected String name;
	protected String email;
	private String pwd;
	private String ssn;
	
	public Student (String name, String email, String pwd)
	{
		this.name=name;
		this.email=email;
		this.pwd=pwd;
	}
	
	public void enrollForCourse(int courseid)
	{
		System.out.println("Enrolling for course "+courseid);
	}
	
	public void setPassword(String newpassword)
	{
		this.pwd=newpassword;
	}

	public boolean verifySSN(String givenssn) 
	{
		if(givenssn.equals(this.ssn))
		return true;
		else
		return false;
		
	}
}

