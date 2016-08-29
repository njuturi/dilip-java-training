package com.github.dilipptt.programs;

public class OrOperator {
	public static void main(String[] args) {
		int i = 5;
		int j = 7;
		int k = 4;
		if (i > j || ++k == i) { // All statements are executed in logical OR
									// operator till it doesn't find true
									// statement incrementing the value of k to
									// 5
			System.out.print("Hello ");
		}
		if (i > j | k-- == i) { // its bitwise and operator, executes all the
								// statements and decrement the value of k
			System.out.println("World ");
		}
		if (i < j || ++k == i) { // Second statement won't be executed
			System.out.print("Java\n");
		}
		System.out.println("i = " + i + ", j = " + j + ", k = " + k);
	}
}
