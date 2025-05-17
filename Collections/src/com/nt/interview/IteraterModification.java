package com.nt.interview;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class IteraterModification {

	public static void main(String[] args) {
		
		LinkedHashSet list = new LinkedHashSet();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Iterator itr = list.iterator();
		
		//itr.remove();
		
		Object o1 = itr.next();
		System.out.println(o1);
		
		itr.remove();
		
		System.out.println(list);
		
		list.add("e");
		Object o2 = itr.next();
		System.out.println(o2);
	}
}
