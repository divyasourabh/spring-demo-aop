package com.ds.aop.demo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.ds.aop.demo.Account;

@Aspect
@Component
public class MyDemoPointCutCombinationAspect {
	
	@Pointcut("execution(* com.ds.aop.demo.dao.*.*(..))")
	private void forDaoPackage() {
		System.out.println("\n=====>>Executing @Before forDaoPackage");
	}	
	
	@Pointcut("execution(* com.ds.aop.demo.dao.*.get*(..))")
	private void getter() {
		System.out.println("\n=====>>Executing @Before getter");
	}	
	
	@Pointcut("execution(* com.ds.aop.demo.dao.*.set*(..))")
	private void setter() {
		System.out.println("\n=====>>Executing @Before setter");
	}	
	
	//Combine pointcut: include package....exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNoGetterSetter() {
		System.out.println("\n===MyDemoPointCutCombinationAspect==>>Executing @Before forDaoPackageNoGetterSetter");
	}
	
	@Before("forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n==MyDemoPointCutCombinationAspect===>>Executing @Before beforeAddAccountAdvice");
	}	
}
