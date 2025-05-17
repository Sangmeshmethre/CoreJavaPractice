package com.nt.B;

class ShareResource{
	void method1(ShareResource other) {
		
		synchronized(this) {
			System.out.println(Thread.currentThread().getName()+" Lock: "+this);
			try {
				Thread.sleep(400);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			synchronized(other){
				System.out.println(Thread.currentThread().getName()+" Lock: "+other);
			}
		}
	}
}
public class DeadLockExample {

	public static void main(String[] args) {
		
		ShareResource resource1 = new ShareResource();
		ShareResource resource2 = new ShareResource();
		
		Thread th1 = new Thread(()->resource1.method1(resource2), " Thread-1 ");
		Thread th2 = new Thread(()->resource2.method1(resource1)," Thread-2 ");
		th1.start();
		th2.start();
	}
}
