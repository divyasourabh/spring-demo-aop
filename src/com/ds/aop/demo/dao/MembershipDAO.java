package com.ds.aop.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addAccount() {
		System.out.println(getClass() + " Doing Stuff : Adding A membership Accounnt");
	}
	
	public int addAccount(int a) {
		System.out.println(getClass() + " Doing Stuff : Adding A membership Accounnt return int");
		return a;
	}
}
