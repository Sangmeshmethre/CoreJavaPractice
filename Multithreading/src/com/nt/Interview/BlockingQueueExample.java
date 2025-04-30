package com.nt.Interview;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {

	public static void main(String[] args) {
		
		BlockingQueue bk = new LinkedBlockingQueue<>(5);
		
		Thread th1 = new Thread(()->{
			try {
				for(int i=1; i<=10; i++) {
					bk.put(i);
					System.out.println("Producer::"+i);
					Thread.sleep(1000);
				}
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		});
		
		Thread th2 = new Thread(()->{
			try {
				for(int i=1; i<=10; i++) {
					bk.take();
					System.out.println("Consumer::"+i);
					Thread.sleep(500);
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		});
		th1.start();
		th2.start();
	}
}
