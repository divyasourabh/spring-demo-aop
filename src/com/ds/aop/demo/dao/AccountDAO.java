package com.ds.aop.demo.dao;

import org.springframework.stereotype.Component;

import com.ds.aop.demo.Account;

@Component
public class AccountDAO {

	public void addAccount() {
		System.out.println(getClass() + "Doing My DB Work, Adding an Account");
	}

	public void addAccount(Account account) {
		System.out.println(getClass() + "Doing My DB Work, Adding an Account with account parameter");
	}
	
	
	public void addAccount(String one) {
		System.out.println(getClass() + "Doing My DB Work, Adding an Account with 1 parameters");
	}
	
	public void addAccount(String one, String two) {
		System.out.println(getClass() + "Doing My DB Work, Adding an Account with 2 parameters");
	}
	
	public void addEmailId() {
		System.out.println(getClass() + "Doing My DB Work, Adding an Email Id");
	}
}
