package leetcode.algorithms.difficult;

import leetcode.ListNode;

/**
 * 25. K 个一组翻转链表
 * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
 * k 是一个正整数，它的值小于或等于链表的长度。
 * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 * 
 * 示例 :
 * 给定这个链表：1->2->3->4->5
 * 当 k = 2 时，应当返回: 2->1->4->3->5
 * 当 k = 3 时，应当返回: 3->2->1->4->5
 * 
 * 思路：转化为24题的俩俩交换
 *
 */

public class A0025 {

	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode res = new ListNode(0);
		res.next = head;
		ListNode p = res, q = head, r;
		int length = 0;
		while (q != null) {
			length++;
			q = q.next;
		}
		q = head;
		for (int i = 0; i < length / k; i++) {
			for (int j = 0; j < k - 1; j++) {
				r = q.next;
				q.next = r.next;
				r.next = p.next;
				p.next = r;
			}
			p = q;
			q = p.next;
		}
		return res.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
