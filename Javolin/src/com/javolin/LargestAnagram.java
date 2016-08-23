package com.javolin;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestAnagram {
	private static String number;
	private static char[] charArray;
	private static int largest;

	@SuppressWarnings("static-access")
	public LargestAnagram(String number) {
		this.number = number;
		largest = Integer.parseInt(number);
	}

	public void toCharArray() {
		charArray = number.toCharArray();
	}

	public void printAnagrams(char[] charArray, int start) {
		if (start == charArray.length - 1) {
			int num = Integer.parseInt(new String(charArray));
			System.out.print(num);
			System.out.print("\n");
			if(num>largest){
				largest = num;
			}
		} else {
			for (int i = start; i < charArray.length; i++) {
				char temp = charArray[start];
				charArray[start] = charArray[i];
				charArray[i] = temp;
				
				printAnagrams(charArray, start+1);
				
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
		LargestAnagram anagram = new LargestAnagram(reader.readLine());
		System.out.println();
		anagram.toCharArray();
		anagram.printAnagrams(charArray, 0);
		System.out.println("The largest anagram of the number is: " + largest);
	}
}
