package com.sharyu.shorts.leetcode.arrays;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class CurrentProblem {

	public static void main(String[] args) {
		// Given a string, manipulate to remove the duplicate characters for each and
		// every alphabet in the string,
		// and count the number of duplicate characters for every word.

		String data = "Me";
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		data.chars().forEach(e -> {
			Character d = Character.valueOf((char) e);
			if (countMap.get(d) == null) {
				countMap.put(d, 1);
			} else {
				countMap.put(d, countMap.get(d) + 1);
			}

		});

		List<Character> countkey = countMap.entrySet().stream().filter(e -> (e.getValue() == 1)).map(e -> e.getKey())
				.collect(Collectors.toList());

		countMap.entrySet().stream().filter(e -> (e.getValue() > 1))
				.forEach(e -> System.out.println(e.getKey() + "------" + e.getValue()));

		System.out.println(countkey.stream().map(e -> {
			return String.valueOf(e);
		}).collect(Collectors.joining()));
	}
}
