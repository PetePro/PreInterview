package leetcode.lcof.simple;

/**
 * 面试题42. 连续子数组的最大和
 * 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * 要求时间复杂度为O(n)。
 *
 */

public class O042 {

	public int maxSubArray(int[] nums) {
		int sum = 0, max = Integer.MIN_VALUE;
		for (int num : nums) {
			if (sum <= 0)
				sum = num;
			else
				sum += num;
			max = Math.max(sum, max);
		}
		return max;
	}

}
