package com.sharyu.shorts.multithreading.completableandfuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UseJava8 {

	private static final Logger log = LoggerFactory.getLogger(UseJava8.class);

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService es = Executors.newFixedThreadPool(4);

		Shipment finalShipment = CompletableFuture.supplyAsync(Steps::orderPlaced)
				.thenCompose(placed -> CompletableFuture.supplyAsync(() -> Steps.getOrderConsignor("Husband"))
						.thenCombineAsync(CompletableFuture.supplyAsync(() -> Steps.getOrderConsignee("Mom")),
								Steps::createShipment)
						.exceptionally(e -> {
							log.error("Something went wrong: {} Run, run, run!!", e.getMessage());
							return null;
						}))
				.thenApply(shipment -> {
					log.info("{} gets the content of the safety box: '{}'", shipment.consignorName,
							shipment.consigneeName);

					return shipment;
				}).join();

	}

}
