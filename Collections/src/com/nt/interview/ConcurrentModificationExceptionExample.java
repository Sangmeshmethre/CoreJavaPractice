package com.nt.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionExample {

	public static void main(String[] args) {
		
		List<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		Iterator<Integer> iter = number.iterator();
		while(iter.hasNext()) {
			if(iter.next()==3) {
				iter.remove();
			}
		}
		System.out.println(number);
	}
}
