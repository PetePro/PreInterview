package leetcode.algorithms.difficult;

import leetcode.ListNode;

/**
 * 23. 合并K个排序链表
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 * 
 * 示例:
 * 输入:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 * 
 * 思路：二分法——转化为两个链表的合并
 *
 */

public class A0023 {

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

	public ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0)
			return null;
		if (lists.length == 1)
			return lists[0];
		if (lists.length == 2)
			return mergeTwoLists(lists[0], lists[1]);
		int mid = lists.length / 2;
		ListNode[] list1 = new ListNode[mid];
		for (int i = 0; i < mid; i++)
			list1[i] = lists[i];
		ListNode[] list2 = new ListNode[lists.length - mid];
		for (int i = mid, j = 0; i < lists.length; i++, j++)
			list2[j] = lists[i];
		return mergeTwoLists(mergeKLists(list1), mergeKLists(list2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
