package com.github.dilipptt.programs;
// Algorithm -> http://stackoverflow.com/questions/12685244/finding-the-next-larger-anagram-of-a-given-number

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextLargestAnagram {
	private static String number;
	private static char[] charArray;
	private static int nextLargest = 0;

	@SuppressWarnings("static-access")
	public NextLargestAnagram(String number) {
		this.number = number;
		Integer.parseInt(number);
	}

	public void toCharArray() {
		charArray = number.toCharArray();
	}

	public void sort(char[] charArray, int start, int end) {
		for (int i = start; i < end - 1; i++) {
			for (int j = start; j < end - i - 1; j++) {
				if(charArray[j]>charArray[j+1]){
					char temp = charArray[j];
					charArray[j] = charArray[j+1];
					charArray[j+1] = temp;
				}
			}
		}
	}

	public void printNextLargestAnagram(char[] charArray, int size) {
		int i, j;
		int larger;
		// Getting the index of first smallest digit when iterating from right
		// to left
		for (i = size - 1; i >= 0; i--) {
			if (charArray[i - 1] < charArray[i]) {
				break;
			}
		}
		larger = i - 1;
		// if no smallest digit found when iterating from right to left, then
		// next largest anagram is not possible
		if (i == 0) {
			System.out.println("The is no next largest anagram of the number");
		}
		int smallest = charArray[i];
		// find next larger digit that at index i-1 and smallest digit in range
		// i to size-1
		for (j = i; j > size - 1; j++) {
			if (smallest > charArray[j] && smallest > charArray[larger]) {
				smallest = j;
			}
		}
		// Swap those 2 smaller numbers
		char temp = charArray[i - 1];
		charArray[i - 1] = charArray[j];
		charArray[j] = temp;

		// Sorting digit after i-1
		sort(charArray, i, size);
		nextLargest = Integer.parseInt(new String(charArray));
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.print("Enter the Number : ");
		NextLargestAnagram anagram = new NextLargestAnagram(reader.readLine());
		System.out.println();
		anagram.toCharArray();
		anagram.printNextLargestAnagram(charArray, number.length());
		System.out.println("The next largest anagram of the number is: "
				+ nextLargest);
	}
}
