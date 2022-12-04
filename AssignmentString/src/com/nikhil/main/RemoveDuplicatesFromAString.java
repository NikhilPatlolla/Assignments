package com.nikhil.main;

public class RemoveDuplicatesFromAString {
	public static void main(String[] args) {
		
		String stringValue = "abcdabcd";
		String temp = ""+stringValue.charAt(0);
		
		for(int i=1; i<stringValue.length() ; i++) {
			
			//converting the char value to string so as to compare
			//using the .contains methods that only takes String value as input
			String value = String.valueOf(stringValue.charAt(i));
			
			if(!temp.contains(value)) {
				temp += value;
			}
		}
		
		stringValue = temp; 
		
		System.out.println(stringValue);
	}
}
