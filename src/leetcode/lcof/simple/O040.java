package leetcode.lcof.simple;

import java.util.Arrays;

/**
 * 面试题40. 最小的k个数
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 *
 */

public class O040 {

	public int[] getLeastNumbers(int[] arr, int k) {
		int low = 0, high = arr.length - 1;
		while (low < high) {
			int i = partition(arr, low, high);
			if (i >= k)
				high = i - 1;
			if (i <= k)
				low = i + 1;
		}
		return Arrays.copyOf(arr, k);
	}

	private int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		while (low < high) {
			while (low < high && arr[high] >= pivot)
				high--;
			arr[low] = arr[high];
			while (low < high && arr[low] <= pivot)
				low++;
			arr[high] = arr[low];
		}
		arr[low] = pivot;
		return low;
	}

}
