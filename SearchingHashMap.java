package com.hashMap;

import java.util.HashMap;

public class SearchingHashMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hs = new HashMap<Integer,String>();
		
		hs.put(1, "Raaj");
		hs.put(2, "Priyanshu");
		hs.put(92, "Disha");
		hs.put(3, "Shipra");
		hs.put(null, "Priya");
		hs.get(hs);
		System.out.println(hs);
		System.out.println(hs.get(2));
		System.out.println(hs.get(3));
		hs.remove(hs);
		System.out.println(hs);
		hs.isEmpty();
		hs.put(23, null);
		System.out.println(hs);
		System.out.println(hs.containsKey(null));
		System.out.println(hs.containsValue("Lisa"));
		System.out.println(hs.containsValue(null));
		System.out.println(hs.size());

		
	}

}
