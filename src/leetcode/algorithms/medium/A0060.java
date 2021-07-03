package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 60. 第k个排列
 * 给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。
 * 按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * 给定 n 和 k，返回第 k 个排列。
 *
 */

public class A0060 {

	public String getPermutation(int n, int k) {
		StringBuilder sb = new StringBuilder();
		List<Integer> candidates = new ArrayList<Integer>();
		int[] factorials = new int[n + 1];
		factorials[0] = 1;
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			candidates.add(i);
			fact *= i;
			factorials[i] = fact;
		}
		k -= 1;
		for (int i = n - 1; i >= 0; i--) {
			int index = k / factorials[i];
			sb.append(candidates.remove(index));
			k -= index * factorials[i];
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
