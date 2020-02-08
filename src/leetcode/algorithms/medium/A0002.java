package leetcode.algorithms.medium;

/**
 * 2. 两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4) 
 * 输出：7 -> 0 -> 8 
 * 原因：342 + 465 = 807
 *
 */
public class A0002 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode p = head;
		int carry = 0;
		while (l1 != null && l2 != null) {
			int s = l1.val + l2.val + carry;
			ListNode tmp = new ListNode(s % 10);
			carry = s / 10;
			p.next = tmp;
			p = p.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		while (l1 != null) {
			int s = l1.val + carry;
			ListNode tmp = new ListNode(s % 10);
			carry = s / 10;
			p.next = tmp;
			p = p.next;
			l1 = l1.next;
		}
		while (l2 != null) {
			int s = l2.val + carry;
			ListNode tmp = new ListNode(s % 10);
			carry = s / 10;
			p.next = tmp;
			p = p.next;
			l2 = l2.next;
		}
		if(carry!=0) {
			ListNode tmp = new ListNode(carry);
			p.next = tmp;
			p = p.next;
		}
		return head.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
