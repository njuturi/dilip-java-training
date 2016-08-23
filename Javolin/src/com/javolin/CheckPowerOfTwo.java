package com.javolin;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CheckPowerOfTwo {
	private int number;
	public CheckPowerOfTwo(int number){
		this.number = number;
	}
	public boolean check(){
		// If number to be checked is 0 or negative number then its not power of two
		if(number <= 0){
			return false;
		}
		// 4 --> 100 & 011 = 0 -->power of 2
		// 5 --> 101 & 100 = 100 --> not power of 2

		number = number & (number - 1);
		if(number == 0){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number :");
		int num = Integer.parseInt(reader.readLine());
		CheckPowerOfTwo checkObj = new CheckPowerOfTwo(num);
		boolean bool = checkObj.check();
		if(bool){
			System.out.println("The number is power of 2");
		}else{
			System.out.println("The number is Not power of 2");
		}
	}
}
