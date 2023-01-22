package com.sharyu.shorts.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapImplementation {

	public static void main(String[] args) {
		// Use HashMap: When there is no need to maintain any order of elements
		// and we are working on single threaded environment.
		useHashMap();

		// Use LinkedHashMap: When there is a need to maintain insertion order of elements
		// and we are working on single threaded environment.
		useLinkedHashMap();

		// Use TreeMap: When there is a need to maintain ascending order of elements
		// and we are working on single threaded environment.
		useTreeMap();

		// Use HashTable: When there is no need to maintain any order of elements and
		// we are working on multi-threaded environment.
		useHashTable();

	}

	private static void useHashTable() {
		// Create Hashtable Object
		Hashtable<Integer, String> students = new Hashtable<Integer, String>();

		// Add objects in Hashtable
		students.put(1, "Jai");
		students.put(4, "Hemant");
		students.put(5, "Narender");
		students.put(2, "Mahesh");
		students.put(3, "Vishal");

		// Print Hashtable objects
		for (Map.Entry entry : students.entrySet()) {
			System.out.println("Used HashTable - " + entry.getKey() + " - " + entry.getValue());
		}

	}

	private static void useTreeMap() {
		// Create TreeMap Object
		TreeMap<Integer, String> students = new TreeMap<Integer, String>();

		// Add objects in TreeMap
		students.put(1, "Jai");
		students.put(4, "Hemant");
		students.put(5, "Narender");
		students.put(2, "Mahesh");
		students.put(3, "Vishal");

		// Print TreeMap objects
		for (Map.Entry entry : students.entrySet()) {
			System.out.println("Used TreeMap - " + entry.getKey() + " - " + entry.getValue());
		}

	}

	private static void useLinkedHashMap() {
		// Create LinkedHashMap Object
		LinkedHashMap<Integer, String> students = new LinkedHashMap<Integer, String>();

		// Add objects in LinkedHashMap
		students.put(1, "Jai");
		students.put(4, "Hemant");
		students.put(5, "Narender");
		students.put(2, "Mahesh");
		students.put(3, "Vishal");

		// Print LinkedHashMap objects
		for (Map.Entry entry : students.entrySet()) {
			System.out.println("Used LinkedHashMap - " + entry.getKey() + " - " + entry.getValue());
		}

	}

	private static void useHashMap() {
		// Create HashMap Object
		HashMap<Integer, String> students = new HashMap<Integer, String>();

		// Add objects in HashMap
		students.put(1, "Jai");
		students.put(2, "Mahesh");
		students.put(3, "Vishal");
		students.put(4, "Hemant");
		students.put(5, "Narender");

		// Print HashMap objects
		for (Map.Entry entry : students.entrySet()) {
			System.out.println("Used HashMap - " +entry.getKey() + " - " + entry.getValue());
		}

	}

}
