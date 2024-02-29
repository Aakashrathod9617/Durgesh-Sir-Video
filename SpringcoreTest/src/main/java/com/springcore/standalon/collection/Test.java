package com.springcore.standalon.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalon/collection/aloneconfig.xml");
	
		Person person1=context.getBean("person1", Person.class);
	
		System.out.println(person1); 
		
		System.out.println(person1.getFriends().getClass().getName());
		
		System.out.println("_________________________________");
	
		
		System.out.println(person1.getFeestructure());
		
		System.out.println("_________________________________________");
		
		System.out.println(person1.getProperties());
	}

}
