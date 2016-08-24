package com.javolin;

// Find first n prime numbers.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Prime {
	private int num;

	public Prime(int num) {
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		this.num = num;
	}

	public List<Integer> printPrimeNumbers() {
		List<Integer> list = new ArrayList<Integer>();
		int prime = 0;
		if (num > 1) {
			list.add(2);
		}
		for (int i = 2; i <= num; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = 0;
					break; // not prime , breaking the inner loop and finding
							// the next prime number
				}
				prime = 1;
			}
			if (prime == 1) {
				list.add(i);
			}
		}
		return list;
	}

	// public static void main(String args[]) throws IOException {
	// BufferedReader reader = new BufferedReader(new InputStreamReader(
	// System.in));
	// System.out.print("Enter the range of number : ");
	// String input = reader.readLine();
	// int num = Integer.parseInt(input);
	// Prime prime = new Prime(num);
	// if (num > 0) {
	// System.out.println("The prime numbers are ");
	// prime.printPrimeNumbers();
	// }
	// }
}
