package com.javolin;
//Reverse the digits of a given number. 
import java.util.Scanner;

public class Reverse {
	long number;

	public Reverse(long number) {
		this.number = number;
	}

	// Function to reverse the Integer
	public void reverseNumbers() {
		long remainder = 0;
		long sum = 0;
		while (number != 0) {
			remainder = number % 10;
			number = number / 10;
			sum = sum * 10 + remainder;
		}
		System.out.print("The reversed number is " + sum);
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		long number = scan.nextInt();
		Reverse reverse = new Reverse(number);
		reverse.reverseNumbers();
	}
}
