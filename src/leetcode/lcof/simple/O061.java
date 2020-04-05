package leetcode.lcof.simple;

import java.util.Arrays;

/**
 * 面试题61. 扑克牌中的顺子
 * 从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 *
 */

public class O061 {

	public boolean isStraight(int[] nums) {
		Arrays.sort(nums);
		int i = 0;
		while (i < 5 && nums[i] == 0)
			i++;
		int count = i, expected = nums[i++] + 1;
		while (i < 5) {
			if (nums[i] == expected++)
				i++;
			else if ((count--) == 0)
				return false;
		}
		return true;
	}

}
