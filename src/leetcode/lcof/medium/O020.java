package leetcode.lcof.medium;

/**
 * 面试题20. 表示数值的字符串
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100"、"5e2"、"-123"、"3.1416"、"0123"及"-1E-16"都表示数值，
 * 但"12e"、"1a3.14"、"1.2.3"、"+-5"及"12e+5.4"都不是。
 * 
 * 思路: 有效数字的模式只有两种:
 * 1) A[.[B]][e|EC]  比如: +100   -67.0  29.    3.14E5
 * 2) .B[e|EC]       比如: .3     .4E6
 * 其中，A、C是整数，B是正整数； [e|EC]表示[eC]或者[EC]
 * 原则：有A的话，有没有B都可以；没有A的话，必须有B
 *
 */

public class O020 {

	public boolean isNumber(String s) {
		if (s == null || s.length() == 0)
			return false;
		char[] str = s.trim().toCharArray();
		boolean dot = false, e = false, num = false;
		for (int i = 0; i < s.length(); i++) {
			if (str[i] >= '0' && str[i] <= '9') {
				num = true;
			} else if (str[i] == '.') {
				if (dot || e)
					return false;
				dot = true;
			} else if (str[i] == 'e' || str[i] == 'E') {
				if (e || !num)
					return false;
				e = true;
				num = false;
			} else if (str[i] == '+' || str[i] == '-') {
				if (i != 0 && str[i] != 'e' && str[i] != 'E')
					return false;
			} else
				return false;
		}
		return num;
	}

}
