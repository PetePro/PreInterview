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
		List<List<Integer>> res = new ArrayList<>();
		if (root == null)
			return res;
		Deque<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		TreeNode flag = root;
		List<Integer> list = new ArrayList<>();
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			list.add(node.val);
			if (node.left != null)
				queue.offer(node.left);
			if (node.right != null)
				queue.offer(node.right);
			if (flag == node) {
				res.add(list);
				list = new ArrayList<>();
				flag = queue.peekLast();
			}
		}
		return res;
	}

}
