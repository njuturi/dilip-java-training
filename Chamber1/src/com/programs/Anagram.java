package com.programs;
// Backtractng Algorithm https://www.youtube.com/watch?v=KBHFyg2AcZ4
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Anagram {
	private static String number;
	private static char[] charArray;
	static List<Integer> list = new ArrayList<Integer>();
	
	@SuppressWarnings("static-access")
	public Anagram(String number) {
		if(Integer.parseInt(number) <= 0){
			throw new IllegalArgumentException();
		}
		this.number = number;
	}

	public void toCharArray() {
		charArray = number.toCharArray();
	}

	public List<Integer> printAnagrams(char[] charArray, int start) {
		if (start == charArray.length - 1) {
			int num = Integer.parseInt(new String(charArray));
			list.add(num);
			System.out.print(num);
			System.out.print("\n");
		} else {
			for (int i = start; i < charArray.length; i++) {

				// Swapping
				char temp = charArray[start];
				charArray[start] = charArray[i];
				charArray[i] = temp;

				printAnagrams(charArray, start + 1);

				// Backtracking
				temp = charArray[start];
				charArray[start] = charArray[i];
				charArray[i] = temp;
			}
		}
		return list;
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.print("Enter the Number : ");
		Anagram anagram = new Anagram(reader.readLine());
		System.out.println();
		anagram.toCharArray();
		anagram.printAnagrams(charArray, 0);
	}
}
