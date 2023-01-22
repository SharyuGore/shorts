package com.sharyu.shorts.multithreading;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Shipment {

	String shipmentNumber;
	LocalDateTime despatchdate;
	String consignorId;
}
