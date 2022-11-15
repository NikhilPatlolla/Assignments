package com.nikhil.main;

public class SrtingSortUsingBubbleSort {
	public static void main(String[] args) {
		String a1 = "manak";
		char[] ch = new char[a1.length()];
		ch = a1.toCharArray();

		for (int i = 0; i < ch.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[j] < ch[minIndex]) {
					minIndex = j;
				}
			}
			int temp = ch[minIndex];
			ch[minIndex] = ch[i];
			ch[i] = (char) temp;
		}

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
	}
}
