package com.sharyu.shorts.collections;

import java.util.HashMap;

/**
 * @author Sharyu.Gore
 *
 */
public class HashMapImplementation {

	public static void main(String[] args) {

		HashMap<Employee, String> employees = new HashMap<>();
		Employee emp1 = new Employee("Tejaswi", "Serials");
		Employee emp2 = new Employee("Tejaswi", "Serials");
		
		employees.put(emp1, "FirstEmployee");
		employees.put(emp2, "SecondEmployee");
		
		System.out.println(employees.size());

	}

}
