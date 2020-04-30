package com.ds.aop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoPointCutLoggingAspect {
	
	@Pointcut("execution(* com.ds.aop.demo.dao.*.*(..))")
	private void anyFunctionName() {}	
//	@Pointcut("execution(public void addAccount(*))")
//	private void anyFunctionName() {}

	@Before("anyFunctionName()") //Point Cut Expression
	public void beforeAddAccountAdvice() {
		System.out.println("\n===MyDemoPointCutLoggingAspect==>>Executing @Before advice on addAccount()");
	}
	
	@Before("anyFunctionName()") //Point Cut Expression
	public void performAnalytics() {
		System.out.println("\n===MyDemoPointCutLoggingAspect==>>Performing Analytics");
	}
}
