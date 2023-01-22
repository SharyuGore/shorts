package com.sharyu.shorts.designpatterns.factory;

public abstract class Account {
	
	String accountHolderName;
	
	Double accountBalance;
	
	public abstract void performAccountDebit(Double amount);
}
