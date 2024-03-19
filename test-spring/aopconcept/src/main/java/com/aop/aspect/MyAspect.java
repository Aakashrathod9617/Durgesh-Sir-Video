package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	
	//advaises
	@Before("execution(* com.aop.services.PaymentServiceImpl.makePayment())")
	public void printBefore() {
		System.out.println("Payment Started....");
	}
}
