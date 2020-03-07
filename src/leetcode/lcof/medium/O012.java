package leetcode.lcof.medium;

/**
 * 面试题12. 矩阵中的路径
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。
 *
 */

public class O012 {

	public boolean exist(char[][] board, String word) {
		int n = board.length, m = board[0].length;
		if (board == null || board[0] == null || n == 0 || m == 0 || word == null || word.equals(""))
            return false;
		boolean[][] isVisited = new boolean[n][m];
		char[] chs = word.toCharArray();
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				if (board[i][j] == chs[0])
					if (dfs(board, isVisited, chs, i, j, 0))
						return true;
		return false;
	}

	private boolean dfs(char[][] board, boolean[][] isVisited, char[] chs, int i, int j, int index) {
		if (index == chs.length)
			return true;
		if (i < 0
				|| j < 0
				|| i == board.length
				|| j == board[0].length
				|| isVisited[i][j]
				|| board[i][j] != chs[index])
			return false;
		isVisited[i][j] = true;
		boolean res = dfs(board, isVisited, chs, i + 1, j, index + 1)
				|| dfs(board, isVisited, chs, i - 1, j, index + 1)
				|| dfs(board, isVisited, chs, i, j + 1, index + 1)
				|| dfs(board, isVisited, chs, i, j - 1, index + 1);
		isVisited[i][j] = false;
		return res;
	}

}
