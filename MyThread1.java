package com.multiThreadingEx;
class Thread1 extends Thread{
	
	public void run() {
		
		System.out.println("My First thread is running...");
		
	}
}
public class MyThread1 {
	
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		System.out.println("Main Threading is running..");
		
	}

}