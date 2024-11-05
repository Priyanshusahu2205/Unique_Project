package com.lmsInterview7;
import java.util.HashSet;

public class HashSetEx {
	
	public static void main(String[] args) {
        //create a hashSet of String 
		 HashSet<Integer> s1 = new HashSet<>();
        
        //adding elements to hashSet using add() method
        s1.add(15);
        s1.add(20);
        s1.add(25);

        //display the hashSet before adding new element
        System.out.println("HashSet before adding new element: " + s1);

        //append a specified element to hashSet
        s1.add(10);

        //display the hashSet after adding the new element
        System.out.println("HashSet after adding new element: " + s1);
    }

}
