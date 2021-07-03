package leetcode.lcof.simple;

/**
 * 面试题15. 二进制中1的个数
 * 请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。
 * 例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。
 * 
 * 思路：把一个整数减去1，再和原整数做与运算，会把该整数最右边一个1变成0.那么一个整数的二进制有多少个1，就可以进行多少次这样的操作。
 *
 */

public class O015 {

	// you need to treat n as an unsigned value
	public int hammingWeight(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n &= (n - 1);
		}
		return count;
	}

	public int hammingWeight2(int n) {
		int count = 0;
		while (n != 0) {
			if ((n & 1) != 0)
				count++;
			n = n >>> 1;
		}
		return count;
	}

}
