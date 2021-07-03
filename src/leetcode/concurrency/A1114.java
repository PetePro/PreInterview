package leetcode.concurrency;

public class A1114 {

	/* 自旋 
	private volatile int flag = 1;
	
	public void first(Runnable printFirst) throws InterruptedException {
		printFirst.run();
		flag = 2;
	}
	
	public void second(Runnable printSecond) throws InterruptedException {
		while (flag != 2)
			;
		printSecond.run();
		flag = 3;
	}
	
	public void third(Runnable printThird) throws InterruptedException {
		while (flag != 3)
			;
		printThird.run();
	}*/

	/* 阻塞 */
	private int flag = 1;

	public void first(Runnable printFirst) throws InterruptedException {
		synchronized (this) {
			if (flag != 1)
				this.wait();
			printFirst.run();
			flag++;
			this.notifyAll();
		}
	}

	public void second(Runnable printSecond) throws InterruptedException {
		synchronized (this) {
			if (flag != 2)
				this.wait();
			printSecond.run();
			flag++;
			this.notifyAll();
		}
	}

	public void third(Runnable printThird) throws InterruptedException {
		synchronized (this) {
			if (flag != 3)
				this.wait();
			printThird.run();
			this.notifyAll();
		}
	}

	public static void main(String[] args) {
		A1114 a = new A1114();
		Thread t1 = new Thread(() -> {
			try {
				a.first(() -> {
					System.out.println("One");
				});
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		Thread t2 = new Thread(() -> {
			try {
				a.second(() -> {
					System.out.println("Two");
				});
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		Thread t3 = new Thread(() -> {
			try {
				a.third(() -> {
					System.out.println("Three");
				});
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		t1.start();
		t3.start();
		t2.start();
	}

}
