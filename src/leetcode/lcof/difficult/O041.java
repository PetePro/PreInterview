package leetcode.lcof.difficult;

import java.util.PriorityQueue;

/**
 * 面试题41. 数据流中的中位数
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 * 例如，
 * [2,3,4] 的中位数是 3
 * [2,3] 的中位数是 (2 + 3) / 2 = 2.5
 * 设计一个支持以下两种操作的数据结构：
 * void addNum(int num) - 从数据流中添加一个整数到数据结构中。
 * double findMedian() - 返回目前所有元素的中位数。
 * 
 * 思路：维持一个大顶堆和小顶堆，确保：1、大小顶堆元素数量差小于等于1；2、大顶堆中所有元素均小于小顶堆中元素。
 * 返回结果：大小顶堆元素数量相等时，返回两个堆顶的平均值，否则返回较长堆的堆顶。
 *
 */

public class O041 {

	PriorityQueue<Integer> maxHeap;//大顶
	PriorityQueue<Integer> minHeap;//小顶

	/** initialize your data structure here. */
	public O041() {
		maxHeap = new PriorityQueue<>((n1, n2) -> n2 - n1);
		minHeap = new PriorityQueue<>();
	}

	public void addNum(int num) {
		maxHeap.add(num);
		minHeap.add(maxHeap.poll());
		if (maxHeap.size() + 1 < minHeap.size())
			maxHeap.add(minHeap.poll());
	}

	public double findMedian() {
		if (minHeap.size() > maxHeap.size())
			return minHeap.peek();
		return (double) (maxHeap.peek() + minHeap.peek()) / 2;
	}

}
