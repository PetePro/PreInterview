package leetcode.lcof.simple;

/**
 * 面试题17. 打印从1到最大的n位数
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 * 
 * 说明：需要考虑大数问题
 * 
 */

import java.util.ArrayList;

public class O017 {

	public int[] printNumbers(int n) {
		ArrayList<Integer> ret = new ArrayList<>();
		int[] cur = new int[n];
		helper(ret, cur, n, 0);
		return ret.stream().mapToInt(i -> i).toArray();
	}

	public void helper(ArrayList<Integer> ret, int[] cur, int n, int index) {
		if (index >= n) {
			int num = arrayToInt(cur);
			if (num != 0)
				ret.add(arrayToInt(cur));
			return;
		}
		for (int i = 0; i <= 9; i++) {
			cur[index] = i;
			helper(ret, cur, n, index + 1);
		}
	}

	public int arrayToInt(int[] arr) {
		int res = 0;
		for (int i = 0; i < arr.length; i++)
			res = res * 10 + arr[i];
		return res;
	}

}
