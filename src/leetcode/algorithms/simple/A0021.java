package leetcode.algorithms.simple;

import leetcode.ListNode;

/**
 * 21. 合并两个有序链表
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * 
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 */

public class A0021 {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode res = new ListNode(0);
		ListNode p = res;
		while (l1 != null && l2 != null) {
			if (l1.val > l2.val) {
				p.next = l2;
				l2 = l2.next;
			} else {
				p.next = l1;
				l1 = l1.next;
			}
			p = p.next;
		}
		if (l1 != null)
			p.next = l1;
		else
			p.next = l2;
		return res.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
