package com.javolin;

// Find first n twin prime numbers.
// https://en.wikipedia.org/wiki/Twin_prime

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TwinPrimeNumber {
	private long number;

	public TwinPrimeNumber(long number) throws IllegalAccessException{
		if (number <= 5) {
			throw new IllegalAccessException();
		}
		this.number = number;
	}

	public List<Long> printTwinPrimeNumber() {
		long temp1 = 0;
		long temp2 = 0;
		List<Long> list = new ArrayList<Long>();
		// System.out.println("\nThe twin prime numbers are: ");
		if (number > 5) {
			// System.out.print("{(" + 3 + ", " + 5 + ")"); // First twin pair
			// number
			list.add((long) 3);
			list.add((long) 5);
		}
		for (long i = 1; i <= number; i++) {
			// Twin pair form : (6n -1 , 6n + 1)
			temp1 = 6 * i - 1;
			temp2 = 6 * i + 1;
			if (temp1 > number) {
				break;
			}
			// System.out.print(", (" + temp1 + ", " + temp2 + ")");
			list.add(temp1);
			list.add(temp2);
		}
		// System.out.println("}");
		return list;
	}

	// public static void main(String[] args) throws NumberFormatException,
	// IOException, IllegalAccessException {
	// BufferedReader reader = new BufferedReader(new InputStreamReader(
	// System.in));
	// System.out.print("Enter the number: ");
	// TwinPrimeNumber twinPrimeNumber = new TwinPrimeNumber(
	// Integer.parseInt(reader.readLine()));
	// twinPrimeNumber.printTwinPrimeNumber();
	// }
}
