package com.nt.A;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingElement {

	public static void main(String[] args) {
		
		int[] arr = {4,5,6,7,3,2,4,5};
		
		firstNonRepeatingElement(arr);
	}
	
	public static void firstNonRepeatingElement(int[] arr) {
		
		Map<Integer, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.getOrDefault(arr[i], 1)+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entryset:map.entrySet()) {
			
			if(entryset.getValue()==1) {
				System.out.println(entryset);
				break;
			}
		}
	}
}
