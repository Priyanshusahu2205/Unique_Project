package com.waitandnotify;

public class TestWN {
	
	public static void main(String[] args) throws InterruptedException{
		//create object first
		MyThread th = new MyThread();
		th.start();
		
		synchronized(th) {
			System.out.println("Main thread trying to wait..");
			//use wait method
			th.wait();
			System.out.println("Main thread tring to get notification...");
			System.out.println(th.sum);
		}
	}

}
