package com.sharyu.shorts.leetcode.arrays;

public class StringProblems {
	public static void main(String[] args) {
		reverseString();
		reverseInt();
		

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

}
