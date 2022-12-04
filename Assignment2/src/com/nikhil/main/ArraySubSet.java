package com.nikhil.main;

public class ArraySubSet {
	public static void main(String[] args) {
		int arr1[] = { 11, 10, 13, 21, 30, 70 };
		int arr2[] = { 11, 30, 70, 10 };
		boolean b = subSet(arr1, arr2, arr1.length, arr2.length);
		System.out.println("is the arr2[] is a subset of arr1[]? " + b);
	}

	// a method that returns a boolean to see if it is a subset
	static boolean subSet(int[] arr1, int[] arr2, int arr1Length, int arr2Length) {
		int i = 0, j = 0;
		for (i = 0; i < arr2.length; i++) {
			for (j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j]) {
					break;
				}
			}

			if (j == arr1.length) {
				return false;

			}

		}
		return true;
	}
}
