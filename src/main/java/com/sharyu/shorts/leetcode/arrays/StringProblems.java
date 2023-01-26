package com.sharyu.shorts.leetcode.arrays;

public class StringProblems {
	public static void main(String[] args) {
		reverseString();
		reverseInt();
		

		// Given a string, manipulate to remove the duplicate characters for each and
		// every alphabet in the string,
		// and count the number of duplicate characters for every word.

		/*
		 * String data = "Me"; HashMap<Character, Integer> countMap = new
		 * HashMap<Character, Integer>(); data.chars().forEach(e -> { Character d =
		 * Character.valueOf((char) e); if (countMap.get(d) == null) { countMap.put(d,
		 * 1); } else { countMap.put(d, countMap.get(d) + 1); }
		 * 
		 * });
		 * 
		 * List<Character> countkey = countMap.entrySet().stream().filter(e ->
		 * (e.getValue() == 1)).map(e -> e.getKey()) .collect(Collectors.toList());
		 * 
		 * countMap.entrySet().stream().filter(e -> (e.getValue() > 1)) .forEach(e ->
		 * System.out.println(e.getKey() + "------" + e.getValue()));
		 * 
		 * System.out.println(countkey.stream().map(e -> { return String.valueOf(e);
		 * }).collect(Collectors.joining()));
		 */
	}

	private static void reverseString() {
		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		int i=0; int j=s.length-1;
		while(i<j) {
			char tmp = s[i];
			s[i] = s[j];
			s[j] = tmp;
			i++;j--;
		}
		System.out.println(new String(s));
		
	}
	


	private static void reverseInt() {
		int test = 321;
		String test1 = Integer.toString(test);
		char[] convchar = test1.toCharArray();
		int i=0; int j=convchar.length-1;
		while(i<j) {
			char tmp = convchar[i];
			convchar[i] = convchar[j];
			convchar[j] = tmp;
			i++;j--;
		}
		String c = new String(convchar);
		Integer intdata = Integer.parseInt(c);
		
		System.out.println(intdata.intValue());
		
		
	}

}
