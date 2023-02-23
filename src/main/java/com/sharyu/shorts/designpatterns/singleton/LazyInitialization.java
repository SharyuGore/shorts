package com.sharyu.shorts.designpatterns.singleton;

import java.io.Serializable;

public class LazyInitialization implements Serializable, Cloneable {
	private static LazyInitialization instance;

	private LazyInitialization() {

	}

	public static LazyInitialization getInstance() {
		if (instance == null) {
			instance = new LazyInitialization();
		}
		return instance;
	}

	protected Object readResolve() {
		return getInstance();
	}
	

    @Override
    protected Object clone() throws CloneNotSupportedException {

        // TODO Auto-generated method stub
        /*
         * Here forcibly throws the exception for preventing to be cloned
         */
        throw new CloneNotSupportedException();
        // return super.clone();
    }
}
