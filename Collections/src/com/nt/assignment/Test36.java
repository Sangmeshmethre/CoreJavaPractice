package com.nt.assignment;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Test36 {

	public static void main(String[] args) {
		
		NavigableSet<Integer> set = new TreeSet<Integer>();
		set.add(-12);
		set.add(24);
		System.out.format("%d%d%d%d",set.ceiling(-12),set.ceiling(0),set.ceiling(24),set.ceiling(100));
		
	}
}
