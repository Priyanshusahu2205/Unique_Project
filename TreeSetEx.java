package com.iteratorTree;
import java.util.Iterator;
import java.util.*;

public class TreeSetEx {
	
public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Raaj");
		ts.add("Shipra");
		ts.add("Priya");
		
		Iterator<String> it =ts.iterator();
		while(it.hasNext()) {
			String element=it.next();
			System.out.println(element);
			
		}
	}
}
