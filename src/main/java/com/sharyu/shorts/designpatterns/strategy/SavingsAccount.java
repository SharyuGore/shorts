package com.sharyu.shorts.designpatterns.strategy;

public class SavingsAccount extends Account {
	public SavingsAccount() {
		
		withdrawable = new CanWithdraw();
	}
}
