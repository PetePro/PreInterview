package leetcode.lcof.medium;

/**
 * 面试题12. 矩阵中的路径
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。
 * 如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。
 *
 */

public class O012 {

	public boolean exist(char[][] board, String word) {
		int n = board.length, m = board[0].length;
		boolean[][] isVisited = new boolean[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				if (word.charAt(0) == board[i][j])
					if (dfs(board, word, isVisited, n, m, i, j))
						return true;
		return false;
	}

	public boolean dfs(char[][] board, String word, boolean[][] isVisited, int n, int m, int i, int j) {
		if (word.length() == 0)
			return true;
		if (i == n || j == m || i < 0 || j < 0 || board[i][j] != word.charAt(0) || isVisited[i][j])
			return false;
		isVisited[i][j] = true;
		boolean flag = dfs(board, word.substring(1), isVisited, n, m, i + 1, j)
				|| dfs(board, word.substring(1), isVisited, n, m, i, j + 1)
				|| dfs(board, word.substring(1), isVisited, n, m, i - 1, j)
				|| dfs(board, word.substring(1), isVisited, n, m, i, j - 1);
		isVisited[i][j] = false;
		return flag;
	}

}
