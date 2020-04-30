package com.ds.aop.demo.dao;

import org.springframework.stereotype.Component;

import com.ds.aop.demo.Account;

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;
		
	public String getName() {
		System.out.println(getClass() + ": in getName");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + ": in setName");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + ": in getServiceCode");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + ": in setServiceCode ");
		this.serviceCode = serviceCode;
	}

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
	
	public void doWork() {
		System.out.println(getClass() + ": TO Do Work()");
	}
}
