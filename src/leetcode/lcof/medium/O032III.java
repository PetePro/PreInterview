package leetcode.lcof.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import leetcode.TreeNode;

/**
 * 面试题32 - III. 从上到下打印二叉树 III
 * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 *
 */

public class O032III {

	public List<List<Integer>> levelOrder(TreeNode root) {
		if (root == null)
			return null;
		List<List<Integer>> res = new ArrayList<>();
		Deque<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		TreeNode flag = root;
		int level = 1;
		List<Integer> list = new ArrayList<>();
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			list.add(node.val);
			if (node.left != null)
				queue.offer(node.left);
			if (node.right != null)
				queue.offer(node.right);
			if (flag == node) {
				flag = queue.peekLast();
				if (level % 2 == 0)
					Collections.reverse(list);
				res.add(list);
				level++;
				list = new ArrayList<>();
			}
		}
		return res;
	}

}
