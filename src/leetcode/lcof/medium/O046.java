package leetcode.lcof.medium;

/**
 * 面试题46. 把数字翻译成字符串
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 *
 */

public class O046 {

	public int translateNum(int num) {
		String s = String.valueOf(num);
		int[] dp = new int[s.length() + 1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 1; i < s.length(); i++) {
			dp[i + 1] = dp[i];
			if (s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) < '6'))
				dp[i + 1] += dp[i - 1];
		}
		return dp[s.length()];
	}

}