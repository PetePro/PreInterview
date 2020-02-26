package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 46. 全排列
 * 给定一个没有重复数字的序列，返回其所有可能的全排列。
 * 
 * 示例:
 * 输入: [1,2,3]
 * 输出:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 *
 */

public class A0046 {

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> ans = new ArrayList<>();
		backtrack(res, ans, nums, 0);
		return res;
	}

	public void backtrack(List<List<Integer>> res, List<Integer> ans, int[] nums, int k) {
		if (k == nums.length) {
			res.add(new ArrayList<>(ans));
			return;
		}
		for (int x : nums) {
			if (!ans.contains(x)) {
				ans.add(x);
				backtrack(res, ans, nums, k + 1);
				ans.remove(ans.size() - 1);
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		System.out.println(new A0046().permute(nums).toString());
	}

}
