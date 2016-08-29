package com.programs;

//Sum of the squares of first n natural numbers.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareRoot {
	private long number;
	private long MAX_VALUE = 922337203685477580L;

	public SquareRoot(long number) {
		if (number <= 0 || number > MAX_VALUE)
			throw new IllegalArgumentException();
		this.number = number;
	}

	public long getValue() {
		return number;
	}

	public int printSquareRoot() {
		int i = 0;
		if (number > 0) {
			for (i = 1; i < number / 2; i++) {
				if (i * i == number) {
					break;
				} else if (((i * i) < number) && ((i + 1) * (i + 1)) > number) {
					float squareRoot = ((float) (number)) / i; // logic for
																// handling
																// numbers that
																// are not
																// perfect
																// square
																// -->http://www.math.com/school/subject1/lessons/S1U1L9DP.html
					break;
				}
			}
		} else if (number == 0 || number < 0) {
			try {
				throw new Exception("Square root is not possible");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return i;
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		System.out.print("Enter the number: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		SquareRoot squareRoot = new SquareRoot(Integer.parseInt(reader
				.readLine()));
		int squareRootNum = squareRoot.printSquareRoot();
		System.out.print("The square root of the number is: " + squareRootNum);

	}
}
