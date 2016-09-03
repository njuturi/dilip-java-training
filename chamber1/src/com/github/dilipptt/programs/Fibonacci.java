package com.github.dilipptt.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fibonacci {
	private int number;
	private List<Integer> fibonacciList = new ArrayList<>();
	private ArrayList<ArrayList<Integer>> listOfGoldenNumberPairs = new ArrayList<ArrayList<Integer>>();

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
		double threshold = 0.00001;
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

			// Below line will print the ratio
			System.out.println("(" + temp2 + " + " + temp1 + ")/ " + temp2
					+ " = " + ratio1);

			// if both ratios are same the two number temp1 and temp2 form golden ratio
			if (Math.abs(ratio2 - ratio1) <= threshold) {
				ArrayList<Integer> arrayList = new ArrayList<>();
				arrayList.add(temp1);
				arrayList.add(temp2);
				// Adding the number pairs into list of lists
				listOfGoldenNumberPairs.add(arrayList);
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
		System.out.print("\nThe Fibonacci series is : ");
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("\n\nThe number pairs that gives golden ratio: " + fibo.getListOfGoldenNumberPairs());
	}

	public ArrayList<ArrayList<Integer>> getListOfGoldenNumberPairs() {
		return listOfGoldenNumberPairs;
	}

	public void setListOfGoldenNumberPairs(
			ArrayList<ArrayList<Integer>> listOfGoldenNumberPairs) {
		this.listOfGoldenNumberPairs = listOfGoldenNumberPairs;
	}
}
