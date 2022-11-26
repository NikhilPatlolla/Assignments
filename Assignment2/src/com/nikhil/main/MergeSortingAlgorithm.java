package com.nikhil.main;

import java.util.Arrays;

public class MergeSortingAlgorithm {
	public static void mergeSort(int[] arr, int length) {
		if (length < 2) {
			return;
		}

		int mid = length / 2;

		// creating new arrays
		// till mid element there is leftArr
		// from mid to the end of arr, another array rightArr
		int[] leftArr = new int[mid];
		int[] rightArr = new int[length - mid];

		// assigning the elements to the newly created sub arrays
		for (int i = 0; i < mid; i++) {
			leftArr[i] = arr[i];
		}
		for (int i = mid; i < length; i++) {
			rightArr[i - mid] = arr[i];
		}

		// calling the same method again to further break the arr into sub arrays
		mergeSort(leftArr, mid);
		mergeSort(rightArr, length - mid);

		// once the entire arr is broken down into arrays of individual elements
		// calling helper merge method
		merge(arr, leftArr, rightArr, mid, length - mid);
	}

	public static void merge(int[] arr, int[] leftArr, int[] rightArr, int left, int right) {
		int i = 0, j = 0, k = 0; // i for leftArr, j for rightArr, k for arr indices tracking.
		while (i < left && j < right) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k++] = leftArr[i++]; // first assign and then increment
			} else {
				arr[k++] = rightArr[j++];
			}
		}

		while (i < left) {
			arr[k++] = leftArr[i++];
		}
		while (j < right) {
			arr[k++] = rightArr[j++];
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 1, 32, 4, 2, 44 };
		mergeSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}
}
