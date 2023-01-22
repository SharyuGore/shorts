package com.sharyu.shorts.designpatterns.abstractfactory;

public class AccountPlay {
	
	public static void main(String[] args) {
		FactoryProducer facP = new FactoryProducer();
		
		CreateAccountFactory fac = FactoryProducer.getFactory(true);
		
		Account businessSavings = fac.createAccount("BS");
		businessSavings.checkAccountType();
		
		Account businesscurrent = fac.createAccount("BC");
		businesscurrent.checkAccountType();
		
		fac = FactoryProducer.getFactory(false);
		
		Account personalsalary = fac.createAccount("PL");
		personalsalary.checkAccountType();
		
		Account personalstudent = fac.createAccount("PT");
		personalstudent.checkAccountType();
	}

}
