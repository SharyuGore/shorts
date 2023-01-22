package com.sharyu.shorts.designpatterns.strategy;

public interface Withdrawable {
	String withdraw();

}

class CanWithdraw implements Withdrawable{
	public String withdraw() {
		return "Withdrwan";
	}
}

class CannotWithdraw implements Withdrawable{
	public String withdraw() {
		return "This is just not possible";
	}
}
