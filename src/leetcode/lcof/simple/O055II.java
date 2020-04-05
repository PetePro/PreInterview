package leetcode.lcof.simple;

import leetcode.TreeNode;

/**
 * 面试题55 - II. 平衡二叉树
 * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 *
 */

public class O055II {

	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
		if (Math.abs(deep(root.left) - deep(root.right)) <= 1)
			return isBalanced(root.left) && isBalanced(root.right);
		return false;
	}

	private int deep(TreeNode root) {
		if (root == null)
			return 0;
		return Math.max(deep(root.left), deep(root.right)) + 1;
	}

}
