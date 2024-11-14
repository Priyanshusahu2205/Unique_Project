package com.practice;

public class CountVowel {
	public static int countVowels(String input) {
        int count = 0;
        input = input.toLowerCase(); //convert to lowercase for easier comparison

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String input = "Hello World";
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);
    }

}
