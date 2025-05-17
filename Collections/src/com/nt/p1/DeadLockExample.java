package com.nt.p1;

class ShareResource{
	void method1(ShareResource other) {
		
		synchronized(this) {
			System.out.println(Thread.currentThread().getName()+" thread:"+this);
			
			try {
				Thread.sleep(4000);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			synchronized(other) {
				System.out.println(Thread.currentThread().getName()+" lock::"+other);
			}
		}
		
	}
}
public class DeadLockExample {

	public static void main(String[] args) {
		
		ShareResource resource1 = new ShareResource();
		ShareResource resouce2 = new ShareResource();
		
		Thread th1 = new Thread(()->resource1.method1(resouce2),"Thread-1");
		Thread th2 = new Thread(()->resouce2.method1(resource1),"Thread-2");
		
		th1.start();
		th2.start();
	}
}
