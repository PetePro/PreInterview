package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 31. 下一个排列
 * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 * 必须原地修改，只允许使用额外常数空间。
 *
 * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 *
 */

public class A0031 {

	public void nextPermutation(int[] nums) {
		int len = nums.length;
		if (len <= 1)
			return;
		for (int i = len - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				int swap = i + 1;
				for (int j = i + 1; j < len; j++) {
					if (nums[j] > nums[i] && nums[j] < nums[swap]) {
						swap = j;
					}
				}
				int tmp = nums[i];
				nums[i] = nums[swap];
				nums[swap] = tmp;
				Arrays.sort(nums, i + 1, len);
				return;
			}
		}
		Arrays.sort(nums);
	}

	public void permutation(List<String> res, String s, int[] nums, int k) {
		if (k == nums.length) {
			res.add(s);
			return;
		}
		for (int x : nums) {
			if (!s.contains(x + "")) {
				s += x;
				permutation(res, s, nums, k + 1);
				s = s.substring(0, s.length() - 1);
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		new A0031().nextPermutation(nums);
	}

}
