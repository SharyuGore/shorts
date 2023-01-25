package com.sharyu.shorts.examples;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.sharyu.shorts.streams.Item;

public abstract class FIExamples {

	public static void main(String[] args) {
		// Example 1
		List<Item> items = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 20, new BigDecimal("19.99")), new Item("orang", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")), new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")), new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 20, new BigDecimal("9.99")), new Item("annanas", 20, new BigDecimal("9.99")));

		items.stream().map(e -> e.getName()).collect(Collectors.toList());

		// Example 2
		List<String> names = Arrays.asList("bob", "josh", "megan");

		names.replaceAll((name) -> name.toLowerCase(null));

	}

}
