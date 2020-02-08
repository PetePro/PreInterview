package leetcode.algorithms.simple;

/**
 * 13. 罗马数字转整数
 *
 */

public class A0013 {

	public int romanToInt(String s) {
		int INT[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String ROMAN[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int res = 0;
		int index = 0;
		for (int i = 0; i < 13; i++) {
			while (index + ROMAN[i].length() <= s.length() && s.startsWith(ROMAN[i])) {
				res += INT[i];
				s = s.substring(index + ROMAN[i].length(), s.length());
			}
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(new A0013().romanToInt("III"));
	}

}
