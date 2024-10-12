package com.static1;

public class AJP {
	int id;
	String name;
	
	static String project_name="AJP";
	
	AJP(int id, String name){
		this.id=id;
		this.name=name;
		
	}
	//static method
	static void print() {
		System.out.println("This is an Institute.");
	}
	//block
	static{
		System.out.println("Static is print");
	}
	
	void display() {
		System.out.println(id+" "+name+" "+project_name);
		
	}
	
	public static void main(String[] args) {
		AJP a1 = new AJP(1,"Priyanshu");
		AJP a2 = new AJP(2,"Raaj");
		AJP a3 = new AJP(3,"Shipra");
		AJP a4 = new AJP(4,"Priya");
		a1.display();
		a2.display();
		a3.display();
		a4.display();
		AJP.print();
		
	}
	

}
