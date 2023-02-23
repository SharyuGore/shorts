package com.sharyu.shorts.designpatterns.singleton;

public class UseSingletonPlay {

	public static void main(String[] args) {

		LazyInitialization li1 = LazyInitialization.getInstance();
		

		LazyInitialization li2 = LazyInitialization.getInstance();

		System.out.println(li1.hashCode());

		System.out.println(li2.hashCode());
		
		EnumSingleton.doSomething();

	}

}
