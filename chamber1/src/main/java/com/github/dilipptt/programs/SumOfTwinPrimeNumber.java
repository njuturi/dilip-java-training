package com.github.dilipptt.programs;
// Find first n twin prime numbers.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfTwinPrimeNumber {
	private long number;

	public SumOfTwinPrimeNumber(long number) {
		if(number<=3){
			throw new IllegalArgumentException();
		}
		this.number = number;
	}

	public long printSumOfTwinPrimeNumber() {
		long temp1 = 0;
		long temp2 = 0;
		long sum = 0;
//		System.out.println("The twin prime numbers are: ");
		if (number > 5) {
//			System.out.print("{(" + 3 + ", " + 5 + ")"); // First twin pair
															// number
			sum = sum + 3 + 5;
		}
		for (long i = 1; i <= number; i++) {
			// Twin pair (6n -1 , 6n + 1)
			temp1 = 6 * i - 1;
			temp2 = 6 * i + 1;
			if (temp1 > number) {
				break;
			}
//			System.out.print(", (" + temp1 + ", " + temp2 + ")");
			sum = sum + temp1 + temp2;
		}
//		System.out.println("}");
//		System.out.println("The sum of twin prime numbers is : " + sum);
		return sum;
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.print("Enter the number: ");
		SumOfTwinPrimeNumber twinPrimeNumber = new SumOfTwinPrimeNumber(
				Integer.parseInt(reader.readLine()));
		long sum = twinPrimeNumber.printSumOfTwinPrimeNumber();
		System.out.println("The sum of twin prime numbers is : " + sum);
	}
}
