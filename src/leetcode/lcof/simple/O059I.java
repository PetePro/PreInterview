package leetcode.lcof.simple;

/**
 * 面试题59 - I. 滑动窗口的最大值
 * 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
 *
 */

public class O059I {

	public int[] maxSlidingWindow(int[] nums, int k) {
		int[] res = new int[nums.length - k + 1];
		for (int i = 0; i < res.length; i++) {
			int[] cur = new int[k];
			for (int j = 0; j < k; j++)
				cur[j] = nums[i + j];
			res[i] = maxOfThree(cur);
		}
		return res;
	}

	private int maxOfThree(int[] nums) {
		int max = nums[0];
		for (int i = 1; i < nums.length; i++)
			if (nums[i] > max)
				max = nums[i];
		return max;
	}

}
