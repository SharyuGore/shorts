package com.sharyu.shorts.streams;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Item {

	private String name;
	private int qty;
	private BigDecimal price;

}
