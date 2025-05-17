package com.nt.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("DSA");
		list.add("Spring");
		list.add("Hibernate");
		list.add("springBoot");
		list.add("React");
		
		System.out.println(list);
		
		Iterator<String> lt = list.iterator();
		
		while(lt.hasNext()) {
			String str = lt.next();
			System.out.println(str);
		}
		
		System.out.println("===============================================");
		
		Object[] myobject = list.toArray();
		System.out.println(myobject);
		
		for(Object obj:myobject) {
			System.out.println(obj);
		}
	}
}
