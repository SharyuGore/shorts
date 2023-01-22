package com.sharyu.shorts.designpatterns.factory;

public class CurrentAccount extends Account{

	Integer accountTerm;
	Double intrestRate;
	public void performAccountDebit(Double amount) {
		accountBalance = 0 + amount;
		
		System.out.println("This is current account, Performing balance check" + accountBalance);
	}

}
