package leetcode.lcof.medium;

import leetcode.TreeNode;

/**
 * 面试题26. 树的子结构
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 *
 */

public class O026 {

	public boolean isSubStructure(TreeNode A, TreeNode B) {
		if (A == null || B == null)
			return false;
		return isSub(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
	}

	public boolean isSub(TreeNode A, TreeNode B) {
		if (A == null)
			return false;
		if (B == null)
			return true;
		if (A.val != B.val)
			return false;
		return isSub(A.left, B.left) && isSub(A.right, B.right);
	}

}
