package leetcode.lcof.difficult;

import java.util.LinkedList;
import java.util.Queue;

import leetcode.TreeNode;

/**
 * 面试题37. 序列化二叉树
 * 请实现两个函数，分别用来序列化和反序列化二叉树。
 *
 */

public class O037 {

	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		if (root == null)
			return null;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		String res = "";
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (node == root)
				res = "[" + node.val;
			if (node.left != null) {
				res = res + "," + node.left.val;
				queue.offer(node.left);
			} else
				res = res + "," + "null";
			if (node.right != null) {
				res = res + "," + node.right.val;
				queue.offer(node.right);
			} else
				res = res + "," + "null";
		}
		res += "]";
		return res;
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		//一个数组用于存储所有的节点，一个队列用于存储目前用的根节点
		if (data == null)
			return null;
		Queue<TreeNode> queue = new LinkedList<>();
		data = data.substring(1, data.length() - 1);
		String[] strs = data.split(",");
		TreeNode treeRoot = new TreeNode(Integer.valueOf(strs[0]));
		queue.offer(treeRoot);
		int i = 1;
		while (queue.peek() != null) {
			TreeNode node = queue.poll();
			//左节点
			if (strs[i].equals("null"))
				node.left = null;
			else {
				TreeNode newNode = new TreeNode(Integer.valueOf(strs[i]));
				node.left = newNode;
				queue.offer(newNode);
			}
			//右节点
			if (strs[i + 1].equals("null"))
				node.right = null;
			else {
				TreeNode newNode = new TreeNode(Integer.valueOf(strs[i + 1]));
				node.right = newNode;
				queue.offer(newNode);
			}
			i = i + 2;
		}
		return treeRoot;
	}

}
