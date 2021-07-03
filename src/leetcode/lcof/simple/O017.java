package leetcode.lcof.simple;

/**
 * 面试题17. 打印从1到最大的n位数
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 * 
 * 说明：需要考虑大数问题
 * 
 */

public class O017 {

	public int[] printNumbers(int n) {
		int num = (int) Math.pow(10, n) - 1;
		int[] res = new int[num];
		for (int i = 0; i < num; i++)
			res[i] = i + 1;
		return res;
	}

}
