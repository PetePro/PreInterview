package leetcode.algorithms.simple;

/**
 * 28. 实现 strStr()
 * 实现 strStr() 函数。
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * 示例 1:
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 *
 */

public class A0028 {

	public int strStr(String haystack, String needle) {
		if (needle.length() == 0)
			return 0;
		if (needle.length() > haystack.length())
			return -1;
		int res = -1, i;
		for (i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				res = i;
				break;
			}
		}
		if (res == -1)
			return res;
		while (i != haystack.length()) {
			int k = i;
			for (int j = 0; j < needle.length(); j++) {
				if (k == haystack.length() || haystack.charAt(k) != needle.charAt(j)) {
					res = -1;
					break;
				}
				k++;
			}
			if (res != -1)
				return res;
			for (i = i + 1; i < haystack.length(); i++) {
				if (haystack.charAt(i) == needle.charAt(0)) {
					res = i;
					break;
				}
			}
			if (res == -1)
				return res;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(new A0028().strStr("mississippi", "issip"));
	}

}
