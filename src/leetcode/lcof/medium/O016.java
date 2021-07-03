package leetcode.lcof.medium;

/**
 * 面试题16. 数值的整数次方
 * 实现函数double Power(double base, int exponent)，求base的exponent次方。不得使用库函数，同时不需要考虑大数问题。
 *
 */

public class O016 {

	public double myPow(double x, int n) {
		double res = 1;
		for (int i = n; i != 0; i /= 2) {
			x *= x;
			if (i % 2 != 0)
				res *= x;
		}
		return n < 0 ? 1 / res : res;
	}

}
