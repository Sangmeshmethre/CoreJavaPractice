package com.nt.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample3 {

	public static void main(String[] args) {
		
		List course = new ArrayList();
		course.add("Java");
		course.add("spring");
		course.add("spring boot");
		course.add("react");
		
		System.out.println(course);
		System.out.println();
		
		List list = new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		System.out.println();
		
		course.addAll(list);
		System.out.println(course);
		
		System.out.println();
		
		course.removeAll(list);
		System.out.println(course);
		System.out.println();
		
		course.retainAll(list);
		System.out.println(course);
		
		
	}
}
