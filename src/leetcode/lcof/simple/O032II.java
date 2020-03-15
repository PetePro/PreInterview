package leetcode.lcof.simple;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import leetcode.TreeNode;

/**
 * 面试题32 - II. 从上到下打印二叉树 II
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 *
 */

public class O032II {

	public List<List<Integer>> levelOrder(TreeNode root) {
		Deque<TreeNode> queue = new LinkedList<TreeNode>();
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (root != null)
			queue.add(root);
		TreeNode flag = root;
		List<Integer> ans = new ArrayList<>();
		while (!queue.isEmpty()) {
			TreeNode tmp = queue.poll();
			ans.add(tmp.val);
			if (tmp.left != null)
				queue.add(tmp.left);
			if (tmp.right != null)
				queue.add(tmp.right);
			if (flag == tmp) {
				flag = queue.peekLast();
				res.add(ans);
				ans = new ArrayList<>();
			}
		}
		return res;
	}

}
