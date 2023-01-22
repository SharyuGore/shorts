package com.sharyu.shorts.designpatterns.factory;

public class CreateAccountFactory {
	
	public Account createAccountFactory(String userInput) {
		Account acc = null;
		if(userInput.equals("S")) {
			acc = new SavingsAccount();
		}
		else if(userInput.equals("C"))  {
			acc = new CurrentAccount();
		}
		
		return acc;
	}

}
