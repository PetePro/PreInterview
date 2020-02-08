package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 * 
 * 例如，给出 n = 3，生成结果为：
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 *
 */

public class A0022 {

	public List<String> generateParenthesis(int n) {
		if (n == 0)
			return null;
		List<String> res = new ArrayList<String>();
		generate(res, "", n, 0, 0);
		return res;
	}

	public void generate(List<String> res, String s, int n, int lcount, int rcount) {
		if (lcount > n || rcount > n || rcount > lcount )//有效
			return;
		if (lcount == n && rcount == n) {
			res.add(s);
			return;
		}
		generate(res, s + '(', n, lcount + 1, rcount);
		generate(res, s + ')', n, lcount, rcount + 1);
	}

	public static void main(String[] args) {
		System.out.println(new A0022().generateParenthesis(3));
	}

}
