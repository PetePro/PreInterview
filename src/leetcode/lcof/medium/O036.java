package leetcode.lcof.medium;

/**
 * 面试题36. 二叉搜索树与双向链表
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。要求不能创建任何新的节点，只能调整树中节点指针的指向。
 * 
 * 思路：改写中序遍历，遍历过程中使用一全局变量pre存储其前一个结点，当遍历该结点时，只需该节点的前驱(left)指向pre，pre的后继指向该节点。对于头结点应特殊处理。
 *
 */

public class O036 {

	class Node {
		public int val;
		public Node left;
		public Node right;

		public Node() {
		}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, Node _left, Node _right) {
			val = _val;
			left = _left;
			right = _right;
		}
	};

	Node pre = null, head = null;

	public Node treeToDoublyList(Node root) {
		if (root == null)
			return null;
		inOrder(root);
		pre.right = head;
		head.left = pre;
		return head;
	}

	void inOrder(Node root) {
		if (root == null)
			return;
		inOrder(root.left);
		root.left = pre;
		if (pre != null)
			pre.right = root;
		else
			head = root;
		pre = root;
		inOrder(root.right);
	}

}
