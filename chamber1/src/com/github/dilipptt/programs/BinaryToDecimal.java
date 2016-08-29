package com.github.dilipptt.programs;

//Convert a given binary number to decimal representation.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryToDecimal {
	private long number;

	public BinaryToDecimal(long number) {
		this.number = number;
	}

	public long convertToDecimal() throws Exception {
		long sum = 0;
		String num = Long.toString(number); // Converting integer to String.
											// Reference ->
											// https://docs.oracle.com/javase/tutorial/java/data/converting.html
		long numSize = num.length();
		long temp = numSize;
		for (long i = 0; i < numSize; i++) {
			char character = num.charAt((int) --temp); // getting last
														// character.
			long decimal = Character.getNumericValue(character); // Converting
																	// character
																	// to
																	// integer
																	// -->
																	// http://stackoverflow.com/questions/19388037/converting-characters-to-integers-in-java
			if(decimal>1){
				throw new Exception("Not a binary number");
			}
			sum = sum + decimal * (long) Math.pow(2, i);
		}
		return sum;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Enter the Binary Number : ");
		long num = Integer.parseInt(reader.readLine());
		BinaryToDecimal decimalToBinary = new BinaryToDecimal(num);
		long decimalNuber = decimalToBinary.convertToDecimal();
		System.out.println("The decimal number is: " + decimalNuber);
	}
}
