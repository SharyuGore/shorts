package com.sharyu.shorts.designpatterns.abstractfactory;

public class SavingsBusinessAccount extends Account {

	@Override
	public void checkAccountType() {
		System.out.println("This is savings business account");
	}

}
