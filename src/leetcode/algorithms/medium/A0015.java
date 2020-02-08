package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 * 
 * 示例：
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 *
 */

public class A0015 {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || nums[i] > nums[i - 1]) {
				int l = i + 1, r = nums.length - 1;
				while (l < r) {
					int sum = nums[i] + nums[l] + nums[r];
					if (sum == 0) {
						List<Integer> ans = Arrays.asList(nums[i], nums[l], nums[r]);
						res.add(ans);
						while (l < r && nums[l] == nums[l + 1])
							l++;
						while (l < r && nums[r] == nums[r - 1])
							r--;
						l++;
						r--;
					} else if (sum > 0) {
						r--;
					} else {
						l++;
					}
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		System.out.println(new A0015().threeSum(nums));
	}

}
