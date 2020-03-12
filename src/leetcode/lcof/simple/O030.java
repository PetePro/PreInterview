package leetcode.lcof.simple;

/**
 * 面试题30. 包含min函数的栈
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 *
 */

public class O030 {

	private Node head;

	private class Node {

		int val;
		int min;
		Node next;

		public Node(int val, int min, Node next) {
			this.val = val;
			this.min = min;
			this.next = next;
		}
	}

	public O030() {

	}

	public void push(int x) {
		if (head == null)
			head = new Node(x, x, null);
		else
			head = new Node(x, Math.min(head.min, x), head);
	}

	public void pop() {
		head = head.next;
	}

	public int top() {
		return head.val;
	}

	public int min() {
		return head.min;
	}

}
