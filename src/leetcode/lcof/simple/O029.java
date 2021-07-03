package leetcode.lcof.simple;

/**
 * 面试题29. 顺时针打印矩阵
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 *
 */

public class O029 {

	public int[] spiralOrder(int[][] matrix) {
		if (matrix.length == 0)
			return new int[0];
		int m = matrix.length, n = matrix[0].length;
		int[] res = new int[m * n];
		int count = 0;
		int left = 0, right = n - 1, up = 0, down = m - 1;
		while (true) {
			for (int i = left; i <= right; i++)
				res[count++] = matrix[up][i];
			if (++up > down)
				break;
			for (int i = up; i <= down; i++)
				res[count++] = matrix[i][right];
			if (--right < left)
				break;
			for (int i = right; i >= left; i--)
				res[count++] = matrix[down][i];
			if (--down < up)
				break;
			for (int i = down; i >= up; i--)
				res[count++] = matrix[i][left];
			if (++left > right)
				break;
		}
		return res;
	}

}
