package com.looseCoupling;

public class Library {
	
	Books b;
	
	Library(Books b){
		this.b=b;
			
		}
	public void move(){
		System.out.println("In this library you will get every type of books here.");
		b.read();
		b.write();
	}

}
