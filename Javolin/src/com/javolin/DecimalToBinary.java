package com.javolin;
//Convert a given decimal number to binary representation.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToBinary {
	private long number;

	public DecimalToBinary(long number) {
		this.number = number;
	}

	public long convertToBinary() {
		long binaryNumber = 0;
		long counter = 1;
		if (number == 0) {
			binaryNumber = 0;
		} else if (number > 0) {
			long remainder = 0;
			while (number != 0) {
				remainder = number % 2;
				number = number / 2;
				binaryNumber = binaryNumber + remainder * counter;
				counter = counter * 10;
			}
		}else if(number < 0){
			return -1; // to do implement for negative test case
		}
		return binaryNumber;
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.print("Enter the Decimal Number : ");
		long num = Long.parseLong(reader.readLine());
		DecimalToBinary decimalToBinary = new DecimalToBinary(num);
		long decNum = decimalToBinary.convertToBinary();
		System.out.println("\nThe binary converted number is: " + decNum);
	}
}
