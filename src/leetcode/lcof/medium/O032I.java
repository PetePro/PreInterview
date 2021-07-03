package leetcode.lcof.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leetcode.TreeNode;

/**
 * 面试题32 - I. 从上到下打印二叉树
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 *
 */

public class O032I {

	public int[] levelOrder(TreeNode root) {
		if (root == null)
			return new int[0];
		List<Integer> list = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			list.add(node.val);
			if (node.left != null)
				queue.offer(node.left);
			if (node.right != null)
				queue.offer(node.right);
		}
		int[] res = new int[list.size()];
		for (int i = 0; i < list.size(); i++)
			res[i] = list.get(i);
		return res;
	}

}
