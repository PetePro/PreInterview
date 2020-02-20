package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 40. 组合总和 II
 * 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的每个数字在每个组合中只能使用一次。
 * 
 * 说明：
 * 所有数字（包括目标数）都是正整数。
 * 解集不能包含重复的组合。 
 * 
 * 示例 1:
 * 输入: candidates = [10,1,2,7,6,1,5], target = 8,
 * 所求解集为:
 * [
 *   [1, 7],
 *   [1, 2, 5],
 *   [2, 6],
 *   [1, 1, 6]
 * ]
 * 示例 2:
 * 输入: candidates = [2,5,2,1,2], target = 5,
 * 所求解集为:
 * [
 *   [1,2,2],
 *   [5]
 * ]
 *
 */

public class A0040 {

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> ans = new ArrayList<Integer>();
		Arrays.sort(candidates);
		find(res, ans, candidates, target, 0);
		return res;
	}

	public void find(List<List<Integer>> res, List<Integer> ans, int[] candidates, int target, int k) {
		if (target == 0) {
			res.add(ans);
			return;
		}
		if (target < candidates[0])
			return;
		for (int i = k; i < candidates.length && candidates[i] <= target; i++) {
			if (i != k && candidates[i] == candidates[i - 1])
				continue;
			List<Integer> tmp = new ArrayList<>(ans);
			tmp.add(candidates[i]);
			find(res, tmp, candidates, target - candidates[i], i + 1);
		}
	}

	public static void main(String[] args) {
		int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		System.out.println(new A0040().combinationSum2(candidates, target).toString());
	}

}
