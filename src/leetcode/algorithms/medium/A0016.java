package leetcode.algorithms.medium;

import java.util.Arrays;

/**
 * 16. 最接近的三数之和
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 * 
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 *
 */

public class A0016 {

	public int threeSumClosest(int[] nums, int target) {
		int res = 0, min = Integer.MAX_VALUE;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			int l = i + 1, r = nums.length - 1;
			while (l < r) {
				int sum = nums[i] + nums[l] + nums[r];
				if (sum - target == 0)
					return sum;
				else if (sum - target > 0)
					r--;
				else
					l++;
				if (Math.abs(sum - target) < min) {
					res = sum;
					min = Math.abs(sum - target);
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] nums = { -3, 0, 1, 2 };
		System.out.println(new A0016().threeSumClosest(nums, 1));
	}

}
