package leetcode.lcof.medium;

import java.util.ArrayList;
import java.util.List;

import leetcode.TreeNode;

/**
 * 面试题34. 二叉树中和为某一值的路径
 * 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
 *
 */

public class O034 {

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		pathSum(root, sum, res, path);
		return res;
	}

	public void pathSum(TreeNode root, int sum, List<List<Integer>> res, List<Integer> path) {
		if (root == null)
			return;
		path.add(root.val);
		sum -= root.val;
		if (root.left == null && root.right == null && sum == 0) {
			res.add(new ArrayList<>(path));
			path.remove(path.size() - 1);
			return;
		}
		pathSum(root.left, sum, res, path);
		pathSum(root.right, sum, res, path);
		path.remove(path.size() - 1);
	}

}
