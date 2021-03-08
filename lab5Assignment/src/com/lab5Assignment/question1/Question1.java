package com.lab5Assignment.question1;


class MyThread implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<=100;i++) {
			synchronized (this) {
				System.out.println("[Thread "+Thread.currentThread().getName() +": "+ i +"]" );	
			}
		
		}
	}
	
}
public class Question1 {

	public static void main(String[] args) {
		MyThread job=new MyThread();
		Thread thr1=new Thread(job,"1");
		Thread thr2=new Thread(job,"2");
		Thread thr3=new Thread(job,"3");
			thr1.start();
			thr2.start();
			thr3.start();
	}

}
