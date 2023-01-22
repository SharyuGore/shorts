package com.sharyu.shorts.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueImplementation {

	public static Comparator<CustomerOrder> idComp = new Comparator<CustomerOrder>() {

		@Override
		public int compare(CustomerOrder o1, CustomerOrder o2) {
			return (int) o2.getOrderId() - o1.getOrderId();
		}

	};

	public static void main(String[] args) {

		// Creating empty priority queue
		PriorityQueue<CustomerOrder> pQueue = new PriorityQueue<CustomerOrder>(idComp);
		CustomerOrder co1 = new CustomerOrder(1);
		CustomerOrder co2 = new CustomerOrder(2);
		
		// Adding items to the pQueue using add()
		pQueue.add(co1);
		pQueue.add(co2);

		// Printing the top element of PriorityQueue
		System.out.println(pQueue.peek().getOrderId());

		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println(pQueue.poll().getOrderId());

		// Printing the top element again
		System.out.println(pQueue.peek().getOrderId());

	}

}
