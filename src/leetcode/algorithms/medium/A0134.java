package leetcode.algorithms.medium;

/**
 * 在一条环路上有 N 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
 * 你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。你从其中的一个加油站出发，开始时油箱为空。
 * 如果你可以绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1。
 *
 */

public class A0134 {

	public int canCompleteCircuit(int[] gas, int[] cost) {
		int n = gas.length;
		for (int i = 0; i < n; i++) {
			if (gas[i] >= cost[i])
				if (canCompleteCircuit(gas, cost, n, i, gas[i]))
					return i;
		}
		return -1;
	}

	public boolean canCompleteCircuit(int[] gas, int[] cost, int n, int start, int curGas) {
		int i = start, j = i + 1;
		if (j == n)
			j = 0;
		int count = 0;
		while (count < n) {
			if (curGas - cost[i] < 0)
				return false;
			curGas = curGas - cost[i] + gas[j];
			count++;
			i++;
			if (i == n)
				i = 0;
			j++;
			if (j == n)
				j = 0;
		}
		return true;
	}

	public static void main(String[] args) {
		int[] gas = { 2, 3, 4 }, cost = { 3, 4, 3 };
		System.out.println(new A0134().canCompleteCircuit(gas, cost));
	}

}
