package com.nt.p1;

public class NotifyExample {

	synchronized void waitMethod() {
		System.out.println(Thread.currentThread().getName()+"  ::thread start::");
		try {
			System.out.println("Wait method waiting........");
			wait();
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"  ::thread ended::");
	}
	synchronized void notifyMethod() {
		System.out.println("notify method......");
		notify();
	}
	public static void main(String[] args) {
		
		NotifyExample nf = new NotifyExample();
		
		Thread th1  = new Thread(nf::waitMethod, "Thread-1");
		Thread th2 = new  Thread(nf::notifyMethod,"Thread-2");
		th1.start();
		th2.start();
	}
}
