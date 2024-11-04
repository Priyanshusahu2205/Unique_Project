package com.lmsInterview6;

import java.util.ArrayList;
import java.util.List;

public class EvenCalculator {
	
	public static void main(String[] args) {
        // Initializing the ArrayList with integers
        List<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(15);
        num.add(20);
        num.add(25);
        num.add(30);
        
        // Calculating the sum of even numbers
        int evenSum = 0;
        for (int no : num) {
            if (no % 2 == 0) {
                evenSum += no;  // Add only if number is even
            }
        }

        // Display the result
        System.out.println("Sum of even numbers: " + evenSum);
    }

}
