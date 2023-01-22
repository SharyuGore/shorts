package com.sharyu.shorts.designpatterns.abstractfactory;

public class FactoryProducer {
	   public static CreateAccountFactory getFactory(boolean business){   
		      if(business){
		         return new CreateBusinessAccountFactory();         
		      }else{
		         return new CreatePersonalAccountFactory();
		      }
		   }
}
