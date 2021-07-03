package leetcode.algorithms.medium;

import java.util.Arrays;

public class A0673 {

	public int findNumberOfLIS(int[] nums) {
		if (nums.length == 0)
			return 0;
		int[] dp = new int[nums.length];
		int[] combination = new int[nums.length];
		Arrays.fill(dp, 1);
		Arrays.fill(combination, 1);
		int maxans = 1;
		for (int i = 1; i < dp.length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]) {
					if (dp[j] + 1 > dp[i]) { //如果+1长于当前LIS 则组合数不变
						dp[i] = dp[j] + 1;
						combination[i] = combination[j];
					} else if (dp[j] + 1 == dp[i]) { //如果+1等于当前LIS 则说明找到了新组合
						combination[i] += combination[j];
					}
				}
			}
			maxans = Math.max(maxans, dp[i]);
		}
		int res = 0;
		for (int i = 0; i < nums.length; i++)
			if (dp[i] == maxans)
				res += combination[i];
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, 5, 4, 7 };
		System.out.println(new A0673().findNumberOfLIS(nums));
	}

}
