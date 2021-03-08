package com.day9.session2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Calc implements Callable<Integer> {
	private int x, y;

	public Calc(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public Integer call() throws Exception {
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName());
		return x + y;
	}

}

public class DemoThreadPool {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Calc  cal=new Calc(2, 3);
		Future<Integer> future=executorService.submit(cal);
		System.out.println("next line");
		Integer value=future.get();//it block till value is not received it will not go to next
		System.out.println(value);
		executorService.shutdown();
	}

}
