package leetcode.lcof.medium;

/**
 * 面试题63. 股票的最大利润
 * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 *
 */

public class O063 {

	public int maxProfit(int[] prices) {
		int res = 0;
		for (int i = 1; i < prices.length; i++) {
			res = Math.max(res, prices[i] - prices[i - 1]);
			prices[i] = Math.min(prices[i], prices[i - 1]);
		}
		return res;
	}

}
