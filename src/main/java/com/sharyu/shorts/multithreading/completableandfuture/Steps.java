package com.sharyu.shorts.multithreading.completableandfuture;

import java.util.concurrent.ThreadLocalRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Steps {

	private static final Logger log = LoggerFactory.getLogger(Steps.class);

	private static final long DELAY_MS = 1000L;

	private Steps() {
	}

	public static boolean orderPlaced() {
		log.info("Forcing the door...");
		delay(2000);
		log.info("Door unlocked!");
		return true;
	}

	public static String getOrderConsignor(final String consignorName) {
		log.info("Shipment going from {}", consignorName);
		delay();
		final int pin = (consignorName.hashCode() % 1000) + 1000;
		String finalconsignor = consignorName +Integer.toString(pin);
		log.info("Consignor retrieved {}", consignorName);
		return finalconsignor;
	}

	public static String getOrderConsignee(final String consigneeName) {
		log.info("Shipment going to {}", consigneeName);
		delay();
		final String consigneename = "A" + ThreadLocalRandom.current().nextInt(100);
		log.info("Got the safety box number: {}", consigneename);
		return consigneename;
	}

	public static Shipment createShipment(final String consignorName, final String consigneeName) {
		log.info("Shipment going from {} to {}", consignorName, consigneeName);
		delay();
		log.info("ShipmentCreated!");
		Shipment s = new Shipment(consignorName, consigneeName);
		return s;
	}

	private static void delay() {
		delay(DELAY_MS);
	}

	private static void delay(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}