package com.nt.A;

import java.util.Arrays;

public class WaveFormed {

	public static void main(String[] args) {
		
		int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
		
		waveFormed(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void waveFormed(int[] arr) {
		
		for(int i=0; i<arr.length; i+=2) {
			
			if(i > 0 && arr[i] < arr[i-1]) {
				swap(arr, i, i-1);
			}
			
			if(i<arr.length && arr[i] < arr[i+1]) {
				swap(arr, i, i+1);
			}
		}
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
