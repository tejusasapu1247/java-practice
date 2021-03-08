package com.day9.session1.threads;
//class MyThread extends Thread{
//	public void run() {
//		System.out.println("my job is to be done by the thread...");
//	}
//}
public class AnotherWayToCreatethread {

	public static void main(String[] args) {
//MyThread the=new MyThread();
//the.start();
		Thread thread = new Thread
				(new Runnable() {
			public void run() {
				System.out.println("job done by thread");
				
			}
		});  
		thread.start();
	}

}
