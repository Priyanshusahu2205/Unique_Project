package com.practice;

public class ReplaceSpace {
	public static String replaceSpaces(String input) {
        //replace one or more spaces with a single #
        return input.trim().replaceAll("\\s+", "#");
    }

    public static void main(String[] args) {
        String input = "There    are  3   spaces.";
        String result = replaceSpaces(input);
        System.out.println(result); //output:there#are#3#spaces.
    }

}
