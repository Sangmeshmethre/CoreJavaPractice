package com.nt.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list.add("java");
		list.add("spring");
		list.add("hibernate");
		list.add("spring boot");
		list.add("react");
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.contains("spring"));
		System.out.println(list.contains("DSA"));
		
		list.remove("spring");
		list.add("DSA");
		
		System.out.println();
		System.out.println(list.contains("spring"));
		System.out.println(list.contains("DSA"));
		System.out.println();
		
		System.out.println(list);
		System.out.println();
		
		list.clear();
		
		System.out.println(list);
	}
}
