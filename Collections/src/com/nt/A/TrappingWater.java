package com.nt.A;

public class TrappingWater {

	public static void main(String[] args) {
		
		int[] arr = {3, 0, 2, 0, 4};
		
		int result = trappingWater(arr);
		System.out.println("tapping Water::"+result);
	}
	
	public static int trappingWater(int[] arr) {
		
		int len = arr.length;
		
		int water = 0;
		
		if(len == 0) {
			return -1;
		}
		
		int[] left = new int[len];
		
		left[0] = arr[0];
		for(int i=1; i<arr.length; i++) {
			left[i] = Math.max(left[i-1], arr[i]);
		}
		
		int[] right = new int[len];
		
		right[len-1] = arr[len-1];
		for(int i=len-2; i>=0; i--) {
			right[i] = Math.max(right[i+1], arr[i+1]);
		}
		
		for(int i=0; i<arr.length; i++) {
			
			water = water+Math.min(left[i], right[i])-arr[i];
		}
		return water;
	}
}
