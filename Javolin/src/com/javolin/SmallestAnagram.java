package com.javolin;
//Find the smallest anagram of a given number.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestAnagram {
	private static String number;
	private static char[] charArray;
	private static int smallest;

	@SuppressWarnings("static-access")
	public SmallestAnagram(String number) {
		this.number = number;
		smallest = Integer.parseInt(number);
	}

	public void toCharArray() {
		charArray = number.toCharArray();
	}

	public void printAnagrams(char[] charArray, int start) {
		if (start == charArray.length - 1) {
			int num = Integer.parseInt(new String(charArray));
			System.out.print(num);
			System.out.print("\n");
			if (num < smallest) {
				smallest = num;
			}
		} else {
			for (int i = start; i < charArray.length; i++) {
				char temp = charArray[start];
				charArray[start] = charArray[i];
				charArray[i] = temp;

				printAnagrams(charArray, start + 1);

				temp = charArray[start];
				charArray[start] = charArray[i];
				charArray[i] = temp;
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.print("Enter the Number : ");
		SmallestAnagram anagram = new SmallestAnagram(reader.readLine());
		System.out.println();
		anagram.toCharArray();
		anagram.printAnagrams(charArray, 0);
		System.out
				.println("The smallest anagram of the number is: " + smallest);
	}
}
