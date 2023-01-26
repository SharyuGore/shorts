package com.sharyu.shorts.leetcode.arrays;

import java.util.Arrays;

public class CurrentProblem {

	public static void main(String[] args) {

		twoSum();

	}

	public static void twoSum() {
		// Input: nums = [2,7,11,15], target = 9

		int[] nums = { 3, 2, 4 };
		int target = 6;
		int[] output = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			int valueInHand = nums[i];

			for (int j = 0; j < nums.length; j++) {
				if (i != j) {
					if (valueInHand + nums[j] == target) {
						output[0] = valueInHand;
						output[1] = nums[j];
						break;
					}
				}
			}

			if (output[0] != 0) {
				break;
			}
		}

		System.out.println(Arrays.toString(output));
	}

}
