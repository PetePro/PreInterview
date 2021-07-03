package leetcode.lcof.medium;

/**
 * 面试题14- I. 剪绳子
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m] 。
 * 请问 k[0]*k[1]*...*k[m] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * 
 * 思路：
 * 1.贪心算法
 * 绳子段切分的越多，乘积越大，且3做因数比2更优。
 * 不断剪去 长度3 并用sum累乘
 * 把绳子切为多个长度为 3 的片段，则留下的最后一段绳子的长度可能为 0,1,2 三种情况。
 * 2.动态规划
 * 动态转移方程：dp[i] = Math.max(dp[i-2] * 2, dp[i-3] * 3);
 *
 */

public class O014I {

	public int cuttingRope(int n) {
		if (n <= 3)
			return n - 1;
		int sum = 1;
		while (n > 4) {
			sum *= 3;
			n -= 3;
		}
		sum *= n;
		return sum;
	}

}
