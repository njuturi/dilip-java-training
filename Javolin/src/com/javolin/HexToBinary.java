package com.javolin;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HexToBinary {
	String number;

	public HexToBinary(String number) {
		this.number = number;
	}

	public void toDecimal() {
		int lengthOfNumber = number.length();
		int temp = lengthOfNumber - 1;
		int decimalNum = 0;
		for (int i = 0; i < lengthOfNumber; i++) {
			char ch = number.charAt(i);
			int digit = 0;
			switch (ch) {
			case '0':
				digit = 0;
				break;
			case '1':
				digit = 1;
				break;
			case '2':
				digit = 2;
				break;
			case '3':
				digit = 3;
				break;
			case '4':
				digit = 4;
				break;
			case '5':
				digit = 5;
				break;
			case '6':
				digit = 6;
				break;
			case '7':
				digit = 7;
				break;
			case '8':
				digit = 8;
				break;
			case '9':
				digit = 9;
				break;
			case 'A':
				digit = 10;
				break;
			case 'B':
				digit = 11;
				break;
			case 'C':
				digit = 12;
				break;
			case 'D':
				digit = 13;
				break;
			case 'E':
				digit = 14;
				break;
			case 'F':
				digit = 15;
				break;
			}
			decimalNum = (int) (decimalNum + digit * Math.pow(16, (temp)));
			temp--;
		}
		System.out.println("The decimal number is: " + decimalNum);
		if (decimalNum > 7) {
			int octalNum = toOctalNum(decimalNum);
			System.out.println("The octal number is: " + octalNum);
		}else{
			System.out.println("The octal number is: " + decimalNum);
		}
		int binaryNumber = toBinaryNum(decimalNum);
		System.out.println("The Binary number is: " + binaryNumber);

	}

	public int toOctalNum(int decimalNum) {
		int remainder = 0;
		int temp = decimalNum;
		int sum = 0;
		int i = 0;
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

	public int toBinaryNum(int decimalNum) {
		int remainder = 0;
		int temp = decimalNum;
		int sum = 0;
		int i = 0;
		while (temp != 0) {
			remainder = temp % 2;
			temp = temp / 2;
			sum = (int) (sum + remainder * Math.pow(10, i));
			i++;
		}
		return sum;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Enter the hexadecimal number");
		HexToBinary hexToBinary = new HexToBinary(reader.readLine());
		hexToBinary.toDecimal();

	}
}
