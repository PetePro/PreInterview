package leetcode.lcof.simple;

/**
 * 面试题11. 旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  
 * 
 * 思路：二分——只要右边比中间大，那右边一定是有序数组。
 *
 */

public class O011 {

	public int minArray(int[] numbers) {
		int l = 0, r = numbers.length - 1;
		while (l < r) {
			int mid = ((r - l) >> 1) + l;
			if (numbers[r] > numbers[mid])
				r = mid;
			else if (numbers[r] < numbers[mid])
				l = mid + 1;
			else
				r--; //去重
		}
		return numbers[l];
	}

}
