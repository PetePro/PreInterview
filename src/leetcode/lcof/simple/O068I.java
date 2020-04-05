package leetcode.lcof.simple;

import leetcode.TreeNode;

/**
 * 面试题68 - I. 二叉搜索树的最近公共祖先
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 *
 */

public class O068I {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null)
			return root;
		if (root.val < p.val && root.val < q.val)
			return lowestCommonAncestor(root.right, p, q);
		if (root.val > p.val && root.val > q.val)
			return lowestCommonAncestor(root.left, p, q);
		return root;
	}

}
