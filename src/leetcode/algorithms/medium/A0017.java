package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 17. 电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。给出数字到字母的映射与电话按键相同。注意 1 不对应任何字母。
 * 示例:
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *
 */

public class A0017 {

	char[] numbers = { '2', '3', '4', '5', '6', '7', '8', '9' };
	String[] letters = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public List<String> letterCombinations(String digits) {
		if (digits == null || digits.length() == 0)
			return null;
		List<String> res = new ArrayList<String>();
		combine(res, "", digits, 0);
		return res;
	}

	public void combine(List<String> res, String s, String digits, int k) {
		if (s.length() == digits.length()) {
			res.add(s);
			return;
		}
		int num = 0;
		for (num = 0; num < numbers.length; num++)
			if (numbers[num] == digits.charAt(k))
				break;
		String temp = letters[num];
		for (char c : temp.toCharArray()) {
			s += c;
			combine(res, s, digits, k + 1);
			s = s.substring(0, s.length() - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(new A0017().letterCombinations("23"));
	}

}
