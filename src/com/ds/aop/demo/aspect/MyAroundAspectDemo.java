package com.ds.aop.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-10)
public class MyAroundAspectDemo {
	
	@Around("execution(* com.ds.aop.demo.dao.*.getFortune(..))")
	public Object aroundGetFortune(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		
		String method = proceedingJoinPoint.getSignature().toShortString();
		System.out.println("Executing @Around on method: " + method);
		
		long begin = System.currentTimeMillis();
		
		//now lets execute the Method
		Object result = proceedingJoinPoint.proceed();
		
		System.out.println("Result in Around: " + result);
		
		long end = System.currentTimeMillis();
		
		long duration = end-begin;
		
		System.out.println("Duration: " + duration);
		
		return result;
	}
}
