package com.sharyu.shorts.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ShipmentsPlay {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);//2 threads
		
		List<CreateShipments> lofShipObj = List.of(new CreateShipments("TEST1"),
												new CreateShipments("TEST2"));
		
		List<Future<List<Shipment>>> returnedfromthreads = es.invokeAll(lofShipObj);

		List<Shipment> finalShipments = new ArrayList<Shipment>();

		returnedfromthreads.stream().map(f -> {
			try {
				return f.get();
			} catch (InterruptedException | ExecutionException e) {
				return null;
			}

		}).forEach(lis -> lis.forEach(co -> {
			finalShipments.add(co);
		}));

		finalShipments.forEach(s -> {
			System.out.println(s.getShipmentNumber());
		});
		
		es.shutdown();
	}
	

}
