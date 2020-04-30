package com.ds.aop.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ds.aop.demo.Account;

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;
	
	public List<Account> findAccounts() {
		
		List<Account> accounts = new ArrayList<Account>();
		
		Account account1 = new Account("Json","Silver");
		Account account2 = new Account("Rohan","Gold");
		Account account3 = new Account("Sohan","Platinum");
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		return accounts;
	}
		
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
