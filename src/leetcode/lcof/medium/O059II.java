package leetcode.lcof.medium;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 面试题59 - II. 队列的最大值
 * 请定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。
 * 若队列为空，pop_front 和 max_value 需要返回 -1
 *
 */

public class O059II {

	private Deque<Integer> queue;
	private Deque<Integer> help;

	public O059II() {
		queue = new LinkedList<>();
		help = new LinkedList<>();
	}

	public int max_value() {
		return queue.isEmpty() ? -1 : help.peek();
	}

	public void push_back(int value) {
		queue.offer(value);
		while (!help.isEmpty() && value > help.peekLast())
			help.pollLast();
		help.offer(value);
	}

	public int pop_front() {
		if (queue.isEmpty())
			return -1;
		int val = queue.pop();
		if (help.peek() == val)
			help.pop();
		return val;
	}

}
