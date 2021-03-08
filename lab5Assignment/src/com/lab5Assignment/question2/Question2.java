package com.lab5Assignment.question2;

import java.util.Random;

class MyThread implements Runnable{
	
	private int Sumvalue;

	public MyThread(int val) {
		this.Sumvalue=val;
		}

	@Override
	public void run() {
		getSum();
		
	}

	public int getSum() {
		Random random=new Random();
		int num=random.nextInt(10)+1;
		System.out.println("random number :"+num);
		return this.Sumvalue+=num;
	}
	
}

public class Question2 {

	public static void main(String[] args) {
		int val=0;
		MyThread thread=new MyThread(val);
		Thread thr1=new Thread(thread,"1");
		Thread thr2=new Thread(thread,"2");
		Thread thr3=new Thread(thread,"3");
		Thread thr4=new Thread(thread,"4");
		Thread thr5=new Thread(thread,"5");
		thr1.start();
		thr2.start();
		thr3.start();
		thr4.start();
		thr5.start();
		try {
			thr1.join();
			thr2.join();
			thr3.join();
			thr4.join();
			thr5.join();
			
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		System.out.println("sum= "+thread.getSum());
		System.out.println("main thread end....");
	}
	}


