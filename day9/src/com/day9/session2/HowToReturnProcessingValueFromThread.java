package com.day9.session2;

//wait and notify..
class Cal implements Runnable {
	private int x, y;
	private int sum = 0;
	private boolean isDone = false;

	public Cal(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getResut() {
		if (!isDone) {
			synchronized (this) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return sum;
	}

	@Override
	public void run() {
		sum = x + y;
		isDone = true;
		synchronized (this) {
			notify();
		}
	}

}

public class HowToReturnProcessingValueFromThread {

	public static void main(String[] args) throws InterruptedException {
		Cal cal = new Cal(3, 5);
		Thread thread = new Thread(cal);
		thread.start();
		// thread.run();
		// thread.join();
		// Thread.currentThread().sleep(100);
		System.out.println(cal.getResut());
	}

}
