package com.nt.Interview;

public class ProducerConsumerExample {

	public static void main(String[] args) {
		
		ShareResourcePC  resouce = new ShareResourcePC();
		
		Thread th = new Thread(()->{
			try {
				for(int i=1; i<=10; i++) {
					resouce.producer(i);
					Thread.sleep(1000);
				}
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		});
		
		Thread th1 = new Thread(()->{
			try {
				for(int i=1; i<=10; i++) {
					resouce.cunsumer();
					Thread.sleep(500);
				}
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		});
		
		th.start();
		th1.start();
	}
}
