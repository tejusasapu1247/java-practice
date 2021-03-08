package com.day2.session1.stackApp;

public class BookStack {
	private BOok x[];
	private final int SIZE;
	private int top;

	public BookStack() {
		SIZE = 5;
		x = new BOok[SIZE];
		top = -1;

	}

	public BOok pop() {
		BOok value = new BOok(1, "C programming");
		if (isEmpty()) {
			System.out.println("stack is empty....");
		} else {
			value = x[top];
			x[top]=null;
			top--;
		}
		return value;
	}

	private boolean isEmpty() {

		return top==-1?true:false;
	}

	public void push(BOok book) {
		if (isFull()) {
			System.out.print("stack is ful...");
		} else {
			x[++top] = book;
		}
	}

	private boolean isFull() {
		return (top == SIZE - 1) ? true : false;
	}
}
