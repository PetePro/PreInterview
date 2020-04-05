package leetcode.lcof.medium;

/**
 * 面试题56 - I. 数组中数字出现的次数
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 * 
 * 思路：
 * a^a=0
 * a^0=a
 * a&(-a)=最低位为1的二进制
 *
 */

public class O056I {

	public int[] singleNumbers(int[] nums) {
		int sum = 0;
		for (int num : nums)
			sum ^= num;
		int flag = sum & (-sum);
		int[] result = new int[2];
		for (int num : nums) {
			if ((num & flag) == 0)
				result[0] ^= num;
			else
				result[1] ^= num;
		}
		return result;
	}

}
