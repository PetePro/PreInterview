package leetcode.lcof.simple;

import leetcode.ListNode;

/**
 * 面试题06. 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 */

public class O006 {

	public int[] reversePrint(ListNode head) {
		ListNode p = head;
		int n = 0;
		while (p != null) {
			p = p.next;
			n++;
		}
		int[] res = new int[n];
		p = head;
		int i = n - 1;
		while (p != null) {
			res[i--] = p.val;
			p = p.next;
		}
		return res;
	}

}
