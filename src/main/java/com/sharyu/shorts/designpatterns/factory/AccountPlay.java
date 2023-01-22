package com.sharyu.shorts.designpatterns.factory;

public class AccountPlay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CreateAccountFactory fact = new CreateAccountFactory();

		Account savings = fact.createAccountFactory("S");
		savings.performAccountDebit(24.00);

		Account current = fact.createAccountFactory("C");
		current.performAccountDebit(12.00);

	}

}
