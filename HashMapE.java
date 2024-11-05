package com.lmsInterview8;

import java.util.HashMap;

public class HashMapE {
	
	public static void main(String[] args) {
        //create a hashMap to store integer keys and String
        HashMap<Integer, String> map = new HashMap<>();

        //using put() method
        map.put(1, "Java");
        map.put(2, "C");
        map.put(3, "PHP");

        //display the hashMap before a new key-value
        System.out.println("HashMap before adding new key-value pair: " + map);

        // a specified value with a specified key
        map.put(4, "Python");

        // Display the HashMap after associating the new key-value pair
        System.out.println("HashMap after adding new key-value pair: " + map);
    }

}
