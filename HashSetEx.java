package com.listInterface;

import java.util.HashSet;

public class HashSetEx {
	
	public static void main(String[] args) {
		
		HashSet h1 = new HashSet(100);
		HashSet h2 = new HashSet(100,(float) 0.90);
		
		HashSet<Integer> h3 = new HashSet<Integer>();
		
		//Add
		h1.add('R');
		h1.add(50);
		h1.add(null);
		h1.add(50);
		System.out.println(h1);
		
		h1.add(10);
		h1.add(78);
		System.out.println(h1);
		System.out.println(h1.contains('R'));
		System.out.println("size of list="+h1.size());
		h1.remove(50);
		System.out.println(h1);
		
		System.out.println(h1.isEmpty());
		System.out.println(h1.contains(44));
		System.out.println(h1.size());

	}

}
