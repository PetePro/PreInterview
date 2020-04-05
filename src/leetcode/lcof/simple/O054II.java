package leetcode.lcof.simple;

/**
 * 面试题53 - II. 0～n-1中缺失的数字
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 *
 */

public class O054II {

	public int missingNumber(int[] nums) {
		int l = 0, r = nums.length;
		while (l < r) {
			int mid = (l + r) / 2;
			if (nums[mid] == mid)
				l = mid + 1;
			else
				r = mid;
		}
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
