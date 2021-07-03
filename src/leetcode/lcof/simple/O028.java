package leetcode.lcof.simple;

import leetcode.TreeNode;

/**
 * 面试题28. 对称的二叉树
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 *
 */

public class O028 {

	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		return isSymmetric(root.left, root.right);
	}

	public boolean isSymmetric(TreeNode left, TreeNode right) {
		if (left == null && right == null)
			return true;
		if (left == null || right == null)
			return false;
		return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
	}

}
