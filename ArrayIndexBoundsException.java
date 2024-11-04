package com.lmsInterview5;

public class ArrayEx {
	
	public static void main(String[] args) {
		
		//declare an array size
		int[] num = new int[100];
		
		//initialize the array with values
		for(int i=0;i<num.length;i++) {
			num[i]=i+1;
			
		}
		//print the array
		for(int i=0;i<num.length;i++) {
			System.out.println("Element in a array-"+i+":"+num[i]);
			
		}
	}

}

public class ArrayIndexBoundsException {
	
	public static void main(String[] args) {
		int[] num= {10,40,30,80,50};
		
		for(int i=0;i<=num.length;i++) {
			try {
				System.out.println("Element at index"+i+":"+num[i]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Exception Occured;Array index out of bounds at index:"+i);
			}
		}
		
	}

}
