package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
	
	//Samosa s1=(Samosa)context.getBean("s1");
	
	//System.out.println(s1);
	
	//regidteri shut down hook
	context.registerShutdownHook();
	
	//System.out.println("++++++++-++++++++++");
	
	//Pepsi p1 =(Pepsi) context.getBean("p1");
	
	//System.out.println(p1);
	Exampal exampal=(Exampal)context.getBean("exampal");
	
	System.out.println(exampal);
	
	}
}
