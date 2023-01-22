package com.sharyu.shorts.designpatterns.strategy;

public class Account {

	protected Withdrawable withdrawable;
	
	public void moneyWithdraw() {
		System.out.println(withdrawable.withdraw());
	}
	
	
}
