package com.lmsInterview7;

import java.util.Stack;

public class StackEx {
	
	public static void main(String[] args) {
        //declare a Stack of integers
        Stack<Integer> stack = new Stack<>();

        //store 10 elements in the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        //display the stack before removing elements
        System.out.println("Stack before removing elements: " + stack);

        //remove 4 elements from the stack
        for (int i = 0; i < 4; i++) {
            stack.pop();
        }

        //display the stack after removing 4 elements
        System.out.println("Stack after removing 4 elements: " + stack);
    }

}
