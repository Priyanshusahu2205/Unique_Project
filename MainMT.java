package com.multithreading.Interthtreadcomm;

class Message {
	private String msg;
	
	public Message(String str) {
		this.msg=str;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String str) {
		this.msg=str;
		
	}
}
class Waiting implements Runnable{
	private Message msg;
	
	public Waiting(Message m) {
		this.msg=m;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		
		synchronized(msg) {
			try {
				System.out.println(name+"Waiting to get notified at time:"+System.currentTimeMillis());
				msg.wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name+"Waiter thread got notified at time:"+System.currentTimeMillis());
			//process the message now
			System.out.println(name+"Processed:"+msg.getMsg());
		}
	}
	
}
class Notify implements Runnable{
	
	private Message msg;
	
	public Notify(Message msg) {
		this.msg=msg;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		System.out.println(name+"Started:");
		try {
			Thread.sleep(1000);
			synchronized(msg) {
				msg.setMsg(name+"Notifier work done.");
				msg.notify();
				//msg.notifyAll();
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class MainMT {
	
	public static void main(String[] args) {
		
		Message msg = new Message("Process it");
		
		Waiting wait = new Waiting(msg);
		new Thread(wait,"Waiter:").start();
		
		Waiting wait1 = new Waiting(msg);
		new Thread(wait1,"Waiter1:").start();
		
		Notify notify1 = new Notify(msg);
		new Thread(notify1,"Notifier:").start();
		
		System.out.println("All the thread are started.");
		
	}

}
