package com.queueInterface;

import java.util.PriorityQueue;

public class PriorityQueueEx {
	
	public static void main(String[] args) {
		
		PriorityQueue<String> q = new PriorityQueue<String>();
		
		q.add("C");
		q.add("C++");
		q.add("Python");
		q.add("Java");
		q.add("PHP");
		System.out.println(q);
		System.out.println(q.size());
		
		q.offer("SQL");
		System.out.println(q);
		q.remove();
		System.out.println(q);
		//q.remove();
		//System.out.println(q);
		System.out.println("the front element is : "+q.element());
		System.out.println("the front element is : "+q.peek());
		//q.clear();
		//System.out.println(q);
		System.out.println("the front element is : "+q.element());
		System.out.println("the front element is : "+q.peek());
		q.remove();
		System.out.println(q.poll());

	}

}
