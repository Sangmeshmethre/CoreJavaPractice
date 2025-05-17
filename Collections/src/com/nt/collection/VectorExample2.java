package com.nt.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample2 {

	public static void main(String[] args) {
		
		Vector<Integer> vt = new Vector<>();
		vt.addElement(10);
		vt.addElement(20);
		vt.addElement(30);
		//vt.addElement("JBL");
		//vt.addElement(99.99);
		
		System.out.println(vt);
		
		Enumeration<Integer> em = vt.elements();
		
		while(em.hasMoreElements()) {
			Integer x = em.nextElement();
			System.out.println(x);
		}
	}
}
