package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 47. 全排列 II
 * 给定一个可包含重复数字的序列，返回所有不重复的全排列。
 *
 */

public class A0047 {

	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		permutation(res, nums, 0);
		return res;
	}

	public void permutation(List<List<Integer>> res, int[] nums, int k) {
		if (k == nums.length) {
			List<Integer> ans = new ArrayList<Integer>();
			for (int i = 0; i < nums.length; i++)
				ans.add(nums[i]);
			res.add(new ArrayList<>(ans));
		} else
			for (int i = k; i < nums.length; i++) {
				if (canSwap(nums, k, i)) {
					swap(nums, k, i);
					permutation(res, nums, k + 1);
					swap(nums, k, i);
				}
			}
	}

	private boolean canSwap(int nums[], int begin, int end) {
		for (int i = begin; i < end; i++)
			if (nums[i] == nums[end])
				return false;
		return true;
	}

	private void swap(int nums[], int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2 };
		System.out.println(new A0047().permuteUnique(nums).toString());
	}

}
