package leetcode.algorithms.medium;

import leetcode.ListNode;

/**
 * 19. 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 *
 */

public class A0019 {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode p = head, q = head;
		for (int i = 0; i < n; i++) {
			if (q.next != null)
				q = q.next;
			else
				return head.next;
		}
		while (q.next != null) {
			p = p.next;
			q = q.next;
		}
		p.next = p.next.next;
		return head;
	}

	public static void main(String[] args) {

	}

}
