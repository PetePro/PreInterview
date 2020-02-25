package leetcode.algorithms.difficult;

/**
 * 42. 接雨水
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * 由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6个单位的雨水（蓝色部分表示雨水）。
 * 
 * 示例:
 * 输入: [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出: 6
 * 
 * 思路：水有多高取决于这个点左侧和右侧墙壁的最大高度。
 * 第一个for循环找每个点的左侧最大高度，第二个for循环找每个点右侧的最大高度，循环中跳过最左侧(i=0)和最右侧点(i=vector.size()-1)的原因是这两个点由于没有左侧墙壁或右侧墙壁所以最大墙壁高度肯定是0，故在初始化数组的时候已经将其默认设置成0了。
 * 在得到所有点的左右墙壁最大高度后，木桶原理取左右墙壁较低的那个高度减去当前位置墙壁作为地面的高度就得到了这个位置上水的高度。然后将所有点的水高度相加即为解。
 *
 */

public class A0042 {

	public int trap(int[] height) {
		int res = 0;
		int n = height.length;
		int[] left = new int[n];
		int[] right = new int[n];
		for (int i = 1; i < n; i++)
			left[i] = Math.max(left[i - 1], height[i - 1]);
		for (int i = n - 2; i >= 0; i--)
			right[i] = Math.max(right[i + 1], height[i + 1]);
		for (int i = 0; i < n; i++)
			res += Math.max(0, Math.min(left[i], right[i]) - height[i]);
		return res;
	}

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(new A0042().trap(height));
	}

}
