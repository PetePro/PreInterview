package leetcode.algorithms.medium;

/**
 * 5. 最长回文子串
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * 
 * 示例 1：
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 * 输入: "cbbd"
 * 输出: "bb"
 *
 */

public class A0005 {

	public String longestPalindrome(String s) {
		String res = "";
		for (int i = 0, j = i; i < s.length(); i++) {
			while (j < s.length()) {
				if (isPalindrome(s, i, j) && j - i + 1 > res.length())
					res = s.substring(i, j + 1);
				j++;
			}
			if (i + res.length() - 1 >= s.length())
				return res;
			else
				j = i + res.length() + 1;
		}
		return res;
	}

	private boolean isPalindrome(String s, int i, int j) {
		while (i < j)
			if (s.charAt(i++) != s.charAt(j--))
				return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new A0005().longestPalindrome("cbbd"));
	}

}
