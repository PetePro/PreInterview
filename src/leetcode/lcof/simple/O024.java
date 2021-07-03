package leetcode.lcof.simple;

import leetcode.ListNode;

/**
 * 面试题24. 反转链表
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 *
 */

public class O024 {

	public ListNode reverseList(ListNode head) {
		ListNode pre = null, cur = head;
		while (cur != null) {
			ListNode post = cur.next;
			cur.next = pre;
			pre = cur;
			cur = post;
		}
		return pre;
	}

}
