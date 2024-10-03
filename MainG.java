package com.genericsInterface;

class Test <T, V>{
	//an object of type T is declared
	T obj1;
	V obj2;
	Test(T obj1, V obj2){
		this.obj1=obj1;
		this.obj2=obj2;
		
	}
	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
	}
	//constructor
	public T getObject() {
		return this.obj1;
	}
}

public class MainG {
	
	public static void main(String[] args) {
		Test<Integer,String> Obj = new Test<Integer,String>(15,"Python");
		System.out.println(Obj.getObject());
		
		Test<Integer,String> Obj1 = new Test<Integer,String>(20,"Java");
		System.out.println(Obj1.getObject());
	}

}
