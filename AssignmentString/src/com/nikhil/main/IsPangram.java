package com.nikhil.main;

public class IsPangram {
	public static void main(String[] args) {
		String str = "Abcdefghijklmnopqrstuvwxyz";
		int strLen = str.length();
		int alphabetCount = 26;

		//Let's assume beforehand that the string is a pangram, will change as we find out later in the loop
		boolean isPanagram = true;

		str = str.toLowerCase();
		boolean[] present = new boolean[alphabetCount];

		for (int i = 0; i < strLen; i++) {
			if (Character.isLetter(str.charAt(i))) {
				int letterPos = str.charAt(i) - 'a';
				present[letterPos] = true;
			}
		}

		for (int i = 0; i < strLen; i++) {
			if (!present[i]) {
				isPanagram = false;
			}
		}

		if (isPanagram) {
			System.out.println("The string is a Panagram");
		} else {
			System.out.println("The string is not a Panagram");

		}
	}
}
