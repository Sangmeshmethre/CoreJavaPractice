package com.nt.collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		
		ht.put("aaa", 10);
		ht.put("bbb", 20);
		ht.put("ccc", 30);
		ht.put("ddd", 40);
		
		System.out.println(ht);
		
		Enumeration<String> em = ht.keys();
		
		while(em.hasMoreElements()) {
			String s = em.nextElement();
			Integer x = ht.get(s);
			System.out.println(x+" "+s);
		}
	}
}
