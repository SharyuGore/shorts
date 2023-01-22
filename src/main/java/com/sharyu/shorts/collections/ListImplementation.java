package com.sharyu.shorts.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListImplementation {

	public static void main(String[] args) {
		LinkedList<String> easyToManipulate = new LinkedList<String>();
		easyToManipulate.add("Roti");
		easyToManipulate.add("Daal");
		easyToManipulate.add("Sabji");

		// get is more expensive in linkedlist
		System.out.println(easyToManipulate.get(1));

		// add is less expensive in linkedlist
		easyToManipulate.add(1, "Chawal");
		System.out.println(easyToManipulate);

		ArrayList<String> easyToReadFrom = new ArrayList<String>();
		easyToReadFrom.add("Roti");
		easyToReadFrom.add("Daal");
		easyToReadFrom.add("Sabji");

		// get is less expensive in linkedlist
		System.out.println(easyToReadFrom.get(1));

		// add is more expensive in linkedlist
		easyToReadFrom.add(1, "Chawal");
		System.out.println(easyToReadFrom);

	}

}
