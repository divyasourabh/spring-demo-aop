package com.ds.aop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class MyCloudLoggingAspect {

}
