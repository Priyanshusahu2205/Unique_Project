package com.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntrysetHashmap {
	
	public static void main(String[] args) {
		HashMap<String,Integer> books = new HashMap<>();
		books.put("Maths",1200);
		books.put("Physics",1000);
		books.put("Chemistry",800);
		books.put("Biology",500);
		books.put("English",900);
		
		System.out.println("Books and Prices:");
		System.out.println(" ");
		Set<Map.Entry<String, Integer>> s = books.entrySet();
		
		for(Map.Entry<String,Integer> it:s) {
			System.out.println("Single Entry reading="+it.getKey()+"-"+it.getValue());
			
		}
		System.out.println(" ");
		
		 Iterator<Map.Entry<String, Integer>> it = s.iterator();
		while(it.hasNext()) {
			Map.Entry<String,Integer> entry=it.next();
			System.out.println("Using iterator - Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
		
	}

}
