package com.javolin;
//Sum of the first n powers of 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumFirstNPowerOf2 {
	private int number;

	public SumFirstNPowerOf2(int number) {
		if(number<=0){
			throw new NumberFormatException();
		}
		this.number = number;
	}

	public int printSum() {
		int sum = 0;
		if (number == 0) {
			return 0;
		}
		for (int i = 1; i <= number; i++) {
			sum = (int) (sum + Math.pow(i, 2));
		}
		return sum;
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		System.out.print("Enter the number: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		SumFirstNPowerOf2 sumFirstNPowerOf2 = new SumFirstNPowerOf2(
				Integer.parseInt(reader.readLine()));
		int sum = sumFirstNPowerOf2.printSum();
		System.out.print("The sum of first N power of Two : " + sum);
	}
}
