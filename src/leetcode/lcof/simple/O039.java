package leetcode.lcof.simple;

/**
 * 面试题39. 数组中出现次数超过一半的数字
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * 
 * 思路：摩尔投票，不同的数两两抵消，超过一半的数字是抵消后剩余的数字
 *
 */

public class O039 {

	public int majorityElement(int[] nums) {
		int count = 0;
		Integer card = null;
		for (int num : nums) {
			if (count == 0)
				card = num;
			count += (card == num) ? 1 : -1;
		}
		return card;
	}

}
