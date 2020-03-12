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
		return isSame(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
	}

	public boolean isSame(TreeNode a, TreeNode b) {
		if (b == null)
			return true;
		if (a == null)
			return false;
		if (a.val != b.val)
			return false;
		return isSame(a.left, b.left) && isSame(a.right, b.right);
	}

}
