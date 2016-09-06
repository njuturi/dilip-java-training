package com.github.dilipptt.programs;
//Sum of the squares of first n natural numbers.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfSquaresOfNaturalNumbers {
	private int number;

	public SumOfSquaresOfNaturalNumbers(int number) {
		if(number<=0){
			throw new NumberFormatException();
		}
		this.number = number;
	}

	public int sumOfSquaresOfNaturalNumbers() {
		int sum = (number * (number + 1) * ((2 * number) + 1)) / 6;
		return sum;
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		System.out.print("Enter the Number: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		SumOfSquaresOfNaturalNumbers obj = new SumOfSquaresOfNaturalNumbers(
				Integer.parseInt(reader.readLine()));
		int sum = obj.sumOfSquaresOfNaturalNumbers();
		System.out.println("The sum of squares of N natural numbers is : "
				+ sum);
	}
}
