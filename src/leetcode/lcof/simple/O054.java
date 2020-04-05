package leetcode.lcof.simple;

import leetcode.TreeNode;

/**
 * 面试题54. 二叉搜索树的第k大节点
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 *
 */

public class O054 {

	int count = 0, res = 0;

	public int kthLargest(TreeNode root, int k) {
		inOrder(root, k);
		return res;
	}

	private void inOrder(TreeNode root, int k) {
		if (root == null)
			return;
		inOrder(root.right, k);
		if (++count == k) {
			res = root.val;
			return;
		}
		inOrder(root.left, k);
	}

}
