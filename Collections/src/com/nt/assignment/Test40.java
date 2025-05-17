package com.nt.assignment;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Test40 {

	public static void main(String[] args) {
		NavigableSet<Integer> set = new TreeSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(4);
		
		for(Iterator<Integer> iterate = set.descendingSet().iterator(); iterate.hasNext();) {
			
			System.out.format("%d", iterate.next());
		}
	}
}
