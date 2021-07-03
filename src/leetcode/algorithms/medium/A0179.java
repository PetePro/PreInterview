package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数。
 *
 */

public class A0179 {

	public String largestNumber(int[] nums) {
		List<String> list = new ArrayList<>();
		for (int num : nums)
			list.add(String.valueOf(num));
		list.sort((o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        String result = String.join("", list);
        if (result.charAt(0) == '0')
            return "0";
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
