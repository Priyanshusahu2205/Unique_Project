package com.lmsInterview8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cricket {
	
	public static void main(String[] args) {
        //create map to store cricketer names and their scores
        Map<String, Integer> cs = new HashMap<>();

        cs.put("MS Dhoni", 12000);
        cs.put("Virat Kohli", 20000);
        cs.put("Sachin Tendulkar", 18000);
        cs.put("Rohit Sharma", 10000);
        

        //display the names
        System.out.println("Available cricketers: " + cs.keySet());

        // Create a scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cricketer's name to search for his score: ");
        String batsman = sc.nextLine();

        //check  the map and display the score
        if (cs.containsKey(batsman)) {
            System.out.println(batsman + "'s score: " + cs.get(batsman));
        } else {
            System.out.println("Cricketer not found!");
        }

        // Close the scanner
        sc.close();
    }

}
