package com.setInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ConvertSettoArraylist {
	
	public static void main(String[] args) {
		
		//declaration
		HashSet<Integer> h1 = new  HashSet<Integer>();
		h1.add(10);
		h1.add(30);
		h1.add(40);
		h1.add(80);
		h1.add(1);
		System.out.println("Set="+h1);
		
		ArrayList<Integer> a1 = new ArrayList<Integer>(h1);
		System.out.println("Arraylist="+a1);
		
		Collections.sort(a1);
		System.out.println("After Sorting="+a1);
	
	}

}
