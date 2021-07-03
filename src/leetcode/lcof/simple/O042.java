package leetcode.lcof.simple;

/**
 * 面试题42. 连续子数组的最大和
 * 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * 要求时间复杂度为O(n)。
 *
 */

public class O042 {

	public int maxSubArray(int[] nums) {
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			dp[i] = Math.max(dp[i - 1], 0) + nums[i];
			max = Math.max(dp[i], max);
		}
		return max;
	}

}
