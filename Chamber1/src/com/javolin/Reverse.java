package com.javolin;

//Reverse the digits of a given number. 
import java.util.Scanner;

public class Reverse {
	long number;

	public Reverse(long number) {
		if (number <= 0) {
			throw new IllegalArgumentException();
		}
		this.number = number;
	}

	// Function to reverse the Integer
	public String reverseNumbers() {
		long remainder = 0;
		long sum = 0;
		String str = "";
		while (number != 0) {
			remainder = number % 10;
			number = number / 10;
			sum = sum * 10 + remainder;
			str = str + Integer.toString((int) remainder);
		}
		return str;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		long number = scan.nextInt();
		Reverse reverse = new Reverse(number);
		String rev = reverse.reverseNumbers();
		System.out.print("The reversed number is " + rev);
	}
}
