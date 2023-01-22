package com.sharyu.shorts.special;

public class ChildOfMomDad implements Mom, 
									  Dad {

	@Override
	public String cooksLunch() {
		// TODO Auto-generated method stub
		Mom.super.cooksLunch();
		return Dad.super.cooksLunch();
	}


}
