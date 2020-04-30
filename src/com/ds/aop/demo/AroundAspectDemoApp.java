package com.ds.aop.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ds.aop.demo.dao.AccountDAO;
import com.ds.aop.demo.dao.MembershipDAO;
import com.ds.aop.demo.dao.TrafficFortuneService;

public class AroundAspectDemoApp {
	
	public static void main(String[] args) {

		System.out.println("Application Starting");

		ClassPathXmlApplicationContext contextLog = new ClassPathXmlApplicationContext("applicationContext.xml");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		TrafficFortuneService fortuneService = context.getBean("trafficFortuneService",TrafficFortuneService.class);

		System.out.println("<===========Start===========>");

		String result = fortuneService.getFortune();

		System.out.println("Result : " + result);
		
		System.out.println("<===========END===========>");

		context.close();
		contextLog.close();
	}

}
