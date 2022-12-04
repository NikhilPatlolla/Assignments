package com.nikhil.main;

public class StringUniqueCharacters {
	public static void main(String[] args) {
		String stringValue = "doesitcontainuniquevalues";
		boolean containsAllUnique = true;

		for (int i = 0; i < stringValue.length(); i++) {
			for (int j = i+1; j < stringValue.length(); j++) {
				if (stringValue.charAt(i) == stringValue.charAt(j)) {
					containsAllUnique = false;
				}
			}
		}
		System.out.println(containsAllUnique);

		if (containsAllUnique) {
			System.out.println("String only contains unique characters");
		} else {
			System.out.println("String doesn't contain unique characters");
		}
	}
}
