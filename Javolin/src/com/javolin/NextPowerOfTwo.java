package com.javolin;

import java.util.Scanner;

//Find next power of two using bit shiftwise operator.

public class NextPowerOfTwo {
	private int number;

	public NextPowerOfTwo(int number) {
		this.number = number;
	}

	public int find() {
		int temp = number;
		int counter = 0;
		if (temp < 0) {
			return 0;
		}
		// find the rightmost set bit
		while (temp != 0) {
			temp = temp >> 1;
			counter++;
		}
		// Get next power of two
		return (1 << counter);
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		NextPowerOfTwo nextPowerOfTwo = new NextPowerOfTwo(scan.nextInt());
		int num = nextPowerOfTwo.find();
		System.out.print(num);
	}
}
