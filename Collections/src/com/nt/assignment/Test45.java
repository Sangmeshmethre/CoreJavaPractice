package com.nt.assignment;

import java.util.ArrayList;
import java.util.List;

public class Test45 {

	public static void main(String[] args) {
		
		List<Number> list = new ArrayList<Number>();
		list.add(7);
		list.add(8);
		list.add(7);
		
		Number index = list.get(7);
		System.out.println(index);
	}
}
