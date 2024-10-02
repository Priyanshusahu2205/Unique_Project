package com.lmsInterviev;

public class NestedParenthesis {
	
	public static void main(String[] args) {
		
		//input sentence 
		String sentence="Sometimes (when I nest my parenthesis (also called parentheticals) too many times (like this (and this))) they get quite confusing.";
		//position opening parenthesis
		int openingPosition=10;
		
		//find and print the closing parenthesis
		System.out.println("Closing parenthesis position:"+findClosingParenthesis(sentence,openingPosition));
		
	}
	
	public static int findClosingParenthesis(String sentence,int openPos) {
		int balance=1;
		
		for(int i=openPos+1;i< sentence.length();i++) {
			if(sentence.charAt(i)=='(') {
				balance++;
			}
			else if(sentence.charAt(i)==')') {
				balance--;
				if(balance==0) {
					return i;
				}
			}
		}
		return -1;
	}

}
