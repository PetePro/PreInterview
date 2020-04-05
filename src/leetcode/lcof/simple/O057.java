package leetcode.lcof.simple;

/**
 * 面试题57. 和为s的两个数字
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 *
 */

public class O057 {

	public int[] twoSum(int[] nums, int target) {
		int l = 0, r = nums.length - 1;
		int[] result = new int[2];
		while (l < r) {
			if (nums[l] + nums[r] == target) {
				result[0] = nums[l];
				result[1] = nums[r];
				break;
			} else if (nums[l] + nums[r] > target)
				r--;
			else
				l++;
		}
		return result;
	}

}
