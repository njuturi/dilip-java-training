package com.github.dilipptt.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fibonacci {
	private int number;
	private List<Integer> fibonacciList = new ArrayList<>();
	private ArrayList<ArrayList<Double>> listOfGoldenNumberPairs = new ArrayList<ArrayList<Double>>();

	// private double goldenRatio = 1.618034;
	public Fibonacci(int number) {
		if (number < 0) {
			throw new IllegalArgumentException();
		}
		this.number = number;
	}

	public List<Integer> getFibonacci() {
		int temp1 = 0;
		int temp2 = 1;
		int temp3;
		double ratio1;
		double ratio2;
		double threshold = 0.00005;
		ArrayList<Integer> arrayList = new ArrayList<>();
		fibonacciList.add(temp1);
		if (number == 0) {
			return fibonacciList;
		}
		fibonacciList.add(temp2);
		for (int i = 2; i <= number; i++) {
			// ratio1 = (a + b) / a
			ratio1 = ((double) temp2 + (double) temp1) / (temp2);
			// ratio2 = a / b
			ratio2 = ((double) temp2) / (double) temp1;
			// Checking if ratio1 and ratio2 are equal
			// I am considering the ratio are equal if the difference between
			// them is smaller than 0.00005
			if (Math.abs(ratio2 - ratio1) <= threshold) {
				System.out.println(temp1 + " " + temp2);
			}
			temp3 = temp1 + temp2;
			temp1 = temp2;
			temp2 = temp3;
			fibonacciList.add(temp3);
		}
		return fibonacciList;
	}

	public static void main(String[] args) {
		Fibonacci fibo = new Fibonacci(20);
		List<Integer> list = fibo.getFibonacci();
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
