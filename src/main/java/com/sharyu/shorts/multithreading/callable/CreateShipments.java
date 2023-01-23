package com.sharyu.shorts.multithreading.callable;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class CreateShipments implements Callable<List<Shipment>> {

	public CreateShipments(String consignoreId) {
		this.consignoreId = consignoreId;
	}

	private String consignoreId;

	@Override
	public List<Shipment> call() throws Exception {

		List<Shipment> createdShipments = Arrays.asList(
				new Shipment(consignoreId + "ship1", LocalDateTime.now(), consignoreId),
				new Shipment(consignoreId + "ship2", LocalDateTime.now(), consignoreId));
		// these twoshipments will be created with shipmentnumber containing consignorId

		// perform business logic
		return createdShipments;
	}

}
