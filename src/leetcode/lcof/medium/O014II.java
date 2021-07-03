package leetcode.lcof.medium;

/**
 * 面试题14- II. 剪绳子 II
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m] 。
 * 请问 k[0]*k[1]*...*k[m] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * 
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 */

public class O014II {

	public int cuttingRope(int n) {
		if (n <= 3)
			return n - 1;
		long sum = 1;
		while (n > 4) {
			sum *= 3;
			n -= 3;
			sum %= 1000000007;
		}
		sum *= n;
		return (int) (sum %= 1000000007);
	}

}
