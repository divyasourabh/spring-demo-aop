package com.ds.aop.demo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ds.aop.demo.dao.AccountDAO;

public class MyDemoAfterReturningApp {
	
	
	public static void main(String[] args) {

		System.out.println("Application Starting");

		ClassPathXmlApplicationContext contextLog = new ClassPathXmlApplicationContext("applicationContext.xml");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);

		System.out.println("<===========Start===========>");

		List<Account> accounts = accountDAO.findAccounts();
		
		System.out.println("AfterReturning Demo App");
		
		System.out.println(accounts);
		
		System.out.println("<===========END===========>");

		context.close();
		contextLog.close();
	}

}
