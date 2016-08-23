package com.javolin;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryToHex {
	String number;

	public BinaryToHex(String number) {
		this.number = number;
	}

	public void toDecimal() {
		int binaryLength = number.length();
		int tempLength = binaryLength;
		int sum = 0;
		for (int i = 0; i < binaryLength; i++) {
			char ch = number.charAt(--tempLength);
			int decimal = Character.getNumericValue(ch);
			sum = (int) (sum + decimal * Math.pow(2, i));
		}
		System.out.println("The decimal number is: " + sum);
		if (sum > 7) {
			int octalNum = toOctalNum(sum);
			System.out.println("The octal number is: " + octalNum);
		} else {
			System.out.println("The octal number is: " + sum);
		}
		if (sum > 9) {
			String hexNum = toHexaDecimalNum(sum);
			System.out.println("The hexadecimal number is: " + hexNum);
		} else {
			System.out.println("The Hexadecimal number is: " + sum);
		}
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

	public String toHexaDecimalNum(int decimalNum) {
		int remainder = 0;
		int temp = decimalNum;
		int i = 0;
		String ch = "";
		while (temp != 0) {
			remainder = temp % 16;
			switch (remainder) {
			case 1:
				ch = "1" + ch;
				break;
			case 2:
				ch = "2" + ch;
				break;
			case 3:
				ch = "3" + ch;
				break;
			case 4:
				ch = "4" + ch;
				break;
			case 5:
				ch = "5" + ch;
				break;
			case 6:
				ch = "6" + ch;
				break;
			case 7:
				ch = "7" + ch;
				break;
			case 8:
				ch = "8" + ch;
				break;
			case 9:
				ch = "9" + ch;
				break;
			case 10:
				ch = "A" + ch;
				break;
			case 11:
				ch = "B" + ch;
				break;
			case 12:
				ch = "C" + ch;
				break;
			case 13:
				ch = "D" + ch;
				break;
			case 14:
				ch = "E" + ch;
				break;
			case 15:
				ch = "F" + ch;
				break;
			}
			
			i++;
			temp = temp / 16;
		}
		return ch;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Enter the Binary number");
		BinaryToHex binaryToHex = new BinaryToHex(reader.readLine());
		binaryToHex.toDecimal();

	}
}
