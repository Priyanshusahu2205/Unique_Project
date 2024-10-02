package com.lmsInterviev;

import java.util.Arrays;

public class SubArray {
	
	public static void main(String[] args) {
		
		//declare the array
		int[] Array= {2, 4, 5, 3, 6, 7, 9, 4, 5, 6};
		//extract subarray from index 2 to 6
		int[] subArray=Arrays.copyOfRange(Array, 2, 7);
		
		//sort the subarray
		//Arrays.sort(subArray);
		int secondHighest = subArray[subArray.length - 2];
		
		//output the subarray and 2 nd highest no.
		System.out.println("Sub Array:"+ Arrays.toString(subArray));
		System.out.println("Second Highest No.:"+ secondHighest);
		
		
	}

}
