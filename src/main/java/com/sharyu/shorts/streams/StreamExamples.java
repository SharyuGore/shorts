package com.sharyu.shorts.streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExamples {

	// Group by the name + Count or Sum the Qty.
	public static void main(String[] args) {
		List<Item> items = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 20, new BigDecimal("19.99")), new Item("orang", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")), new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")), new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 20, new BigDecimal("9.99")), new Item("annanas", 20, new BigDecimal("9.99")));

		Map<String, Long> datagrouped = items.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.counting()));

		datagrouped.forEach((k, v) -> System.out.println(k + " " + v));

		System.out.println("--------------");

		Map<String, Integer> datagroupedandWtySumed = items.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));

		datagroupedandWtySumed.forEach((k, v) -> System.out.println(k + " " + v));

		items.stream().filter(e -> (e.getQty() > 5)).collect(Collectors.toList());

		items.stream().filter(e -> e.getName().startsWith("a")).map(e -> e.getName().toUpperCase())
				.sorted(Comparator.reverseOrder()).forEach(e -> System.out.println(e));
		
	
	}

}
