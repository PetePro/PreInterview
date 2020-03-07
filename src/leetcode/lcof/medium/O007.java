package leetcode.lcof.medium;

import java.util.Arrays;

/**
 * 面试题07. 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *
 */

public class O007 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		int n = preorder.length;
		if (n == 0)
			return null;
		int rootIndex = 0;
		for (int i = 0; i < n; i++) {
			if (inorder[i] == preorder[0]) {
				rootIndex = i;
				break;
			}
		}
		TreeNode root = new TreeNode(preorder[0]);
		root.left = buildTree(Arrays.copyOfRange(preorder, 1, 1 + rootIndex),
				Arrays.copyOfRange(inorder, 0, rootIndex));
		root.right = buildTree(Arrays.copyOfRange(preorder, 1 + rootIndex, n),
				Arrays.copyOfRange(inorder, rootIndex + 1, n));
		return root;
	}

}
