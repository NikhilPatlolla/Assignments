package com.nikhil.main;

public class PrintVPattern {
	public static void main(String[] args) {
		int n = 17;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ( i >(n-2)&& i<n ||i>(n-1)/2 && i>j+(n-1)/2 
						|| i>(n-1)/2 && j>(n-1)/2 && i+j-(n-1)/2>(n-1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}
}
