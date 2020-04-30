package com.ds.aop.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configurable
@EnableAspectJAutoProxy
@ComponentScan("com.ds.aop.demo")
public class DemoConfig {

}
