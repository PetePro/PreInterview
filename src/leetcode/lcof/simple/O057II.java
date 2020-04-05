package leetcode.lcof.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题57 - II. 和为s的连续正数序列
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 *
 */

public class O057II {

	public int[][] findContinuousSequence(int target) {
		int l = 1, r = 2;
		List<int[]> list = new ArrayList<int[]>();
		while (l < r) {
			int sum = (l + r) * (r - l + 1) / 2;
			if (sum > target)
				l++;
			else if (sum < target)
				r++;
			else {
				int[] a = new int[r - l + 1];
				int k = 0;
				for (int i = l; i < r + 1; i++)
					a[k++] = i;
				list.add(a);
				l++;
				r++;
			}
		}
		int[][] res = new int[list.size()][];
		for (int i = 0; i < res.length; i++)
			res[i] = list.get(i);
		return res;
	}

	public int[][] find2(int target) {
		List<int[]> list = new ArrayList<int[]>();
		int bg = -1, ed = -1;
		for (int i = 2; i <= target; ++i) {
			// 奇数，中位数一定是整数
			if (i % 2 == 1 && target % i == 0) {
				int mid = target / i;
				bg = mid - (i - 1) / 2;
				ed = mid + (i - 1) / 2;
				if (bg > 0) {
					int[] a = new int[ed - bg + 1];
					int k = 0;
					for (int j = bg; j <= ed; ++j)
						a[k++] = j;
					list.add(a);
				}
			}
			// 偶数，中位数一定是0.5形式
			if (i % 2 == 0 && (double) target / i - target / i == 0.5f) {
				int mid = target / i;
				bg = mid - i / 2 + 1;
				ed = mid + i / 2;
				if (bg > 0) {
					int[] a = new int[ed - bg + 1];
					int k = 0;
					for (int j = bg; j <= ed; ++j)
						a[k++] = j;
					list.add(a);
				}
			}
		}
		int[][] res = new int[list.size()][];
		for (int i = 0; i < res.length; i++)
			res[i] = list.get(i);
		return res;
	}

}
