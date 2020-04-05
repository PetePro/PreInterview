package leetcode.lcof.medium;

import java.util.Arrays;

/**
 * 面试题56 - II. 数组中数字出现的次数 II
 * 在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。
 *
 */

public class O056II {

	public int singleNumber(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length;
		if (len == 1)
			return nums[0];
		for (int i = 0; i < len - 3;) {
			if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2])
				i += 3;
			else
				return nums[i];
		}
		return nums[len - 1];
	}

}
