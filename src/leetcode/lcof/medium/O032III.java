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
		Deque<TreeNode> queue = new LinkedList<TreeNode>();
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (root != null)
			queue.add(root);
		TreeNode flag = root;
		List<Integer> ans = new ArrayList<>();
		int level = 1;
		while (!queue.isEmpty()) {
			TreeNode tmp = queue.poll();
			ans.add(tmp.val);
			if (tmp.left != null)
				queue.add(tmp.left);
			if (tmp.right != null)
				queue.add(tmp.right);
			if (flag == tmp) {
				flag = queue.peekLast();
				if (level % 2 == 0)
					Collections.reverse(ans);
				res.add(ans);
				level++;
				ans = new ArrayList<>();
			}
		}
		return res;
	}

}
