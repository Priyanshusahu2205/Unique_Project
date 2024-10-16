package com.multiThreadingEx;

class Thread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Using Runnable interface...");
	}
	
	
}
public class MyThread2 {
	
	public static void main(String[] args) {
		//object runnable
		Thread2 runnable = new Thread2();
		//object thread
		Thread th = new Thread(runnable);
		th.start();
	}

}
