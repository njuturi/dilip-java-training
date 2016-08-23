package com.javolin;
import java.util.Scanner;

//Find next power of two using bit shiftwise operator.

public class NextPowerOfTwo {
	private int number;

	public NextPowerOfTwo(int number) {
		this.number = number;
	}

	public void find() {
		int temp = number;
		int counter = 0;
		// find the rightmost set bit
		while (temp != 0) {
			temp = temp >> 1;
			counter++;
		}
		// Get next power of two
		System.out.println("\nThe next power of two for a given number is: "
				+ (1 << counter));
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		NextPowerOfTwo nextPowerOfTwo = new NextPowerOfTwo(scan.nextInt());
		nextPowerOfTwo.find();
	}
}
