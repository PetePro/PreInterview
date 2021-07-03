package leetcode.lcof.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 面试题38. 字符串的排列
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 * 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
 *
 */

public class O038 {

	public String[] permutation(String s) {
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		List<String> list = new ArrayList<>();
		boolean[] used = new boolean[ch.length];
		permutation(ch, list, new StringBuilder(), used);
		String[] res = new String[list.size()];
		for (int i = 0; i < res.length; i++)
			res[i] = list.get(i);
		return res;
	}

	public void permutation(char[] ch, List<String> res, StringBuilder sb, boolean[] used) {
		if (sb.length() == ch.length) {
			res.add(sb.toString());
			return;
		}
		for (int i = 0; i < ch.length; i++) {
			if (!used[i]) {
				if (i > 0 && ch[i] == ch[i - 1] && !used[i - 1])
					continue;
				else {
					sb.append(ch[i]);
					used[i] = true;
					permutation(ch, res, sb, used);
					used[i] = false;
					sb.deleteCharAt(sb.length() - 1);
				}
			}
		}
	}

	public static void main(String[] args) {
		String[] s = new O038().permutation("abb");
		for (int i = 0; i < s.length; i++)
			System.out.println(s[i]);
	}

}
