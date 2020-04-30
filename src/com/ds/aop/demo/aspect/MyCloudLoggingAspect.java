package com.ds.aop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Aspect
@Component
public class MyCloudLoggingAspect {
	
	@Before("com.ds.aop.demo.aspect.MyDemoPointCutCombinationAspect.forDaoPackageNoGetterSetter()")
	public void performCloudLogging() {
		System.out.println("\n==MyDemoPointCutCombinationAspect===>>Executing @Before Cloud Logging Aspect");
	}
}
 