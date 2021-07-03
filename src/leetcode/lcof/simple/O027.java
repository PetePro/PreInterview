package leetcode.lcof.simple;

import leetcode.TreeNode;

/**
 * 面试题27. 二叉树的镜像
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 *
 */

public class O027 {

	public TreeNode mirrorTree(TreeNode root) {
		if (root == null)
			return null;
		TreeNode left = mirrorTree(root.right);
		TreeNode right = mirrorTree(root.left);
		root.left = left;
		root.right = right;
		return root;
	}

}
