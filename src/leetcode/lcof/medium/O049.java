package leetcode.lcof.medium;

/**
 * 面试题49. 丑数
 * 我们把只包含因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。1 是丑数。
 *
 */

public class O049 {

	public int nthUglyNumber(int n) {
		if (n <= 0)
			return -1;
		int[] dp = new int[n];
		dp[0] = 1;
		int id2 = 0, id3 = 0, id5 = 0;
		for (int i = 1; i < n; i++) {
			dp[i] = Math.min(Math.min(dp[id2] * 2, dp[id3] * 3), dp[id5] * 5);
			if (dp[i] == dp[id2] * 2)
				id2++;
			if (dp[i] == dp[id3] * 3)
				id3++;
			if (dp[i] == dp[id5] * 5)
				id5++;
		}
		return dp[n - 1];
	}

}
