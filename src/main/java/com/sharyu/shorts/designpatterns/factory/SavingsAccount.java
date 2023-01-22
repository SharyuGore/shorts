package com.sharyu.shorts.designpatterns.factory;

public class SavingsAccount extends Account{


	Integer accountTerm;
	Double intrestRate;
	public void performAccountDebit(Double amount) {
		accountBalance = 0 + amount;
		
		System.out.println("This is saving account, Performing balance check" + accountBalance);
	}

}
