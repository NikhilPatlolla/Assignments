package com.nikhil.main;

public class DuplicateCharactersFromAString{
	public static void main(String[] args) {
		String stringValue = "Great responsibility";
		int duplicateCharCount;
		char[] strArr = stringValue.toCharArray();
		for (int i = 0; i < strArr.length; i++) {
			duplicateCharCount = 1; 
			for (int j = i + 1; j < strArr.length; j++) {
				if (strArr[i] == strArr[j] && strArr[i] != ' ') {
					duplicateCharCount++;
					strArr[j] = '0';
				}
			}
			
			if(duplicateCharCount > 1 && strArr[i]!= '0') {
				System.out.println(strArr[i]);
			}

		}

	}
}
