package com.nt.multthreading;

public class CheckSetDaemonMethod extends Thread{

	public static void main(String[] args) {
		
		CheckSetDaemonMethod th = new CheckSetDaemonMethod();
		
		//th.setDaemon(true);
		th.start();
		th.setDaemon(false);   //java.lang.IllegalThreadStateException
		System.out.println(th.isDaemon());
	}
}
