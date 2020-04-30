package com.ds.aop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
@Order(4)
public class MyLocalLoggingAspect {

}
