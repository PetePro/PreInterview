package leetcode.lcof.simple;

import leetcode.ListNode;

/**
 * 面试题06. 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 */

public class O006 {

	public int[] reversePrint(ListNode head) {
		int num = 0;
		ListNode p = head;
		while (p != null) {
			num++;
			p = p.next;
		}
		p = head;
		int[] res = new int[num];
		for (int i = num - 1; i >= 0; i--) {
			res[i] = p.val;
			p = p.next;
		}
		return res;
	}

}
