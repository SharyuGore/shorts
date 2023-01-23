package com.sharyu.shorts.multithreading.completableandfuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UseJava5 {

	public static void main(String args) throws InterruptedException, ExecutionException {

		ExecutorService es = Executors.newFixedThreadPool(4);

		Future<Boolean> orderPlaced = es.submit(Steps::orderPlaced);

		orderPlaced.get();

		Future<String> getpersonplacingordername = es.submit(() -> Steps.getOrderConsignor("Husband"));

		Future<String> getpersonreceivingordername = es.submit(() -> Steps.getOrderConsignee("Wife"));

		Future<Shipment> createShipment = es
				.submit(() -> Steps.createShipment(getpersonplacingordername.get(), getpersonreceivingordername.get()));
		
		Shipment shipment = createShipment.get();

	}

}
