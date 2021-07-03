package leetcode.algorithms.simple;

/**
 * 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 */

public class A0053 {

	public int maxSubArray(int[] nums) {
		int n = nums.length;
		int[] dp = new int[n];
		dp[0] = nums[0];
		int max = dp[0];
		for (int i = 1; i < n; i++) {
			dp[i] = Math.max(dp[i - 1], 0) + nums[i];
			max = Math.max(dp[i], max);
		}
		return max;
	}

}
