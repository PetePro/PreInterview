package leetcode.lcof.simple;

/**
 * 面试题50. 第一个只出现一次的字符
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。
 *
 */

public class O050 {

	public char firstUniqChar(String s) {
		if (s.equals(""))
			return ' ';
		int[] count = new int[26];
		for (int i = 0; i < s.length(); i++)
			count[s.charAt(i) - 'a']++;
		for (int i = 0; i < s.length(); i++)
			if (count[s.charAt(i) - 'a'] == 1)
				return s.charAt(i);
		return ' ';
	}

}
