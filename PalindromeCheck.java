package com.lmsInterviev;

public class PalindromeCheck {
	
	public static void main(String[]args) {
		
		//input string
		String input="Madam";
		
		//normalize input convert in lowercase
		String lowerCase=input.toLowerCase();
		
		//reverse the input string
		String reverseString="";
		for(int i=lowerCase.length()-1;i>=0;i--) {
			reverseString+=lowerCase.charAt(i); 
		}
		
		//check the input string same as reverse string
		if(lowerCase.equals(reverseString)) {
			System.out.println(input+":It is a Palindrome word.");
			
		}
		else {
			System.out.println(input+":It is not a Palindrome word.");
		}
	}

}
