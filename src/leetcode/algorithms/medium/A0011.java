package leetcode.algorithms.medium;

/**
 * 11. 盛最多水的容器
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 
 * 示例:
 * 输入: [1,8,6,2,5,4,8,3,7]
 * 输出: 49
 *
 */

public class A0011 {

	public int maxArea(int[] height) {
		int i = 0, j = height.length - 1;
		int maxArea = 0;
		while (i < j) {
			maxArea = Math.max((j - i) * Math.min(height[i], height[j]), maxArea);
			if (height[i] < height[j])
				i++;
			else
				j--;
		}
		return maxArea;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
