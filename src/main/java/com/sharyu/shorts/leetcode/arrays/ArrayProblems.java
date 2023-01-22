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
}
