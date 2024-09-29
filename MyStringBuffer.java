package com.string;

public class MyStringBuffer {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append("World");
		String msg = sb.toString();
		System.out.println(msg);
	}

}
