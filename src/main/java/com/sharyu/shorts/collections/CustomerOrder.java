package com.sharyu.shorts.collections;

public class CustomerOrder {
	
	public CustomerOrder(Integer orderId) {
		this.orderId = orderId;
	}

	Integer orderId;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

}
