package com.sharyu.shorts.designpatterns.strategy;

public class DepositAccount extends Account{

	public DepositAccount() {
		withdrawable = new CannotWithdraw();
	}
	
	

}
