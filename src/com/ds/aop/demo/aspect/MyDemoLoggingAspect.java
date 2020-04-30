package com.ds.aop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

//	@Before("execution(public void addAccount())")
//	@Before("execution(public void com.ds.aop.demo.dao.AccountDAO.addAccount())")
	
//	@Before("execution(public * addAccount())")
	@Before("execution(public void addAccount(*))")
//	@Before("execution(public void addAccount(com.ds.aop.demo.Account))")
//	@Before("execution(public void addAccount(..))")
//	@Before("execution(int addAccount())")
//	@Before("execution(public void com.ds.aop.demo.dao.AccountDAO.add*())")
//	@Before("execution(public void add*())") //Point Cut Expression
	public void beforeAddAccountAdvice() {
//		System.out.println("\n=====>>Executing @Before advice on addAccount()");
		System.out.println("\n=====>>Executing @Before advice on add*()");
	}
}
