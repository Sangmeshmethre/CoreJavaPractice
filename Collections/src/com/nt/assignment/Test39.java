package com.nt.assignment;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Test39 {

	public static void main(String[] args) {
		
		NavigableSet<Integer> set = new TreeSet<Integer>();
		set.add(1);set.add(2); set.add(4);
		NavigableSet<Integer> sub = set.headSet(4, true);
		System.out.println(sub.last());
	}
}
