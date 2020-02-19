package leetcode.algorithms.difficult;

/**
 * 37. 解数独
 * 编写一个程序，通过已填充的空格来解决数独问题。
 *
 * 思路：递归+回溯
 * 
 */

public class A0037 {

	// 记录某行，某位数字是否已经被摆放
	boolean[][] row = new boolean[9][9];
	// 记录某列，某位数字是否已经被摆放
	boolean[][] col = new boolean[9][9];
	// 记录某 3x3 宫格内，某位数字是否已经被摆放
	boolean[][] block = new boolean[9][9];

	public void solveSudoku(char[][] board) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					int num = board[i][j] - '1';
					row[i][num] = true;
					col[j][num] = true;
					block[i / 3 * 3 + j / 3][num] = true;
				}
			}
		}
		dfs(board, 0, 0);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++)
				System.out.print(board[i][j] + " ");
			System.out.println();
		}
	}

	public boolean dfs(char[][] board, int i, int j) {
		while (board[i][j] != '.') {
			if (++j >= 9) {
				i++;
				j = 0;
			}
			if (i >= 9) {
				return true;
			}
		}
		for (int num = 0; num < 9; num++) {
			int blockIndex = i / 3 * 3 + j / 3;
			if (!row[i][num] && !col[j][num] && !block[blockIndex][num]) {
				board[i][j] = (char) (num + '1');
				row[i][num] = true;
				col[j][num] = true;
				block[blockIndex][num] = true;
				if (dfs(board, i, j))
					return true;
				else {
					board[i][j] = '.';
					row[i][num] = false;
					col[j][num] = false;
					block[blockIndex][num] = false;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		char[][] board = new char[][] { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		new A0037().solveSudoku(board);
	}

}
