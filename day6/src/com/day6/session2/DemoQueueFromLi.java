package com.day6.session2;

import java.util.LinkedList;

class Queue{
	private LinkedList<String> list;
	public Queue() {
		list= new LinkedList<>();
	}
	public void addQueue(String data) {
		list.add(data);
	}
	public void removeQueue() {
		list.remove();
	}
	@Override
	public String toString() {
		return "Queue [list=" + list + "]";
	}
}
public class DemoQueueFromLi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		q.addQueue("moksha");
		q.addQueue("teju");
		q.addQueue("teju");
		q.addQueue("rowdyy");
		System.out.println(q);
		q.removeQueue();
		q.removeQueue();
		System.out.println(q);
		
		
	}

}
