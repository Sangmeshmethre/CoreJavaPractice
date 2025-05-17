package com.nt.B;

public class MyThread1 extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().getName()+"running thread");
		
		try {
			Thread.sleep(4000);
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"running thread ended");
	}
	
	public static void main(String[] args) {
		
		MyThread1 th1 = new MyThread1();
		MyThread1 th2 = new MyThread1();
		th1.start();
		try {
			th1.join();
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		th2.start();
	}
}
