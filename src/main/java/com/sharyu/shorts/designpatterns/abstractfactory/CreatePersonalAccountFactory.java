package com.sharyu.shorts.designpatterns.abstractfactory;


public class CreatePersonalAccountFactory implements CreateAccountFactory{
	
	public Account createAccount(String userInput) {
		Account acc = null;
		if(userInput.equals("PL")) {
			acc = new SalaryPersonalAccount();
		}
		else if(userInput.equals("PT"))  {
			acc = new StudentsPersonalAccount();
		}
		
		return acc;
	}
}
