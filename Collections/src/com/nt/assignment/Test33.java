package com.nt.assignment;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Test33 {

	public static void main(String[] args) {
		
		NavigableSet<Integer> map = new TreeSet<Integer>();
		map.add(-12);
		map.add(24);
		System.out.format("%d %d %d %d", map.lower(-12),map.lower(0),map.lower(24),map.lower(100));
		
	}
}
