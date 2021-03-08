package com.day9.session2;
//class Q{
//    private boolean valueSet=false;
//    
//    private int n;
//
// 
//
//    public synchronized int get() {
//        while(!valueSet){
//            try {
//                wait();
//            } catch (InterruptedException e) {}
//        }
//        
//        System.out.println("got:"+n);
//        valueSet=false;
//        notifyAll();
//        return n;
//    }
//
// 
//
//    public synchronized void put(int n) {
//        while(valueSet){
//            try {
//                wait();
//            } catch (InterruptedException e) {}
//        }
//        
//        System.out.println("put:"+ n);
//        this.n = n;
//        valueSet=true;
//        notifyAll();
//    }
//}

class Q{
	private boolean valuesSet=false;
	private int n;

	public synchronized int get() {
		if(!valuesSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("got :"+n);
		valuesSet=false;
		notifyAll();
		return n;
	}

	public synchronized void put(int n) {
		if(valuesSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("put :"+n);
		this.n = n;
		valuesSet=true;
		notifyAll();
	}
	
}
//class Q{
//	private int n;
//
//	public synchronized int get() {
//		System.out.println("got :"+n);
//		return n;
//	}
//
//	public void put(int n) {
//		System.out.println("put :"+n);
//		this.n = n;
//	}
//	
//}
class Producer implements Runnable{
	private Thread thread;
	private Q q;
	public Producer(Q q) {
		thread=new Thread(this);
		thread.start();
	}
	@Override
	public void run() {
		int i=0;
		while(true) {
			q.put(i++);
		}
	}
	
}
class Consumer implements Runnable{
	private Thread thread;
	private Q q;
	public Consumer(Q q) {
		thread=new Thread(this);
		thread.start();
	}
	@Override
	public void run() {
		while(true) {
			q.get();
		}
	}
	
}
public class DemoPandC {

	public static void main(String[] args) {
		Q q=new Q();
		Producer producer=new Producer(q);
		Consumer consumer= new Consumer(q);
	}

}
