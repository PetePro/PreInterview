package leetcode.lcof.medium;

/**
 * 面试题67. 把字符串转换成整数
 * 写一个函数 StrToInt，实现把字符串转换成整数这个功能。不能使用 atoi 或者其他类似的库函数。
 * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。
 * 当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 * 该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响。
 * 注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。
 * 在任何情况下，若函数不能进行有效的转换时，请返回 0。
 *
 */

public class O067 {

	public int strToInt(String str) {
		int res = 0;
		int flag = 1;
		int i;
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				continue;
			else {
				if (str.charAt(i) == '-') {
					flag = -1;
					i++;
					break;
				}
				if (str.charAt(i) == '+') {
					i++;
					break;
				}
				if (str.charAt(i) < '0' || str.charAt(i) > '9')
					return 0;
				else
					break;
			}
		}
		if (i == str.length())
			return 0;
		for (; i < str.length(); i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9')
				break;
			int pop = str.charAt(i) - '0';
			if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && pop > 7))
				return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			res = res * 10 + pop;
		}
		return flag == 1 ? res : -res;
	}

}
