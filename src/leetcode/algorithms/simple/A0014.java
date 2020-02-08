package leetcode.algorithms.simple;

/**
 * 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 *
 */

public class A0014 {

	public String longestCommonPrefix(String[] strs) {
		String res = "";
		int k = 0;
		int flag = 1;
		while (k < strs[0].length()) {
			for (int i = 1; i < strs.length; i++) {
				if (k == strs[i].length()) {
					flag = -1;
					break;
				}
				if (strs[0].charAt(k) != strs[i].charAt(k))
					flag = 0;
			}
			if (flag == -1)
				break;
			if (flag == 1)
				res += strs[0].charAt(k);
			k++;
		}
		return res;
	}

	public static void main(String[] args) {
		String[] strs = { "dog","racecar","car" };
		System.out.println(new A0014().longestCommonPrefix(strs));
	}

}
