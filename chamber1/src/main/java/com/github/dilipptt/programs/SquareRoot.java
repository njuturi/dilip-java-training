package com.github.dilipptt.programs;

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

	public int getSquareRoot() {
		int i = 0;
		if (number > 0) {
			for (i = 1; i < number / 2; i++) {
				if (i * i == number) {
					break;
				}
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
		int squareRootNum = squareRoot.getSquareRoot();
		System.out.print("The square root of the number is: " + squareRootNum);

	}
}
