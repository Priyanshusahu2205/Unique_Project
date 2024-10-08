package com.lmsInterviev;

public class UniqueChar {
	
	public static void main(String[] args) {
		
		String input="java";
		//convert the string to lowercase
		input=input.toLowerCase();
		//initialize an empty string
		String uniqueChar="";
		
		//iterate each char of each string
		for(int i=0;i<input.length();i++) {
			char currentChar=input.charAt(i);
			
			//checkif the current char appear exactly once the string
			if(input.indexOf(currentChar)==input.lastIndexOf(currentChar)) {
				uniqueChar += currentChar;
				
			}
		}
		
		System.out.println("Unique Character:"+uniqueChar);
		
	}

}
