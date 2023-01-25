package com.sharyu.shorts.streams;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamplesQuestionsAsked {

	
	public static void main(String[] args) {
		String data = "hello";

		HashMap<Character, Integer> storeData = new HashMap<Character, Integer>();

		data.chars().forEach(c -> {
			storeDataToMap(storeData, c);
		});

		List<Character> filter = storeData.entrySet().stream().filter(a -> a.getValue() == 1).map(t -> t.getKey())
				.collect(Collectors.toList());

		filter.forEach(d -> System.out.println(d));
		
		 

	}

	private static void storeDataToMap(HashMap<Character, Integer> storeData, int c) {
		Character conv = Character.valueOf((char) c);
		if (storeData.get(conv) == null) {
			storeData.put(conv, 1);
		} else {
			storeData.put(conv, storeData.get(conv) + 1);
		}
	}

}
