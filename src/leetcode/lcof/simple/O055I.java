package leetcode.lcof.simple;

import leetcode.TreeNode;

/**
 * 面试题55 - I. 二叉树的深度
 * 输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
 *
 */

public class O055I {

	int depth = 0, maxDepth = 0;

	public int maxDepth(TreeNode root) {
		deep(root);
		return maxDepth;
	}

	private void deep(TreeNode root) {
		if (root == null) {
			maxDepth = Math.max(depth, maxDepth);
			return;
		}
		depth++;
		deep(root.left);
		deep(root.right);
		depth--;
	}

}
