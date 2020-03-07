package leetcode.lcof.simple;

/**
 * 面试题18. 删除链表的节点
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头节点。时间复杂度O(1)
 *
 */

public class O018 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode deleteNode(ListNode head, int val) {
		if (head == null)
			return null;
		if (head.val == val)
			return head.next;
		head.next = deleteNode(head.next, val);
		return head;
	}

}
