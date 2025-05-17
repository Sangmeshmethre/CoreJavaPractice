package com.nt.assignment;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Test34 {

	public static void main(String[] args) {
		
		NavigableSet<Integer> set = new TreeSet<Integer>();
		
		set.add(-12);
		set.add(24);
		System.out.format("%d %d %d %d", set.floor(-12),set.floor(0),set.floor(24),set.floor(100));
	}
}
