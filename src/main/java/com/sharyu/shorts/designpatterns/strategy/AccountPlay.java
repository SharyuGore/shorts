package com.sharyu.shorts.designpatterns.strategy;

public class AccountPlay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Account savAcc = new SavingsAccount();
		Account fdAcc = new DepositAccount();
		
		savAcc.moneyWithdraw(); 
		fdAcc.moneyWithdraw();

	}

}
