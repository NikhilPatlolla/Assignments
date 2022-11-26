package com.nikhil.main;

public class QuickSorting {

	private static int findingPivot(int[] arr, int low, int high) {

		// initially taking the pivot as last element to compare with every other
		// element in the array.
		int pivot = arr[high];
		// this is to keep the element in the array to swap
		int pos = (low - 1);

		for (int i = low; i <= high - 1; i++) {
			if (arr[i] <= pivot) {
				pos++;
				// swap the positions with pos and low
				int temp = arr[pos];
				arr[pos] = arr[i];
				arr[i] = temp;
			}
		}

		// else swapping the next pos element with high.
		int temp = arr[pos + 1];
		arr[pos + 1] = arr[high];
		arr[high] = temp;

		return pos + 1;

	}

	public static void quickSorting(int arr[], int low, int high) {
		if (low < high) {
			int pi = findingPivot(arr, low, high);

			// finding the element that is higher than the pivot and again doing the same
			// operation
			quickSorting(arr, low, pi - 1);
			quickSorting(arr, pi + 1, high);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 13, 5, 78, 2, 5, 78 };

		// before sorting:
		for (int i : arr) {
			System.out.println(i);
		}

//		QuickSorting qc = new QuickSorting();
		quickSorting(arr, 0, arr.length - 1);

		// after applying sorting
		System.out.println("After sorting");
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
