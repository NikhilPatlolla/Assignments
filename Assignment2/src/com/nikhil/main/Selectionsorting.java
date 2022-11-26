package com.nikhil.main;

import java.util.Arrays;

public class Selectionsorting {
	public static void main(String[] args) {
		int[] arr = {5, 6, 78, 2, 9, 33, 67};
		
		for(int i=0; i<arr.length-1; i++) {
			int minIndex = i;
			
			//finds the element with the minimum index from the array
			for(int j =i+1; j<arr.length; j++) {
				if(arr[j]< arr[minIndex]) {
					minIndex = j;
				}
			}
			
			//swapping the minimum element with first element
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp; 
			
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
