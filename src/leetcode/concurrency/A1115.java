package leetcode.concurrency;

public class A1115 {

	private int n;

	public A1115(int n) {
		this.n = n;
	}

	/* 自旋 
	private volatile boolean flag = false;
	
	public void foo(Runnable printFoo) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			while (flag)
				Thread.yield();
			printFoo.run();
			flag = true;
		}
	}
	
	public void bar(Runnable printBar) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			while (!flag)
				Thread.yield();
			printBar.run();
			flag = false;
		}
	}*/

	/* 阻塞 */
	private int count = 0;

	public void foo(Runnable printFoo) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			synchronized (this) {
				if (count % 2 == 1)
					this.wait();
				printFoo.run();
				count++;
				this.notify();
			}
		}
	}

	public void bar(Runnable printBar) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			synchronized (this) {
				if (count % 2 == 0)
					this.wait();
				printBar.run();
				count++;
				this.notify();
			}
		}
	}

	public static void main(String[] args) {
		A1115 a = new A1115(2);
		Thread t1 = new Thread(() -> {
			try {
				a.foo(() -> {
					System.out.println("foo");
				});
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		Thread t2 = new Thread(() -> {
			try {
				a.bar(() -> {
					System.out.println("bar");
				});
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		t1.start();
		t2.start();
	}

}
