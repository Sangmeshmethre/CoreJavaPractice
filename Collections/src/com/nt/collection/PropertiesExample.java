package com.nt.collection;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) {
		
		Properties pt = new Properties();
		
		pt.put("aaa", 10);
		pt.put("bbb", 20);
		pt.put("sri", 30);
		
		System.out.println(pt);
		System.out.println(pt.get("sri"));
		
		Enumeration em = pt.keys();
		
		while(em.hasMoreElements()) {
			Object mt = em.nextElement();
			Object m = pt.get(mt);
			System.out.println(mt+" "+m);
		}
	}
}
