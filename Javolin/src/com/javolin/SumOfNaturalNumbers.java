package com.javolin;
//Sum of first n natural numbers.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNaturalNumbers {
	private int number;

	public SumOfNaturalNumbers(int number) {
		this.number = number;
	}

	public int sumOfNaturalNumbers() {
		// Formula for sum of N natural numbers -->
		// https://en.wikipedia.org/wiki/1_%2B_2_%2B_3_%2B_4_%2B_%E2%8B%AF
		int sum = (number * (number + 1)) / 2;
		return sum;
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		System.out.print("Enter the Number: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		SumOfNaturalNumbers obj = new SumOfNaturalNumbers(
				Integer.parseInt(reader.readLine()));
		int sum = obj.sumOfNaturalNumbers();
		System.out.println("The sum of N natural numbers is : " + sum);
	}
}
