package leetcode.lcof.medium;

import java.util.Stack;

/**
 * 面试题31. 栈的压入、弹出序列
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如，序列 {1,2,3,4,5} 是某栈的压栈序列，序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列
 * 
 * hint：不用栈：向后随便找，向前不能跳。
 *
 */

public class O031 {

	public boolean validateStackSequences(int[] pushed, int[] popped) {
		Stack<Integer> stack = new Stack<>();
		int j = 0;
		for (int i = 0; i < pushed.length; i++) {
			stack.push(pushed[i]);
			while (!stack.isEmpty() && j < popped.length && popped[j] == stack.peek()) {
				stack.pop();
				j++;
			}
		}
		return stack.isEmpty();
	}

}
