package leetcode.lcof.simple;

/**
 * 面试题53 - I. 在排序数组中查找数字 I
 * 统计一个数字在排序数组中出现的次数。
 *
 */

public class O053I {

	public int search(int[] nums, int target) {
		int count = 0;
		int l = 0, r = nums.length - 1;
		while (l < r) {
			int mid = (l + r) / 2;
			if (nums[mid] >= target)
				r = mid;
			else
				l = mid + 1;
		}
		while (l < nums.length && nums[l++] == target)
			count++;
		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		System.out.println(new O053I().search(nums, 8));
	}

}
