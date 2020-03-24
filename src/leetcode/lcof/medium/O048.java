package leetcode.lcof.medium;

/**
 * 面试题48. 最长不含重复字符的子字符串
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 *
 */

public class O048 {

	public int lengthOfLongestSubstring(String s) {
		if (s.length() <= 1)
			return s.length();
		int res = 0;
		int i = 0, j = 0;
		while (j < s.length()) {
			String sub = s.substring(i, j + 1);
			while (j < s.length() - 1 && !sub.contains(s.subSequence(j + 1, j + 2))) {
				j++;
				sub = s.substring(i, j + 1);
			}
			res = Math.max(res, sub.length());
			if (j < s.length()) {
				i++;
				j = i;
			}
		}
		return res;
	}

}
