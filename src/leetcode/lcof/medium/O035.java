package leetcode.lcof.medium;

import leetcode.Node;

/**
 * 面试题35. 复杂链表的复制
 * 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
 *
 */

public class O035 {

	public Node copyRandomList(Node head) {
		if (head == null)
			return head;
		// 完成链表节点的复制
		Node cur = head;
		while (cur != null) {
			Node copyNode = new Node(cur.val);
			copyNode.next = cur.next;
			cur.next = copyNode;
			cur = cur.next.next;
		}
		// 完成链表复制节点的随机指针复制
		cur = head;
		while (cur != null) {
			if (cur.random != null)
				cur.next.random = cur.random.next;
			cur = cur.next.next;
		}
		// 将链表一分为二
		cur = head;
		Node copyHead = head.next, copyCur = head.next;
		while (cur != null) {
			cur.next = cur.next.next;
			cur = cur.next;
			if (copyCur.next != null) {
				copyCur.next = copyCur.next.next;
				copyCur = copyCur.next;
			}
		}
		return copyHead;
	}

}
