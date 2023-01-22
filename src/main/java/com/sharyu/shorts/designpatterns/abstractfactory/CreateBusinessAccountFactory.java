package com.sharyu.shorts.designpatterns.abstractfactory;


public class CreateBusinessAccountFactory implements CreateAccountFactory {
	
	public Account createAccount(String userInput) {
		Account acc = null;
		if(userInput.equals("BS")) {
			acc = new CheckingsBusinessAccount();
		}
		else if(userInput.equals("BC"))  {
			acc = new SavingsBusinessAccount();
		}
		
		return acc;
	}
}
