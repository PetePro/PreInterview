package leetcode.algorithms.medium;

public class A0473 {

	public boolean makesquare(int[] nums) {
		if (nums.length == 0)
			return false;
		int sum = 0;
		for (int i = 0; i < nums.length; i++)
			sum += nums[i];
		if (sum % 4 != 0)
			return false;
		return dfs(nums, 0, 0, 0, 0, 0, sum / 4);
	}

	private boolean dfs(int[] nums, int i, int s1, int s2, int s3, int s4, int side) {
		if (i == nums.length) {
			if (s1 == side && s2 == side && s3 == side && s4 == side)
				return true;
			else
				return false;
		}
		if (s1 > side || s2 > side || s3 > side || s4 > side)
			return false;
		return dfs(nums, i + 1, s1 + nums[i], s2, s3, s4, side)
				|| dfs(nums, i + 1, s1, s2 + nums[i], s3, s4, side)
				|| dfs(nums, i + 1, s1, s2, s3 + nums[i], s4, side)
				|| dfs(nums, i + 1, s1, s2, s3, s4 + nums[i], side);
	}

}
