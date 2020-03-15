package leetcode.lcof.medium;

/**
 * 面试题33. 二叉搜索树的后序遍历序列
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
 *
 */

public class O033 {

	public boolean verifyPostorder(int[] postorder) {
		return recur(postorder, 0, postorder.length - 1);
	}

	boolean recur(int[] postorder, int i, int j) {
		if (i >= j)
			return true;
		int l = i;
		while (postorder[l] < postorder[j])
			l++;
		int m = l;
		while (postorder[l] > postorder[j])
			l++;
		return l == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
	}

}
