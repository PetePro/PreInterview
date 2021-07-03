package leetcode.algorithms.medium;

public class A0300 {

	public int lengthOfLIS(int[] nums) {
		if (nums.length == 0)
			return 0;
		int[] dp = new int[nums.length];
		dp[0] = 1;
		int maxans = 1;
		for (int i = 1; i < dp.length; i++) {
			int maxDP = 0;
			for (int j = 0; j < i; j++)
				if (nums[i] > nums[j])
					maxDP = Math.max(maxDP, dp[j]);
			dp[i] = maxDP + 1;
			maxans = Math.max(maxans, dp[i]);
		}
		return maxans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
		System.out.println(new A0300().lengthOfLIS(nums));
	}

}
