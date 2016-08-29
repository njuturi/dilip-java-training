package com.programs;

//Find a missing number in an array of with number of range 1 to n.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingNumber {

	public int missingNumber(int[] list, int range) throws Exception {
		int firstNum = list[0];
		int num = 1;
		if (list.length == 1) {
			throw new Exception("list invalid");
		}
		for (int i = 1; i < range; i++) {
			firstNum = firstNum ^ list[i];
		}
		// xor of all the number in the range
		for (int i = 2; i <= range + 1; i++) {
			num = num ^ i;
		}
		return firstNum ^ num;
	}

	// public static void main(String[] args) throws NumberFormatException,
	// IOException {
	// BufferedReader reader = new BufferedReader(new InputStreamReader(
	// System.in));
	// System.out.println("Enter the length of number array: ");
	// int number = Integer.parseInt(reader.readLine());
	// System.out.println("Enter the elements : ");
	// int[] list = new int[number];
	// for (int i = 0; i < number; i++) {
	// list[i] = Integer.parseInt(reader.readLine());
	// }
	//
	// // xor of all the elements in the list array
	// int firstNum = list[0];
	// int num = 1;
	// for (int i = 1; i < number; i++) {
	// firstNum = firstNum ^ list[i];
	// }
	// // xor of all the number in the range
	// for (int i = 2; i <= number+1; i++) {
	// num = num ^ i;
	// }
	// System.out.println("The missing number is: " + (firstNum ^ num));
	//
	// }
}
