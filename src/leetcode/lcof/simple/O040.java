package leetcode.lcof.simple;

import java.util.Arrays;

/**
 * 面试题40. 最小的k个数
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 *
 */

public class O040 {

	public int[] getLeastNumbers(int[] arr, int k) {
		for (int i = (k - 1) / 2; i >= 0; i--)
			adjustHeap(arr, i, k);
		for (int i = k; i < arr.length; i++) {
			if (arr[0] > arr[i]) {
				arr[0] = arr[i];
				adjustHeap(arr, 0, k);
			}
		}
		return Arrays.copyOfRange(arr, 0, k);
	}

	public void adjustHeap(int[] heap, int i, int k) {
		int left = 2 * i + 1, right = 2 * i + 2;
		int max = i;
		if (left < k && heap[left] > heap[max])
			max = left;
		if (right < k && heap[right] > heap[max])
			max = right;
		if (max != i) {
			int temp = heap[i];
			heap[i] = heap[max];
			heap[max] = temp;
			adjustHeap(heap, max, k);
		}
	}

}
