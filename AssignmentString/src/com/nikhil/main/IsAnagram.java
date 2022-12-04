package com.nikhil.main;

public class IsAnagram {
	public static void main(String[] args) {
		String str1 = "Angered";
		String str2 = "Enraged";
		
		
		//To compare the values from one string to another we are lowercasing them to make it easier
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		

		if (str1.length() == str2.length()) {
			char[] charForStr1 = str1.toCharArray();
			char[] charForStr2 = str2.toCharArray();
			
			//From our previous created sorting, we sorted the list
			QuickSorting.quickSorting(charForStr1, 0, charForStr1.length-1);
			QuickSorting.quickSorting(charForStr2, 0, charForStr2.length-1);
			
//			System.out.println(charForStr1);
//			System.out.println(charForStr2);
			
			boolean result = false;
			
			result = extracted(charForStr1, charForStr2);
//			System.out.println(result);
			
			if(result == true) {
				System.out.println("Strings are anagrams");
			}else {
				System.out.println("Strings are not anagrams");
			}
			
		}else {
			System.out.println("The strings are not anagrams");
		}
	}

	private static boolean extracted(char[] charForStr1, char[] charForStr2) {
		for(int i =0; i<charForStr1.length; i++) {
			if(charForStr1[i] != charForStr2[i]) {
				return false;
			}
		}
		return true;
	}
}
