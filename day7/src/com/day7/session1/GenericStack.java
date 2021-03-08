package com.day7.session1;

class StackFullException extends RuntimeException{
	public StackFullException(String arg0) {
		super(arg0);

	}
	
}
class StackEmptyException extends RuntimeException{
	public StackEmptyException(String arg0) {
		super(arg0);

	}
	
}

class Stack<T>{
	private T x[];
	private final int SIZE;
	private int top;
	public Stack(){
		SIZE=5;
		x=(T[])new Object[SIZE];
		top=-1;
	}
	public void push(T data) {
		if(stackFull()) {
			throw new StackFullException("stack is full");
		}
		x[++top]=data;
	}
	private boolean stackFull() {
		// TODO Auto-generated method stub
		return top==SIZE-1;
	}
	public T pop() {
		if(stackEmpty()) {
			throw new StackEmptyException("stack is empty");
		}
		T data=x[top];
		//data=null;
		top--;
		return data;
	}
	private boolean stackEmpty() {
		// TODO Auto-generated method stub
		return top==-1;
	}
}
public class GenericStack {

	public static void main(String[] args) {
		Stack<Student> s=new Stack<>();
		s.push(new Student(121, "teju", 23));
		s.push(new Student(122, "dsc", 34));
		s.push(new Student(123, "csfds", 13));
		s.push(new Student(124, "bgfnfgv ", 88));
		s.push(new Student(125, "adesc", 100));
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		//System.out.println(s.pop());
		/*Stack<Double> s=new Stack();
		s.push(123.0);
		s.push(123.6);
		s.push(123.5);
		s.push(123.4);
		s.push(123.2);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.push(123.5);
		s.push(123.5);
		*/
		

	}

}
