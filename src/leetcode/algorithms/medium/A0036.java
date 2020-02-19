package leetcode.algorithms.medium;

/**
 * 36. 有效的数独
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 * 
 * 示例 1:
 * 输入:
 * [
 *   ["5","3",".",".","7",".",".",".","."],
 *   ["6",".",".","1","9","5",".",".","."],
 *   [".","9","8",".",".",".",".","6","."],
 *   ["8",".",".",".","6",".",".",".","3"],
 *   ["4",".",".","8",".","3",".",".","1"],
 *   ["7",".",".",".","2",".",".",".","6"],
 *   [".","6",".",".",".",".","2","8","."],
 *   [".",".",".","4","1","9",".",".","5"],
 *   [".",".",".",".","8",".",".","7","9"]
 * ]
 * 输出: true
 * 示例 2:
 * 输入:
 * [
 *   ["8","3",".",".","7",".",".",".","."],
 *   ["6",".",".","1","9","5",".",".","."],
 *   [".","9","8",".",".",".",".","6","."],
 *   ["8",".",".",".","6",".",".",".","3"],
 *   ["4",".",".","8",".","3",".",".","1"],
 *   ["7",".",".",".","2",".",".",".","6"],
 *   [".","6",".",".",".",".","2","8","."],
 *   [".",".",".","4","1","9",".",".","5"],
 *   [".",".",".",".","8",".",".","7","9"]
 * ]
 * 输出: false
 * 解释: 除了第一行的第一个数字从 5 改为 8 以外，空格内其他数字均与 示例1 相同。
 *      但由于位于左上角的 3x3 宫内有两个 8 存在, 因此这个数独是无效的。
 * 说明:
 * 一个有效的数独（部分已被填充）不一定是可解的。
 * 只需要根据以上规则，验证已经填入的数字是否有效即可。
 * 给定数独序列只包含数字 1-9 和字符 '.' 。
 * 给定数独永远是 9x9 形式的。
 *
 */

public class A0036 {

	public boolean isValidSudoku(char[][] board) {
		boolean res = true;
		for (int i = 0; i < 9; i++) {
			String s = "";
			for (int j = 0; j < 9; j++) {
				char c = board[i][j];
				if (c != '.' && s.contains(c + ""))
					return false;
				if (c != '.')
					s += c;
			}
		}
		for (int j = 0; j < 9; j++) {
			String s = "";
			for (int i = 0; i < 9; i++) {
				char c = board[i][j];
				if (c != '.' && s.contains(c + ""))
					return false;
				if (c != '.')
					s += c;
			}
		}
		String s1 = "", s2 = "", s3 = "";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				char c = board[i][j];
				if (c != '.' && s1.contains(c + ""))
					return false;
				if (c != '.')
					s1 += c;
			}
			for (int j = 3; j < 6; j++) {
				char c = board[i][j];
				if (c != '.' && s2.contains(c + ""))
					return false;
				if (c != '.')
					s2 += c;
			}
			for (int j = 6; j < 9; j++) {
				char c = board[i][j];
				if (c != '.' && s3.contains(c + ""))
					return false;
				if (c != '.')
					s3 += c;
			}
		}
		s1 = "";
		s2 = "";
		s3 = "";
		for (int i = 3; i < 6; i++) {
			for (int j = 0; j < 3; j++) {
				char c = board[i][j];
				if (c != '.' && s1.contains(c + ""))
					return false;
				if (c != '.')
					s1 += c;
			}
			for (int j = 3; j < 6; j++) {
				char c = board[i][j];
				if (c != '.' && s2.contains(c + ""))
					return false;
				if (c != '.')
					s2 += c;
			}
			for (int j = 6; j < 9; j++) {
				char c = board[i][j];
				if (c != '.' && s3.contains(c + ""))
					return false;
				if (c != '.')
					s3 += c;
			}
		}
		s1 = "";
		s2 = "";
		s3 = "";
		for (int i = 6; i < 9; i++) {
			for (int j = 0; j < 3; j++) {
				char c = board[i][j];
				if (c != '.' && s1.contains(c + ""))
					return false;
				if (c != '.')
					s1 += c;
			}
			for (int j = 3; j < 6; j++) {
				char c = board[i][j];
				if (c != '.' && s2.contains(c + ""))
					return false;
				if (c != '.')
					s2 += c;
			}
			for (int j = 6; j < 9; j++) {
				char c = board[i][j];
				if (c != '.' && s3.contains(c + ""))
					return false;
				if (c != '.')
					s3 += c;
			}
		}
		return res;
	}

	public boolean isValidSudoku2(char[][] board) {
		// 记录某行，某位数字是否已经被摆放
		boolean[][] row = new boolean[9][9];
		// 记录某列，某位数字是否已经被摆放
		boolean[][] col = new boolean[9][9];
		// 记录某 3x3 宫格内，某位数字是否已经被摆放
		boolean[][] block = new boolean[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					int num = board[i][j] - '1';
					int blockIndex = i / 3 * 3 + j / 3;
					if (row[i][num] || col[j][num] || block[blockIndex][num]) {
						return false;
					} else {
						row[i][num] = true;
						col[j][num] = true;
						block[blockIndex][num] = true;
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
