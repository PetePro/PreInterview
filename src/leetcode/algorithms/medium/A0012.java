package leetcode.algorithms.medium;

/**
 * 12. 整数转罗马数字
 * 罗马数字包含以下七种字符： I - 1， V - 5， X - 10， L - 50，C - 100，D - 500 和 M - 1000。
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 *
 */

public class A0012 {

	public String intToRoman(int num) {
		int INT[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String ROMAN[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		String res = "";
		for (int i = 0; i < 13; i++) {
			while (num >= INT[i]) {
				num -= INT[i];
				res += ROMAN[i];
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
