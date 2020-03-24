package leetcode.lcof.medium;

import java.util.ArrayList;
import java.util.Arrays;

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
		ArrayList<String> res = new ArrayList<>();
		boolean[] flag = new boolean[ch.length];
		permutation(res, new StringBuilder(), ch, flag);
		String[] result = new String[res.size()];
		for (int i = 0; i < result.length; i++)
			result[i] = res.get(i);
		return result;
	}

	private void permutation(ArrayList<String> res, StringBuilder sb, char[] ch, boolean[] flag) {
		if (sb.length() == ch.length) {
			res.add(sb.toString());
			return;
		}
		for (int i = 0; i < ch.length; i++) {
			if (!flag[i]) {
				if (i > 0 && ch[i] == ch[i - 1] && !flag[i - 1])
					continue;
				else {
					sb.append(ch[i]);
					flag[i] = true;
					permutation(res, sb, ch, flag);
					flag[i] = false;
					sb.deleteCharAt(sb.length() - 1);
				}
			}
		}
	}

	public static void main(String[] args) {
		String[] s = new O038().permutation("abc");
		for (int i = 0; i < s.length; i++)
			System.out.println(s[i]);
	}

}
