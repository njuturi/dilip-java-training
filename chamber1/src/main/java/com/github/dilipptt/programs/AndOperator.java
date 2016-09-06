package com.github.dilipptt.programs;

public class AndOperator {
	public static void main(String[] args) {
		int i = 5;
		int j = 7;
		int k = 4;
		if (i > j && ++k == i) { // if i > j is 0, second statement inside if
									// won't execute
			System.out.println("Hello ");
		}
		if (i > j & ++k == i) { // its bitwise and operator, executes all the
								// statements and increment the value of k
			System.out.println("World");
		}
		System.out.println("i = " + i + ", j = " + j + ", k = " + k);
	}
}
