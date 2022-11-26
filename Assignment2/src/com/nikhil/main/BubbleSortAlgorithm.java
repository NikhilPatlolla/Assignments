package com.nikhil.main;

public class BubbleSortAlgorithm {
	public static void main(String[] args) {
		int[] arr = { 12, 34, 2, 45, 9, 56, 66, 1 };
		
		
		//Array  
		System.out.println("Before Bubble sort");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		//Sorting
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				// if the first element is greater than the second one swap.
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		System.out.println("After Bubble sort");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
