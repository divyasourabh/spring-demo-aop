package com.ds.aop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(0)
@Aspect
@Component
public class MyAnalyticsAspect {
	
	@Before("com.ds.aop.demo.aspect.MyDemoPointCutCombinationAspect.forDaoPackageNoGetterSetter()")
	public void performAnalytics() {
		System.out.println("\n==MyDemoPointCutCombinationAspect===>>Executing @Before Analytics Logging");
	}
}
