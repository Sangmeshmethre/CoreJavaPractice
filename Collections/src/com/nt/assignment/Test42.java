package com.nt.assignment;

import java.util.HashSet;
import java.util.Set;

public class Test42 {

	static void add(Set<? super String> set) {
		set.add(null); set.add(null);
		System.out.println(set.size());
	}
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		add(set);
	}
}
