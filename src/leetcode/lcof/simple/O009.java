package leetcode.lcof.simple;

import java.util.Stack;

/**
 * 面试题09. 用两个栈实现队列
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。
 * (若队列中没有元素，deleteHead 操作返回 -1 )
 *
 */

public class O009 {

	Stack<Integer> in;
	Stack<Integer> out;

	public void init() {
		in = new Stack<>();
		out = new Stack<>();
	}

	public void appendTail(int value) {
		while (!out.isEmpty())
			in.push(out.pop());
		in.push(value);
	}

	public int deleteHead() {
		while (!in.isEmpty())
			out.push(in.pop());
		if (out.isEmpty())
			return -1;
		return out.pop();
	}

}
