package com.github.dilipptt.programs;

public class DecimalToOctal {
	private int number;

	public DecimalToOctal(int number) {
		this.number = number;
	}

	public int toOctalNum() {
		int remainder = 0;
		int temp = number;
		int sum = 0;
		int i = 0;
		if (number < 0) {
			return -1; // not implemeted for negative number
		}
		// step 1: 12 % 8 = 2 , 12/8 = 1 , 2 * power(10,0) = 2
		// step 2: 1 % 8 = 1, 1 / 8 = 0, 2 + 1*power(10,1) = 12
		while (temp != 0) {
			remainder = temp % 8;
			temp = temp / 8;
			sum = (int) (sum + remainder * Math.pow(10, i));
			i++;
		}
		return sum;
	}
}
