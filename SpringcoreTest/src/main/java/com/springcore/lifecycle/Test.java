package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
	
	System.out.println("++++++++-Xml++++++++++");
	
	
	System.out.println("for xml file test lifecycle");
	Samosa s1=(Samosa)context.getBean("s1");
	
	System.out.println(s1);
	
	//regidteri shut down hook it is madatory to mantain lyfe cycle
	context.registerShutdownHook();
	
	
	
	System.out.println("++++++++-Interface++++++++++");
	
	
	System.out.println("for Interface use test lifecycle");

	Pepsi p1 =(Pepsi) context.getBean("p1");
	
	System.out.println(p1);
	
	
	
	System.out.println("++++++++-++++anno++++++");
	System.out.println("for annotation test lifecycle");

	Exampal exampal=(Exampal)context.getBean("exampal");
	
	System.out.println(exampal);
	
	}
}
