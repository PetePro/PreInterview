package leetcode.lcof.simple;

import leetcode.ListNode;

/**
 * 面试题25. 合并两个排序的链表
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 *
 */

public class O025 {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode p = l1, q = l2, r = head;
		while (p != null && q != null) {
			if (p.val <= q.val) {
				r.next = p;
				p = p.next;
			} else {
				r.next = q;
				q = q.next;
			}
			r = r.next;
		}
		if (p != null)
			r.next = p;
		if (q != null)
			r.next = q;
		return head.next;
	}

}
