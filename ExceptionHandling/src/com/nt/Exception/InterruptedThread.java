package com.nt.Exception;


class MyThread extends Thread{
	public void run() {
		try {
			System.out.println("Thred is going to sleep.....");
			Thread.sleep(5000);
		}catch(InterruptedException ie) {
			System.out.println("Thread was interuped while sleeping");
		}
	}
}
public class InterruptedThread {

	public static void main(String[] args) {
		MyThread th  = new MyThread();
		th.start();
		
		try {
			th.sleep(2000);
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		th.interrupt();
	}
}
