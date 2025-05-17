package com.nt.B;

class ShareResource1{
	synchronized void waitMethod() {
		System.out.println(Thread.currentThread().getName()+"running Thread");
		try {
			wait();
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"resume thread");
	}
	synchronized void notifyMethod() {
		System.out.println("Notify is running");
		notify();
	}
}
public class WaitExample  {
	
	public static void main(String[] args) {
		
		ShareResource1 resource = new ShareResource1();
		
		Thread th1 = new Thread(resource::waitMethod, " Thread-1");
		Thread th2 = new Thread(resource::notifyMethod, " Thread-2");
		
		th1.start();
		
		try {
			Thread.sleep(400);
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		th2.start();
	}
}
