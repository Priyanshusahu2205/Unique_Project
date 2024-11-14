package com.practice;

public class FindMax {
	public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        int result = findMax(10, 25, 15);
        System.out.println("The greatest number is: " + result);
    }

}
