package com.programs;
//Sum of the cubes of first n natural numbers.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfCubesOfNaturalNumbers {
	private int number;

	public SumOfCubesOfNaturalNumbers(int number) {
		if(number<=0){
			throw new NumberFormatException();
		}
		this.number = number;
	}

	public int sumOfCubesOfNaturalNumbers() {
		int sum = ((number * (number + 1)) / 2) * ((number * (number + 1)) / 2);
		return sum;
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		System.out.print("Enter the Number: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		SumOfCubesOfNaturalNumbers obj = new SumOfCubesOfNaturalNumbers(
				Integer.parseInt(reader.readLine()));
		int sum = obj.sumOfCubesOfNaturalNumbers();
		System.out.println("The sum of cube N natural numbers is : " + sum);
	}
}
