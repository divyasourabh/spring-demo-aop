package com.ds.aop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(4)
@Aspect
@Component
public class MyLocalLoggingAspect {
	
	@Before("com.ds.aop.demo.aspect.MyDemoPointCutCombinationAspect.forDaoPackageNoGetterSetter()")
	public void performLocalAnalytics() {
		System.out.println("\n==MyDemoPointCutCombinationAspect===>>Executing @Before Local Analytics Logging");
	}
}
