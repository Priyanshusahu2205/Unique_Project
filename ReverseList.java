package com.lmsInterview6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
	
	 public static void main(String[] args) {
	        //create a list of strings
	        List<String> li = new ArrayList<>();
	        
	        //adding elements to the List
	        li.add("C");
	        li.add("C++");
	        li.add("Java");
	        li.add("Python");
	        li.add("PHP");

	        //display the original List
	        System.out.println("Original List: " + li);

	        //reverse the List
	        Collections.reverse(li);

	        //display the reversed List
	        System.out.println("Reversed List: " + li);
	    }

}
