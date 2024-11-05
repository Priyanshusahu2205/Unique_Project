package com.lmsInterview8;

import java.util.HashMap;

public class HashCheck {
	
	public static void main(String[] args) {
        //create a hashMap to store integer keys and String values
        HashMap<Integer, String> map = new HashMap<>();

        //check if the hashMap is empty before add elements
        if (map.isEmpty()) {
            System.out.println("HashMap is empty.");
        } else {
            System.out.println("HashMap is not empty.");
        }

        //adding some key-value to the HashMap
        map.put(1, "Car");
        map.put(2, "Bike");
        map.put(3, "Bus");

        //check if the hashMap is empty after adding elements
        if (map.isEmpty()) {
            System.out.println("HashMap is empty.");
        } else {
            System.out.println("HashMap is not empty.");
        }
    }

}
