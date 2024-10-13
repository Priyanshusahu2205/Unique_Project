package com.inheritance1;

public class ParentMethodOverriding {
	
	String name="Raaj";
	
	
	//Method
	public void print_info(String name) {
		
		System.out.println("Name of Parent:-"+name);
		
	}

}
public class ChildMethodOverriding extends ParentMethodOverriding {
	
	String name="Priya";
	
	public void print_info1(String name) {
		System.out.println("Child name:-" +name);
		
	
	}

}
/*public class MainO {
	public static void main(String[] args) {
		ChildMethodOverriding c1 = new ChildMethodOverriding();
		
		c1.name="child";
		c1.print_info("child");
		
	}

}*/
public class MainP {
	
	public static void main(String[] args) {
		ChildMethodOverriding c1 = new ChildMethodOverriding();
		
		c1.print_info("Raaj");
		c1.print_info1("Priya");
	}

}

