package com.javolin;
//Sum of first n prime numbers.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeSum {
	private long number;

	public PrimeSum(long number) {
		this.number = number;
	}

	public int getSum() {
		int sum = 0;
		boolean prime = false;
		System.out.print("\nThe prime numbers are : ");
		if (number > 1) {
			System.out.print(2 + " "); // printing first prime number
			sum = 2;
		}
		for (int i = 2; i <= number; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
				prime = true;
			}
			if (prime) {
				System.out.print(i + " "); // printing the prime numbers
				sum = sum + i; // adding the prime numbers
			}
		}
		return sum;
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.print("Enter the number : ");
		PrimeSum primeSum = new PrimeSum(Long.parseLong(reader.readLine()));
		int sum = primeSum.getSum();
		System.out.println("\nThe sum of prime numbers is: " + sum);

	}
}
