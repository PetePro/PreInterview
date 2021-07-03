package leetcode.lcof.medium;

/**
 * 面试题33. 二叉搜索树的后序遍历序列
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
 *
 */

public class O033 {

	public boolean verifyPostorder(int[] postorder) {
		return verifyPostorder(postorder, 0, postorder.length - 1);
	}

	public boolean verifyPostorder(int[] postorder, int i, int j) {
		if (i >= j)
			return true;
		int l = i;
		while (postorder[l] < postorder[j])
			l++;
		int r = l;
		while (postorder[r] > postorder[j])
			r++;
		return r == j && verifyPostorder(postorder, i, l - 1) && verifyPostorder(postorder, l, r - 1);
	}

}
