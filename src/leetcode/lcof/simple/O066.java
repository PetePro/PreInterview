package leetcode.lcof.simple;

/**
 * 面试题66. 构建乘积数组
 * 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B 中的元素 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 *
 */

public class O066 {

	public int[] constructArr(int[] a) {
		int[] left = new int[a.length];
		int[] right = new int[a.length];
		int[] ans = new int[a.length];
		int k = 1;
		for (int i = 0; i < a.length; i++) {
			left[i] = k;
			k = k * a[i];
		}
		k = 1;
		for (int i = a.length - 1; i >= 0; i--) {
			right[i] = k;
			k = k * a[i];
		}
		for (int i = 0; i < a.length; i++)
			ans[i] = left[i] * right[i];
		return ans;
	}

}
