package com.nikhil.main;


public class MaxOccuringCharacter {
	public static void main(String[] args) {
		String stringValue = "etectera";
		// to get the max from the freq[] array that keeps track of the frequency of
		// characters in String as per their indexes
		int max = 0;

		int[] freq = new int[stringValue.length()];

		for (int i = 0; i < stringValue.length(); i++) {
			freq[i] = 1;
			for (int j = i + 1; j < stringValue.length(); j++) {
				if (stringValue.charAt(i) == stringValue.charAt(j)) {
					freq[i]++;
				}
			}
		}

		// now finding the index of max value in the array that corresponds to the max
		// Occurring char in the String
		max = Integer.MIN_VALUE;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > max) {
				max = i;
			}
		}

		boolean noRep = (freq[max] == 1) ? true : false;
		if (noRep) {
			System.out.println("There are no characters repeating in the string sequence " + stringValue);
		} else {
			System.out.println("The max Occuring character in the string is " + stringValue.charAt(max));
		}

	}
}
