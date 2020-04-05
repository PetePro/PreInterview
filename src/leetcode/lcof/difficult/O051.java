package leetcode.lcof.difficult;

/**
 * 面试题51. 数组中的逆序对
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。
 *
 */

public class O051 {

	int count = 0;

	public int reversePairs(int[] nums) {
		sort(nums);
		return count;
	}

	private void sort(int[] nums) {
		int[] temp = new int[nums.length];
		sort(nums, 0, nums.length - 1, temp);
	}

	private void sort(int[] nums, int left, int right, int[] temp) {
		if (left < right) {
			int mid = (left + right) / 2;
			sort(nums, left, mid, temp);
			sort(nums, mid + 1, right, temp);
			merge(nums, left, mid, right, temp);
		}
	}

	private void merge(int[] nums, int left, int mid, int right, int[] temp) {
		int i = left, j = mid + 1;
		int t = 0;
		while (i <= mid && j <= right) {
			if (nums[i] <= nums[j]) {
				temp[t++] = nums[i++];
			} else {
				count += mid - i + 1;
				temp[t++] = nums[j++];
			}
		}
		while (i <= mid) {
			temp[t++] = nums[i++];
		}
		while (j <= right) {
			temp[t++] = nums[j++];
		}
		t = 0;
		while (left <= right)
			nums[left++] = temp[t++];
	}

	public static void main(String[] args) {
		int[] nums = { 1, 9, 4, 6, 8, 7 };
		System.out.println(new O051().reversePairs(nums));
	}

}
