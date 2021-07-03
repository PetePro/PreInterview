package leetcode.algorithms.medium;

import java.util.ArrayList;

/**
 * 54. 螺旋矩阵
 * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 */

import java.util.List;

public class A0054 {

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> res = new ArrayList<Integer>();
		int m = matrix.length, n = matrix[0].length;
		int up = 0, down = m - 1, left = 0, right = n - 1;
		while (true) {
			for (int i = left; i <= right; i++)
				res.add(matrix[up][i]);
			if (++up > down)
				break;
			for (int i = up; i <= down; i++)
				res.add(matrix[i][right]);
			if (--right < left)
				break;
			for (int i = right; i >= left; i--)
				res.add(matrix[down][i]);
			if (--down < up)
				break;
			for (int i = down; i >= up; i--)
				res.add(matrix[i][left]);
			if (++left > right)
				break;
		}
		return res;
	}

}
