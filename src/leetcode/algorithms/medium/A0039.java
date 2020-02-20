package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39. 组合总和
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的数字可以无限制重复被选取。
 * 
 * 说明：
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。 
 * 
 * 示例 1:
 * 输入: candidates = [2,3,6,7], target = 7,
 * 所求解集为:
 * [
 *   [7],
 *   [2,2,3]
 * ]
 * 示例 2:
 * 输入: candidates = [2,3,5], target = 8,
 * 所求解集为:
 * [
 *   [2,2,2,2],
 *   [2,3,3],
 *   [3,5]
 * ]
 *
 */

public class A0039 {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
			List<Integer> tmp = new ArrayList<>(ans);
			tmp.add(candidates[i]);
			find(res, tmp, candidates, target - candidates[i], i);
		}
	}

	public static void main(String[] args) {
		int[] candidates = { 2, 3, 6, 7 };
		int target = 7;
		System.out.println(new A0039().combinationSum(candidates, target).toString());
	}

}
