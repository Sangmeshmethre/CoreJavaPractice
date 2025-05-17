package com.nt.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MediumArray {

	public static void main(String[] args) {
		
		int[] arr1 = {2,3,5,8};
		int[] arr2 = {10, 12, 14, 16, 18, 20};
		
		mediumArray(arr1, arr2);
	}
	
	public static void mediumArray(int[] arr1, int[] arr2) {
		
		List<Integer> list = new ArrayList();
		
		for(int ele:arr1) {
			list.add(ele);
		}
		for(int ele:arr2) {
			list.add(ele);
		}
		
		Collections.sort(list);
		
		int size = list.size();
		
		if(size % 2 == 0) {
			double x = (list.get(size/2-1)+list.get(size/2))/2.0;
			System.out.println("even::"+x);
		}else {
			int y = list.get(size/2);
			System.out.println("Odded::"+y);
		}
	}
}
