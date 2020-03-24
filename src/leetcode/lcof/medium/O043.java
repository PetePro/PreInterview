package leetcode.lcof.medium;

/**
 * 面试题43. 1～n整数中1出现的次数
 * 输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数。
 * 例如，输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次。
 * 
 * 思路：求高位以及不断乘10取当前位的i需要用long表示，因为取一些很大的int的高位就溢出了
 *
 */

public class O043 {

	public int countDigitOne(int n) {
		int count = 0;
		long i = 1; // 从个位开始遍历到最高位
		while (n / i != 0) {
			long high = n / (10 * i); // 高位
			long cur = (n / i) % 10; // 当前位
			long low = n - (n / i) * i;
			if (cur == 0)
				count += high * i;
			else if (cur == 1)
				count += high * i + (low + 1);
			else
				count += (high + 1) * i;
			i = i * 10;
		}
		return count;
	}

	public static void main(String[] args) {
		new O043().countDigitOne(13);
	}

}
