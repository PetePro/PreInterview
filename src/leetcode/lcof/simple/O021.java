package leetcode.lcof.simple;

/**
 * 面试题21. 调整数组顺序使奇数位于偶数前面
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 *
 */

public class O021 {

	public int[] exchange(int[] nums) {
		int i = 0, j = nums.length - 1;
		while (i < j) {
			while (i < j && nums[i] % 2 != 0)
				i++;
			while (i < j && nums[j] % 2 == 0)
				j--;
			if (i < j) {
				int tmp = nums[i];
				nums[i] = nums[j];
				nums[j] = tmp;
			}
		}
		return nums;
	}

}
