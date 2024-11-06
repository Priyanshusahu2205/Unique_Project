package com.lmsInterview9;

import java.util.Map;
//import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeNavigate {
	
	public static void main(String[] args) {
		
		//create a treemap to store string keys and integer values
		TreeMap<String,Integer> tm = new TreeMap<>();
		
		//Adding entries to treemap
		tm.put("One", 1);
		tm.put("Two", 2);
		tm.put("Three", 3);
		tm.put("Four", 4);
		tm.put("Five", 5);
		
		//display the original treemap
		System.out.println("Original TreeMap:"+tm);
		//1.navigating using for each loop on entryset()
		System.out.println("Using entrySet() to iterate over key value pairs:");
		for(Map.Entry<String, Integer> entry:tm.entrySet()) {
			System.out.println("Key:"+entry.getKey()+",Value:"+entry.getValue());
		}
		//2.navigate using for each loop on keyset()
		System.out.println("Using keySet() to irritate over keys:");
		for(String key:tm.keySet()) {
			System.out.println("Key:"+key+",Value:"+tm.get(key));
		}
		
		//3.navigating using for each loop on valu()
		System.out.println("Using values() to iterate over values:");
		for(Integer value:tm.values()) {
			System.out.println("Value:"+value);
		}
		
		//4.navigate using iterate (entryset)
		System.out.println("Using Iterator to navigate through entrySet:");
		var iterator=tm.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> entry=iterator.next();
			System.out.print("Key:"+entry.getKey()+",Value:"+entry.getValue());
			
		}
	}
}
