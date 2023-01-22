package com.sharyu.shorts.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

public class ReverseString {

	public static void main(String[] args) {
		ReverseString.findMiddleElement();

	}

	public static void reversString() {
//		"Reverse the list of String.
//		Input 
//		{Monday,Tuesday,Thursday}
//		Output
//		{yadnoM, yadseuT, yadsruhT }
//		"
		List<String> listString = new ArrayList<>();
		listString.add("Monday");
		listString.add("Tuesday");

		List<String> reversSt = listString.stream().map(t -> new StringBuilder(t).reverse().toString())
				.collect(Collectors.toList());
		reversSt.forEach(t -> System.out.println(t));

	}

	public static void countDuplicate() {

		String s = "Hello";
		char[] ch = s.toCharArray();
		HashMap<String, Integer> map = new HashMap<>();
		for (char c : ch) {
			if (map.get(Character.toString(c)) == null) {
				map.put(Character.toString(c), 1);
			} else {
				map.put(Character.toString(c), map.get(Character.toString(c)) + 1);
			}
		}

		map.forEach((k, v) -> System.out.println(k + v));

	}

	public static void secondLargest() {
		List<Integer> nos = new ArrayList<>();
		nos.add(1);
		nos.add(2);
		nos.add(5);
		nos.add(10);
		nos.add(11);
		System.out.println(nos.stream().sorted().limit(2).skip(1).findFirst());

	}

	public static void getSecondSalariedEmployee() {
		List<Employee> emps = new ArrayList<>();
		emps.add(Employee.builder().name("Aman").department("RND").salary(1000.00).build());
		emps.add(Employee.builder().name("Sharyu").department("RND").salary(1200.00).build());
		emps.add(Employee.builder().name("Sharyu Gore").department("Support").salary(2000.00).build());
		emps.add(Employee.builder().name("Sharyu Test").department("Support").salary(2200.00).build());

		Map<Object, List<Employee>> sorted = new HashMap<>();
		sorted = emps.stream().collect(Collectors.groupingBy(e -> e.getDepartment()));
		sorted.forEach((k, v) -> {
			System.out.println("Sedond highest salary for department " + k + " is " + v.stream()
					.sorted(Comparator.comparingDouble(Employee::getSalary)).limit(2).skip(1).findFirst().get().salary);

		});

		sorted.forEach((k, v) -> {
			System.out.println("Average salary for department " + k + " is "
					+ v.stream().collect(Collectors.averagingDouble(Employee::getSalary)));

		});
	}

	public static void removeBlankStrings() {
		List<String> emps = new ArrayList<>();
		emps.add("Sharyu");
		emps.add("Sharyu");
		emps.add(StringUtils.EMPTY);
		emps.add("Gore");
		emps.add(StringUtils.EMPTY);
		emps.add("Testing");

		List<String> noblanks = emps.stream().filter(e -> (!e.equals(StringUtils.EMPTY))).collect(Collectors.toList());
		noblanks.stream().forEach(e -> System.out.println(e));

	}

	public static void reverseIntegerArray() {
		Integer[] inArray = { 1, 2, 3, 4, 5 };
		List<Integer> listInt = Arrays.asList(inArray);
		List<Integer> reversedInt = listInt.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		reversedInt.forEach(e -> System.out.println(e));
	}

	public static void reverseIntegerArray1() {
		Integer[] inArray = { 7, 9, 2, 3, 4, 5 };
		List<Integer> listInt = Arrays.asList(inArray);
		for (int i = listInt.size() - 1; i >= 0; i--) {
			System.out.println(listInt.get(i));
		}
	}

	public static void findMiddleElement() {
		List<Integer> list = new LinkedList<>();	
		list.add(7);
		list.add(9);
		list.add(1);
		
		
		System.out.println(list.stream().limit(list.size()/2).sorted(Comparator.reverseOrder()).findFirst());
	}

}
