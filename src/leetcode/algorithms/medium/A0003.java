package leetcode.algorithms.medium;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3 
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 */

public class A0003 {

	public int lengthOfLongestSubstring(String s) {
		int l = 0;
		int[] dp = new int[s.length() + 1];
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(l, i).indexOf(s.charAt(i)) != -1)
				l = s.indexOf(s.charAt(i), l) + 1;
			dp[i + 1] = Math.max(dp[i], i - l + 1);
		}
		return dp[s.length()];
	}

	public static void main(String[] args) {
		A0003 a = new A0003();
		System.out.println(a.lengthOfLongestSubstring("abcabcbb"));
		//String s = "abcabcbb";
		//System.out.println(s.substring(0, 0));
	}

}
