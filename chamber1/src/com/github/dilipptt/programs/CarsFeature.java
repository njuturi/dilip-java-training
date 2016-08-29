package com.github.dilipptt.programs;

import java.util.Scanner;

public class CarsFeature {
	// Index of string array will represent set bit postion in a number.
	String[] feature = { "ABS", "Rear-view Camera", "Power Steering",
			"Power windows", "AC", "FM Radio", "CD Player", "MP3 Player" };
	String[] temp = new String[8];

	// findint set bit in integer ->
	// http://stackoverflow.com/questions/3142867/finding-bit-positions-in-an-unsigned-32-bit-integer
	public String[] printFeature(byte number) throws Exception {
		byte i = 1;
		byte j = 0;
		byte k = 0;
		while (i != 0) {
			if ((number & i) != 0) {
				temp[k++] = feature[j];
			}
			i <<= 1;
			j++;
		}
		return temp;
	}

	public static void main(String[] args) throws Exception {
		CarsFeature carFeature = new CarsFeature();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the byte: ");
		try{
			byte number = scan.nextByte();
			String[] featuresOfCar = carFeature.printFeature(number);
			System.out.println("\nThe car has the following features: ");
			for (int i = 0; i < featuresOfCar.length; i++) {
				System.out.println(featuresOfCar[i]);
			}
		}catch(Exception e){
			throw new Exception("Please enter the number in the range -128 to 127" + e);
		}
	}
}
