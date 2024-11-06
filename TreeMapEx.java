package com.lmsInterview9;

import java.util.TreeMap;

public class TreeMapEx {
	
	public static void main(String[] args) {
		
		//create a treemap with values
		TreeMap<String,Integer> tm = new TreeMap<>();
		tm.put("One", 1);
		tm.put("Three", 3);
		tm.put("Two", 2);
		
		//display the treemap
		System.out.println("TreeMap:"+tm);
		
		//removing the removed value
		Integer removeVal =tm.remove("Two");
		System.out.println("Removed value="+removeVal);
		
		//check the entry
		boolean isthreePresent =tm.containsKey("Three");
		System.out.println("Is the entry {Three=3} removed?"+ !isthreePresent);
		
		//display the treemap
		System.out.println("Updated TreeMap:"+tm);
		
	}

}
