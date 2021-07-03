package leetcode.lcof.simple;

import leetcode.ListNode;

/**
 * 面试题25. 合并两个排序的链表
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 *
 */

public class O025 {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode res = new ListNode(0);
		ListNode p = res, p1 = l1, p2 = l2;
		while (p1 != null && p2 != null) {
			if (p1.val < p2.val) {
				p.next = p1;
				p1 = p1.next;
			} else {
				p.next = p2;
				p2 = p2.next;
			}
			p = p.next;
		}
		if (p1 != null)
			p.next = p1;
		if (p2 != null)
			p.next = p2;
		return res.next;
	}

	public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode p = null;
		if (l1.val < l2.val) {
			p = l1;
			p.next = mergeTwoLists2(l1.next, l2);
		} else {
			p = l2;
			p.next = mergeTwoLists2(l1, l2.next);
		}
		return p;
	}

}
