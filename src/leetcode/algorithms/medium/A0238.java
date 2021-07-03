package leetcode.algorithms.medium;

public class A0238 {

	public int[] productExceptSelf(int[] nums) {
		int left = 1, right = 1;
		int[] res = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			res[i] = left;
			left *= nums[i];
		}
		for (int i = nums.length - 1; i >= 0; i--) {
			res[i] *= right;
			right *= nums[i];
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
