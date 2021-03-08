package com.day9.session1.threads;

class Printer {
	public void print(String letter) {
		synchronized (this) {
			System.out.print("[");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println(letter + "]");
		}
	}

}

class Client implements Runnable {
	private Printer printer;
	private Thread thread;
	private String letter;

	public Client(Printer printer, String letter) {
		this.printer = printer;
		this.letter = letter;
		this.thread = new Thread(this);
		this.thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		printer.print(letter);
	}

}

public class NeedOfSyn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer();
		Client c1 = new Client(printer, "i love java");
		Client c2 = new Client(printer, "i ##$%^&java");
		Client c3 = new Client(printer, "i love python");
	}

}
