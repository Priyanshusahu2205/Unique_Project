package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {
		//declaration
		ArrayList a1 = new ArrayList();
		//List a1 = new ArrayList();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a1.add(10);
		a1.add('R');
		a1.add("Java");
		a1.add(true);
		a1.add(2.50);
		a1.add(null);
		System.out.println(a1);
		//size
		System.out.println("Size of list="+a1.size());
		a1.remove(1);
		System.out.println(a1);
		//retrivale
		System.out.println(a1.get(4));
		//replace
		a1.set(1, "Welcome");
		System.out.println(a1);
		a2.add(40);
		a2.add(50);
		a2.add(10);
		a2.add(30);
		a2.add(20);
		System.out.println("a2="+a2);
		System.out.println(a1);
		System.out.println(a1.contains("Welcome"));
		//for each read
		for(Object o : a2) {
			System.out.println("Reading the data from list="+o);
			
		}
		System.out.println(a1.isEmpty());
		
		ArrayList a1_duplicate = new ArrayList();
		a1_duplicate.addAll(a1);
		System.out.println(a1_duplicate);
		a1_duplicate.removeAll(a1_duplicate);
		System.out.println(a1);
		//sort collection sort
		Collections.sort(a2);
		System.out.println("After Sorting:"+a2);
		
	}
	
}