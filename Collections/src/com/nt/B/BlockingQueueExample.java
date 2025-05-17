package com.nt.B;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {

	public static void main(String[] args) {
		
		BlockingQueue queue = new LinkedBlockingQueue();
		
		Thread th1 = new Thread(()->{
			try {
				for(int i=1;i<=5; i++) {
					queue.put(i);
					System.out.println("producer::"+i);
					Thread.sleep(500);
				}
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		});
		
		Thread th2 = new Thread(()->{
			try {
				for(int i=1; i<=5; i++) {
					queue.take();
					System.out.println("consumer::"+i);
					Thread.sleep(400);
				}
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		});
		th1.start();
		th2.start();
	}
}
