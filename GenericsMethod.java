package com.genericsInterface;

public class GenericsMethod {
	
	public static <E> void printArray(E[] element) {
		for(E e:element) {
			System.out.println(e);	
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		Integer[] intArray= {10,20,30,40,50};
		Character[] charArray= {'P','y','t','h','o','n'};
		System.out.println("Print int Array=");
		printArray(intArray);
		System.out.println("Print char Array=");
		printArray(charArray);
		
	}

}
