package com.nt.assignment;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Test35 {

	public static void main(String[] args) {
		
		NavigableSet<Integer> set = new TreeSet<Integer>();
		set.add(-12);
		set.add(24);
		System.out.format("%d %d %d %d", set.higher(-12),set.higher(0),set.higher(24),set.higher(100));
	}
}
