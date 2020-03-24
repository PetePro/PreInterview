package leetcode.lcof.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题45. 把数组排成最小的数
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 
 * lambda表达式
 *
 */

public class O045 {

	public String minNumber(int[] nums) {
		List<String> list = new ArrayList<>();
		for (int num : nums)
			list.add(String.valueOf(num));
		list.sort((o1, o2) -> (o1 + o2).compareTo(o2 + o1));
		return String.join("", list);
	}

}
