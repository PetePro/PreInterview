package leetcode.algorithms.difficult;

/**
 * 32. 最长有效括号
 * 给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
 * 
 * 示例 1:
 * 输入: "(()"
 * 输出: 2
 * 解释: 最长有效括号子串为 "()"
 * 示例 2:
 * 输入: ")()())"
 * 输出: 4
 * 解释: 最长有效括号子串为 "()()"
 * 
 * 思路：动态规划，dp[i]表示第i个括号结尾的最长长度。当遇到右括号时，尝试向前匹配左括号；如果是左括号，则更新匹配长度。
 *
 */

public class A0032 {

	public int longestValidParentheses(String s) {
		int len = s.length();
		if (len == 0)
			return 0;
		int[] dp = new int[len];
		for (int i = 1; i < len; i++) {
			if (s.charAt(i) == ')') {
				int pre = i - dp[i - 1] - 1;
				if (pre >= 0 && s.charAt(pre) == '(') {
					dp[i] = dp[i - 1] + 2;
					if (pre > 0)
						dp[i] += dp[pre - 1];
				}
			}
		}
		int res = dp[0];
		for (int i = 0; i < len; i++)
			if (dp[i] > res)
				res = dp[i];
		return res;
	}

	public static void main(String[] args) {
		System.out.println(new A0032().longestValidParentheses("(())"));
	}

}
