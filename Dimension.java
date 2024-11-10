package com.practice;

public class Dimension {
	
	public static void main(String[] args) {
        //declare and initialize the numbers
        int[] number = {2, 3, 4};
        
        //loop through each number to calculate and print square and cube
        for (int num : number) {
            int square = num * num;
            int cube = num * num * num;
            
            //print the square and cube
            System.out.println(square);
            System.out.println(cube);
        }
        
	}

}
