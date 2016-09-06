package com.github.dilipptt.programs;
import java.util.Scanner;

//Find the number occuring odd number of times from the list of numbers. (All number occur even number of times except one)
public class OddTimesOccurance {
	private static int number;
	private static int[] list;

	public OddTimesOccurance(int number) {
		OddTimesOccurance.number = number;
		list = new int[number];
	}

	public int findOddOccurrance() {
		int x = list[0];
		// xor with all the number give number which has odd occurance
		for (int i = 1; i < list.length; i++) {
			x = x ^ list[i];
		}
		return x;
	}

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of number list: ");
		OddTimesOccurance oddObjList = new OddTimesOccurance(scan.nextInt());
		System.out.print("Enter the numbers: ");
		for (int i = 0; i < number; i++) {
			list[i] = scan.nextInt();
		}
		int oddNum = oddObjList.findOddOccurrance();
		System.out.print("The odd occuring number in the list: " + oddNum);
	}
}
