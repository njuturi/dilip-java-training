package com.programs;
// Swap the 2 numbers using bitwise xor operator.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwappingBitwise {
	private static int firstNum; // firstNum = 5 (101)
	private static int secondNum; // secondNum = 4 (100)

	public SwappingBitwise(int firstNum, int secondNum) {
		SwappingBitwise.firstNum = firstNum;
		SwappingBitwise.secondNum = secondNum;
	}

	public void swap() {
		firstNum = firstNum ^ secondNum; // 101 ^ 100 = 001 (1)
		secondNum = firstNum ^ secondNum; // 001 ^ 100 = 101(5)
		firstNum = firstNum ^ secondNum; // 001 ^ 101 = 100(4)
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.print("Enter first number: ");
		firstNum = Integer.parseInt(reader.readLine());
		System.out.print("Enter second number: ");
		secondNum = Integer.parseInt(reader.readLine());
		SwappingBitwise swapObj = new SwappingBitwise(firstNum, secondNum);
		swapObj.swap();
		System.out.println("First Number : " + firstNum + ", Second Number: "
				+ secondNum);
	}
}
