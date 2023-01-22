package com.sharyu.shorts.IQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {
	public static void main(String[] args) {
		// Reverse an array without using another array
		reverseArray();
		
		removeDuplicatesFromArray();
		
		// sort Array
	}

	private static void removeDuplicatesFromArray() {
		Integer[] data = { 1, 4, 43, 5, 4 };
		System.out.println(Arrays.toString(data));
		
		List<Integer> datadeduplicated = Arrays.asList(data).stream().distinct().collect(Collectors.toList());
		System.out.println(datadeduplicated);
		
	}

	/**
	 * 
	 */
	private static void reverseArray() {
		Integer[] reversedata = { 1, 4, 43, 5 };
		
		System.out.println(Arrays.toString(reversedata));
		
		Collections.reverse(Arrays.asList(reversedata));
		
		System.out.println(Arrays.toString(reversedata));

	}
	
	
}

