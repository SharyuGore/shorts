package com.sharyu.shorts.writecode;

public class FibonaciiSeries {

	public static void main(String[] args) {
		int number = 5;
		for (int i = 0; i < number; i++) {
			System.out.println(fibonacci(i) + " ");
		}

	}

	private static int fibonacci(int n) {

		if (n <= 1) // n= 0,1,2,3,4
			return n;  // n= 0,1,N/A,N/A,N/A
		else {
			return fibonacci(n - 1) + fibonacci(n - 2);  
			// return N/A,N/A,1+0,1+1,2+1
		}
		// return 0,1,1,2,3
	}

}
