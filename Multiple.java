package com.practice;

public class Multiple {
	
	public static void main(String[] args) {
        //loop from 1 to 50
        for (int i = 1; i <= 50; i++) {
            //check if the number is a multiple of both 4 and 5
            if (i % 4 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } 
            //check if the number is a multiple of 4
            else if (i % 4 == 0) {
                System.out.println("Fizz");
            } 
            //check if the number is a multiple of 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            } 
            //if not a multiple of 4 or 5, print the number
            else {
                System.out.println(i);
            }
        }
    }

}
