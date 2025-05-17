package com.nt.p1;

public class JoinExample extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+"  runing");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" ended");
	}
	public static void main(String[] args) {
		
		JoinExample th1 = new JoinExample();
		JoinExample th2 = new JoinExample();
		
		th1.start();
		try {
			th1.join();
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		th2.start();
	}
}
