package leetcode.lcof.simple;

import java.util.ArrayList;

/**
 * 面试题62. 圆圈中最后剩下的数字
 * 0,1,...,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字。求出这个圆圈里剩下的最后一个数字。
 * 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
 *
 */

public class O062 {

	public int lastRemaining(int n, int m) {
		ArrayList<Integer> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++)
			list.add(i);
		int idx = 0;
		while (n > 1) {
			idx = (idx + m - 1) % n;
			list.remove(idx);
			n--;
		}
		return list.get(0);
	}

}
