package com.day9.session1.threads;
class MyJob implements Runnable{

	@Override
	public void run() {
		System.out.println("job done by thrad:: "+Thread.currentThread().getName());
		
	}
	
}
public class DemoThread {

	public static void main(String[] args) {
		System.out.println("main starts");
		System.out.println(Thread.currentThread().getName());		
//		try {
//			Thread.sleep(2000);
//		}catch(InterruptedException e) {
//			
//		}
//		System.out.println(Thread.currentThread().getName());
//		System.out.println("main ends");
//		//System.out.println(Thread.currentThread().getPriority());
//		//System.out.println(Thread.currentThread().getThreadGroup());
//		
		MyJob job=new MyJob();
		Thread thr1=new Thread(job,"A");
		Thread thr2=new Thread(job,"B");
		Thread thr3=new Thread(job,"c");
		Thread thr4=new Thread(job,"D");
		Thread thr5=new Thread(job,"E");
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
		System.out.println("main ends");
	}

}
