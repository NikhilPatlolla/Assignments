package com.nikhil.main;


public class DuplicatesInAnArray {
	public static void main(String[] args) {
		// duplicates in an array.
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 5, 4, 2, 1, 3 };
		for (int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
//					arr[j] = 0;
					System.out.println(arr[j]);
				}
			}
		}
		
	}
}
