package com.ds.aop.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.ds.aop.demo.Account;

@Order(4)
@Aspect
@Component
public class MyLocalLoggingJoinPointAspect {
	
	@Before("com.ds.aop.demo.aspect.MyDemoPointCutCombinationAspect.forDaoPackageNoGetterSetter()")
	public void performLocalAnalytics(JoinPoint joinPoint) {
		System.out.println("\n==MyDemoPointCutCombinationAspect===>>Executing @Before Local Analytics Logging");
		
		//Display the method signature
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		System.out.println("Method: " + methodSignature);
		
		//Display method Arguments
		//get Args
		Object[] args = joinPoint.getArgs();
		for(Object argument :args) {
			System.out.println(argument);
			if (argument instanceof Account) {
				Account account = (Account) argument;
				System.out.println("Account type argument");
				System.out.println("Account Name: " + account.getName());
				System.out.println("Account Level: " + account.getLevel() );
			} else {
				System.out.println("Argument not a type of account");
			}
		}
	}
}
