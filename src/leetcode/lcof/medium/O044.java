package leetcode.lcof.medium;

/**
 * 面试题44. 数字序列中某一位的数字
 * 数字以0123456789101112131415…的格式序列化到一个字符序列中。在这个序列中，第5位（从下标0开始计数）是5，第13位是1，第19位是4，等等。
 * 请写一个函数，求任意第n位对应的数字。
 *
 */

public class O044 {

	public int findNthDigit(int n) {
		if (n < 10)
			return n;
		// 计算该数字由几位数字组成，找规律，个位数有1*9个，两位数有2*90个，三位数有3*900个...
		int num = 0, i = 0;
		for (; n >= 0; i++) {
			num = n;
			n -= Math.pow(10, i) * 9 * (i + 1);
		}
		int a = (int) ((num - 1) / i + Math.pow(10, i - 1));
		int b = (num - 1) % i;
		return String.valueOf(a).charAt(b) - '0';
	}

}
