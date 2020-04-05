package leetcode.lcof.medium;

/**
 * 面试题64. 求1+2+…+n
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * 
 * 这个特性实际叫做“骤死性评估”，是一种语言特性，即左侧的表达式为假时整个表达式后续将不再进行评估。
 *
 */

public class O064 {

	@SuppressWarnings("unused")
	public int sumNums(int n) {
		int sum = n;
		boolean flag = n > 0 && (sum += sumNums(n - 1)) > 0;
		return sum;
	}

}
