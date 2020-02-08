package leetcode.algorithms.medium;

/**
 * 6. Z 字形变换
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 * 
 * 示例 1:
 * 输入: s = "LEETCODEISHIRING", numRows = 3
 * 输出: "LCIRETOESIIGEDHN"
 * 
 * 示例 2:
 * 输入: s = "LEETCODEISHIRING", numRows = 4
 * 输出: "LDREOEIIECIHNTSG"
 * 解释:
 * L     D     R
 * E   O E   I I
 * E C   I H   N
 * T     S     G
 *
 */

public class A0006 {

	public String convert(String s, int numRows) {
		int gap = numRows * 2 - 2;
		String res = "";
		if (s == null || s.length() == 0)
			return res;
		if (s.length() < numRows || numRows == 1)
			return s;
		for (int i = 0; i < numRows; i++) {
			res += s.charAt(i);
			int j = i;
			if (i == 0 || i == numRows - 1)
				while (j + gap < s.length()) {
					res += s.charAt(j + gap);
					j = j + gap;
				}
			else {
				int tgap = gap - i * 2;
				while (j + tgap < s.length()) {
					res += s.charAt(j + tgap);
					if (j + gap < s.length())
						res += s.charAt(j + gap);
					j = j + gap;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(new A0006().convert("A", 2));
	}

}
