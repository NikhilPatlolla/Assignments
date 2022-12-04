package com.nikhil.main;

public class CharacterKind {
	public static void main(String[] args) {
		int vowels = 0;
		int consonants = 0;
		int specialCharacters = 0;
		int numbers =0;

		String stringValue = "iNeuron Technologies, pvt.Lmt";

		for (int i = 0; i < stringValue.length(); i++) {
			char ch = stringValue.charAt(i);

			//if they are alphabets
			if ((ch >= 'a' && ch <= 'z') || ch >= 'A' && ch <= 'Z') {
				ch = Character.toLowerCase(ch);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				}else {
					consonants++;
				}
			}else if(ch >= '0' && ch <='9'){
				numbers++;
			}else {
				specialCharacters++; 
			}

		}
		
		
		
		
		System.out.println("The no. vowels are: "+ vowels);
		System.out.println("The no. consonants are: "+ consonants);
		System.out.println("The no. vowels are: "+ specialCharacters);
		
	}
}
