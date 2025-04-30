package com.nt.Interview;

import java.util.LinkedList;

//ShareResource::Usually Queue and buffer
//Producer Thread::Generate item and place in resource
//Consumer Thread::Retrieve item and process
//Synchronized:: Ensure thread don't interfere with each other improperly
public class ShareResourcePC {

	private final LinkedList queue = new LinkedList<>();
	private final int LIMIT = 5;
	
	synchronized void producer(int value) throws InterruptedException{
		while(queue.size()==LIMIT) {
			System.out.println("Producer is waiting............");
			wait();
		}
		queue.add(value);
		System.out.println("Producer::"+value);
		notify();
	}
	
	synchronized void cunsumer()throws InterruptedException{
		while(queue.isEmpty()) {
			System.out.println("Cunsumer is waiting...........");
			wait();
		}
		int value = (int)queue.removeFirst();
		System.out.println("Cunsumer::"+value);
		notify();
	}
}
