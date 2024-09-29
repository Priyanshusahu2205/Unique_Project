package com.string;

public class StringEx {
	
	public static void main(String[] args) {
		String s="Raaj Sahu";
		char c=s.charAt(3);
		String rep=s.replace("Raaj", "Priyanshu");
		String upper=s.toUpperCase();
		String lower=s.toLowerCase();
		
		System.out.println(c);
		System.out.println(rep);
		System.out.println(upper);
		System.out.println(lower);
		
		System.out.println(s.length());
		String str = new String("Name is Raaj");
		System.out.println(str.charAt(5));
		System.out.println(str);
		
		/*System.out.println(str.substring(2));
		System.out.println(str.contains(str));
		System.out.println(s.join(str, "Jai Shree Ram"));
		System.out.println(str.split(str));
		System.out.println(s.indexOf(2));*/

	}

}
