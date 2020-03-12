package leetcode.algorithms.medium;

import leetcode.ListNode;

/**
 * 24. 两两交换链表中的节点
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * 
 * 示例:
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 *
 */

public class A0024 {

	public ListNode swapPairs(ListNode head) {
		ListNode res = new ListNode(0);
		res.next = head;
		ListNode p = res, q;
		while (p.next != null && p.next.next != null) {
			q = p.next;
			p.next = q.next;
			q.next = q.next.next;
			p.next.next = q;
			p = q;
		}
		return res.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
