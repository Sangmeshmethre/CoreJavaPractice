package com.nt.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector vt = new Vector();
		
		vt.addElement(10);
		vt.addElement(20);
		vt.addElement(30);
		vt.addElement("JCL");
		vt.addElement(99.99);
		
		System.out.println(vt);
		
		Enumeration em = vt.elements();
		
		while(em.hasMoreElements()) {
			Object x = em.nextElement();
			System.out.print(x+" ");
		}
	}
}
