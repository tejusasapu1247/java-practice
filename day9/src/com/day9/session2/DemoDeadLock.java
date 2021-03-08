package com.day9.session2;

public class DemoDeadLock {

	public static void main(String[] args) {
		final Object r1="r1";
		final Object r2="r2";
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (r1) {
					System.out.println("thread1 got lock on r1");
					try {
						Thread.sleep(1000);
					}catch (Exception e) {
						}
				}
				synchronized (r2) {
					System.out.println("thread1 got lock on r2");
				}
			}
		});
		
Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (r1) {
					System.out.println("thread2 got lock on r1");
					try {
						Thread.sleep(1000);
					}catch (Exception e) {
						}
				}
				synchronized (r2) {
					System.out.println("thread2 got lock on r2");
				}
			}
		});
t1.start();
t2.start();
	}

}
