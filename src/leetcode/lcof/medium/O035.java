package leetcode.lcof.medium;

import leetcode.Node;

/**
 * 面试题35. 复杂链表的复制
 * 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
 * 
 * 思路：
 * 步骤一：在当前结点后复制一个同样的
 * 步骤二：补全各个新结点的random
 * 步骤三：拆分
 *
 */

public class O035 {

	public Node copyRandomList(Node head) {
		if (head == null)
			return null;
		Node cur = head;
		while (cur != null) {
			Node node = new Node(cur.val);
			node.next = cur.next;
			cur.next = node;
			cur = cur.next.next;
		}
		cur = head;
		while (cur != null) {
			if (cur.random != null)
				cur.next.random = cur.random.next;
			cur = cur.next.next;
		}
		cur = head;
		Node newHead = head.next, newCur = newHead;
		while (cur != null) {
			cur.next = cur.next.next;
			cur = cur.next;
			if (newCur.next != null) {
				newCur.next = newCur.next.next;
				newCur = newCur.next;
			}
		}
		return newHead;
	}

}
