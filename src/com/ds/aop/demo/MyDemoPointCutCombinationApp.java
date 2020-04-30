package com.ds.aop.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ds.aop.demo.dao.AccountDAO;
import com.ds.aop.demo.dao.MembershipDAO;

public class MyDemoPointCutCombinationApp {
public static void main(String[] args) {
		
		System.out.println("Application Starting");
		
		ClassPathXmlApplicationContext contextLog = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);

		System.out.println("<===========Start===========>");
		
		Account account = new Account();
		account.setName("DivyaSourabh");
		account.setLevel("2");
		accountDAO.addAccount(account);
		accountDAO.setName("Divya");
		accountDAO.getName();
		accountDAO.setServiceCode("7090");
		accountDAO.getServiceCode();
		accountDAO.doWork();		
		
		System.out.println("<===========END===========>");
		
		context.close();
		contextLog.close();
	}

}
