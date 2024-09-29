package com.string;

public class StringBuilderSB {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Hello");
		sb.append("World");
		String msg=sb.toString();
		System.out.println(msg);
		
	}

}
