package com.iteratorTree;

import java.util.*;
import java.util.Iterator;
import java.util.List;

public class IteratorInterface {
	public static void main(String[] args) {
		
		List<String> li = new ArrayList<String>();
		li.add( "Java");
		li.add( "Python");
		li.add( "C");
		
		Iterator<String> it =li.iterator();
		while(it.hasNext()) {
			String element=it.next();
			System.out.println(element);
			
		}
	}

}
