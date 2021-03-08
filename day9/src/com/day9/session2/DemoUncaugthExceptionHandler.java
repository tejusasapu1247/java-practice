package com.day9.session2;

import java.lang.Thread.UncaughtExceptionHandler;

class MyJob implements Runnable{

	@Override
	public void run() {
		
	}
	
}
class MyExhandler implements UncaughtExceptionHandler{

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("");
	}
	
}
public class DemoUncaugthExceptionHandler {

	public static void main(String[] args) {
		
	}

}
