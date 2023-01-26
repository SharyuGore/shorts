package com.sharyu.shorts.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayProblems {
	public static void main(String[] args) {
		int[] data = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		removeDuplicates1(data);

		rotateArray(); // selfcontained

		findSimilar(); // selfcontained

		plusOne(); // selcontained

		moveZerosToRight();// selfContained
		moveZerosToLeft(); // selfContained

		// Rotate Array
		int[] nums = { 1, 2, 3, 1 }; // 7,1,2,3,4,5,6

		System.out.println(containsDuplicatesLC(nums));
	}

	private static boolean containsDuplicates(int[] nums) {
		List<Integer> memoryvar = new ArrayList<>();

		for (int num : nums) {
			if (memoryvar.contains(num)) {
				return true;
			} else {
				memoryvar.add(Integer.valueOf(num));
			}
		}
		return false;

	}

	private static boolean containsDuplicatesLC(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i : nums)
			if (!set.add(i))// if there is same
				return true;
		return false;

	}

	public static void removeDuplicates(int[] sortedData) {
		List<Integer> notduplicate = new ArrayList<Integer>();

		for (int i = 0; i < sortedData.length; i++) {
			if (!notduplicate.contains(sortedData[i])) {
				notduplicate.add(sortedData[i]);
			}
		}

		List<int[]> notduplicate1 = Arrays.asList(sortedData).stream().distinct().collect(Collectors.toList());

		System.out.println("sortedData" + notduplicate1.size() + notduplicate1);

//		5, nums = [0,1,2,3,4,_,_,_,_,_]
	}

	public static int removeDuplicates1(int[] nums) {
		int i = 0;
		for (int n : nums)
			if (i == 0 || n > nums[i - 1])
				nums[i++] = n;
		return i;
	}

	public static void rotateArray() {
		// Input: nums = [1,2,3,4,5,6,7], k = 3
		// Output: [5,6,7,1,2,3,4]
		// Explanation:
		// rotatpos 1 steps to the right: [7,1,2,3,4,5,6]
		// rotatpos 2 steps to the right: [6,7,1,2,3,4,5]
		// rotatpos 3 steps to the right: [5,6,7,1,2,3,4]

		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int rotatpos = 2;

		for (int i = 0; i < rotatpos; i++) {
			// 1: i=0
			// 2: i=1
			int last = nums[nums.length - 1];
			// 1: last=7
			// 2: last=6

			for (int j = nums.length - 1; j > 0; j--) {
				// 1: j=6
				// 2: j=6
				nums[j] = nums[j - 1];
				// 1: nums[6] = nums[5] = 6
				// 1: nums[5] = nums[4] = 5,4,3,2,1

				// 2: nums[6] = nums[5] = 5,4,3,2,1,7
			}
			// 1: nums[0] = 7
			// 1: nums[0] = 6
			nums[0] = last;

		}
		// 1: 7,1,2,3,4,5,6
		// 2: 6,7,1,2,3,4,5
		System.out.println(Arrays.toString(nums));

	}

	public static void findSimilar() {
		// Given a non-empty array of integers nums, every element appears twice except
		// for one. Find that single one.

		// Example 1 - Input: nums = [2,2,1] Output: 1
		// Example 2 - Input: nums = [4,1,2,1,2] Output: 4
		// Example 3 - Input: nums = [1] Output: 1

		int[] nums = { 2, 2, 1 };
		int singlevalue = 0;
		for (int i = 0; i < nums.length; i++) {
			int valueinHand = nums[i];
			int duplicCount = 0;
			for (int j = 0; j < nums.length; j++) {
				if (i != j) {
					if (valueinHand == nums[j]) {
						duplicCount = duplicCount + 1;
					}
				}

			}
			if (duplicCount == 0) {
				singlevalue = valueinHand;
			}
		}

		System.out.println(singlevalue);
	}

	public static void plusOne() {
		// You are given a large integer represented as an integer array digits, where
		// each digits[i] is the ith digit of the integer.
		// both arrays and you may return the result in any order.
		// Example 1 Input: digits = [1,2,3] Output: [1,2,4] //123+1
		// Example 2 Input: digits = [4,3,2,1] Output: [4,3,2,2] 4321+1
		// Example 2 Input: digits = [9] Output: [1,0] 9+1

		int[] nums = { 1, 2, 3 };

		String intToString = Arrays.stream(nums).mapToObj(String::valueOf).reduce((x, y) -> x + "" + y).get();

		Integer val = Integer.valueOf(intToString) + 1;

		int l = Integer.toString(val).length();
		String st = Integer.toString(val);
		int[] datafinal = new int[l];
		int count = 0;

		char[] test = st.toCharArray();
		for (char c : test) {
			datafinal[count] = Character.getNumericValue(c);
			count++;
		}

		System.out.println(Arrays.toString(datafinal));

	}

	public static void moveZerosToRight() {
		int[] nums = { 1, 3, 0, 0, 4, 5, 6 };
		int count = 0;
		int numOfZeroes = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				nums[count] = nums[i];
				count++;
			} else {
				numOfZeroes = numOfZeroes + 1;
			}

		}
		System.out.println(Arrays.toString(nums));
		for (int i = nums.length - numOfZeroes; i < nums.length; i++) {
			nums[i] = 0;
		}
		System.out.println(Arrays.toString(nums));

	}

	public static void moveZerosToLeft() {
		int[] nums = { 1, 3, 0, 0, 4, 5, 6 };
		int count = nums.length - 1;
		int numOfZeroes = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] > 0) {
				nums[count] = nums[i];
				count--;
			} else {
				numOfZeroes = numOfZeroes + 1;
			}

		}
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < numOfZeroes; i++) {
			nums[i] = 0;
		}
		System.out.println(Arrays.toString(nums));

	}
}
