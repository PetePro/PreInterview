package leetcode.concurrency;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class A1116 {

	private int n;

	public A1116(int n) {
		this.n = n;
	}

	Semaphore zero = new Semaphore(1);
	Semaphore even = new Semaphore(0);
	Semaphore odd = new Semaphore(0);

	// printNumber.accept(x) outputs "x", where x is an integer.
	public void zero(IntConsumer printNumber) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			zero.acquire();
			printNumber.accept(0);
			if ((i & 1) == 0)
				odd.release();
			else
				even.release();
		}
	}

	public void even(IntConsumer printNumber) throws InterruptedException {
		for (int i = 2; i <= n; i += 2) {
			even.acquire();
			printNumber.accept(i);
			zero.release();
		}
	}

	public void odd(IntConsumer printNumber) throws InterruptedException {
		for (int i = 1; i <= n; i += 2) {
			odd.acquire();
			printNumber.accept(i);
			zero.release();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
