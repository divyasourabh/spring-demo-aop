package com.ds.aop.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ds.aop.demo.dao.AccountDAO;
import com.ds.aop.demo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		System.out.println("Application Starting");
		
		ClassPathXmlApplicationContext contextLog = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);

		
		Account account = new Account();
		accountDAO.addAccount(account);
//		accountDAO.addAccount("");
//		System.out.println("<=========== ===========>");
//		accountDAO.addEmailId();
	
		System.out.println("<===========MembershipDAO===========>");
		
		MembershipDAO membershipDAO = context.getBean("membershipDAO",MembershipDAO.class);
		
		membershipDAO.addAccount();
		
		context.close();
		contextLog.close();
	}

}
