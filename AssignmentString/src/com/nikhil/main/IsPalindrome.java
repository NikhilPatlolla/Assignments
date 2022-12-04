package com.nikhil.main;

public class IsPalindrome {
	public static void main(String[] args) {
		String stringValue = "2552";

		boolean isPalindrome = false;

		int i = 0;
		int j = stringValue.length() - 1;

		char f = stringValue.charAt(i);
		char l = stringValue.charAt(j);
//		System.out.println(f + " " + l);

		while (i < j && j<stringValue.length() && i>=0) {
			if (f == l) {
				f = stringValue.charAt(i++);
				l = stringValue.charAt(j--);
				System.out.println(f + " " + l);
			} else {
//				System.out.println("f and l are not equal");
				isPalindrome = false; 
				break;
			}
			
			isPalindrome = true; 
		}
		
		System.out.println(isPalindrome);
		if(isPalindrome) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("This is not a palindrome");
		}
	}
}
