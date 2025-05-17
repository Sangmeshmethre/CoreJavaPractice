package com.nt.B;

public class MyThread extends Thread{

	public void run() {
		
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName());
			Thread. yield();
		}
	}
	public static void main(String[] args) {
		
		MyThread th = new MyThread();
		MyThread th1 = new MyThread();
		th.start();
		th1.start();
		
	}
}
