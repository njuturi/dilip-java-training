package com.javolin;

//Find the factorial of a given number.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	long number;

	public Factorial(long number) {
		if (number <= 0 || number > 31) {
			throw new IllegalArgumentException();
		}
		this.number = number;
	}

	public float printFactorials() {
		if (number <= 0) { // for negative numbers factorial will be zero
			return 0;
		}
		System.out.print("The factorials of number " + number + " is : ");
		for (long i = number - 1; i >= 1; i--) {
			number = number * i;
		}
		return number;
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		System.out.print("Enter the number: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		Factorial factorials = new Factorial(Long.parseLong(reader.readLine()));
		long fact = (long) factorials.printFactorials();
		System.out.print(fact);
	}
}
