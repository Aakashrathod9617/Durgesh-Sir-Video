package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Exampal {
	
	private String subject;

	public Exampal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Exampal [subject=" + subject + "]";
	}
	@PostConstruct
	public void start()
	{
	System.out.println("starting method");	
	}
@PreDestroy
	public void end()
	{
	System.out.println("end ing method");	
	}

}
