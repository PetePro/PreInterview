package leetcode.lcof.simple;

/**
 * 面试题52. 两个链表的第一个公共节点
 * 输入两个链表，找出它们的第一个公共节点。
 * 
 * 思路：设交集链表长c,链表1除交集的长度为a，链表2除交集的长度为b，有
 * a + c + b = b + c + a
 * 若无交集，则a + b = b + a
 */

import leetcode.ListNode;

public class O052 {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode h1 = headA, h2 = headB;
		while (h1 != h2) {
			h1 = h1 == null ? headB : h1.next;
			h2 = h2 == null ? headA : h2.next;
		}
		return h1;
	}

}
