package com.sharyu.shorts.designpatterns.singleton;

public class EagerInitialization {

	private EagerInitialization() {
	}

	private static EagerInitialization instance = new EagerInitialization();

	static EagerInitialization getInstance() {
		
		return instance;
	}

}
