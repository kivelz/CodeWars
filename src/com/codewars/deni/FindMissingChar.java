package com.codewars.deni;

public class FindMissingChar {

	public static void main(String[] args) {
		char[] arr1 = { 'q', 'r', 's', 't', 'v', 'w', 'x' };

		System.out.println(findMissingLetter(arr1));
	}

	public static char findMissingLetter(char[] array) {
		int first = array[0];

		for (int i = 0; i < array.length; i++) {
			if ((char) first + 1 == array[i] + 1) {
				first += 1;
			}
		}
		return (char) first;
	}
}
