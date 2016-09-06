// https://github.com/dilipptt/dilip-java-training/wiki/Overlap-coefficient

package com.github.dilipptt.stringMetrics;

import java.util.HashSet;
import java.util.Set;

public class OverlapCoefficient {

	private String string1, string2;

	public OverlapCoefficient(String string1, String string2) {
		this.setString1(string1);
		this.setString2(string2);
	}

	public String getString1() {
		return string1;
	}

	public void setString1(String string1) {
		this.string1 = string1;
	}

	public String getString2() {
		return string2;
	}

	public void setString2(String string2) {
		this.string2 = string2;
	}

	public double getOverlapCoefficient() {
		double coefficient = 0.0;
		Set<String> x = new HashSet<>();
		Set<String> y = new HashSet<>();

		for (int i = 0; i < string1.length() - 1; i++) {
			String temp = "" + string1.charAt(i) + string1.charAt(i + 1);
			x.add(temp);
		}

		for (int j = 0; j < string2.length() - 1; j++) {
			String temp = "" + string2.charAt(j) + string2.charAt(j + 1);
			y.add(temp);
		}

		Set<String> intersection = new HashSet<>(x);
		intersection.retainAll(y);
		double commonBigrams = intersection.size();

		try {
			coefficient = commonBigrams / (Math.min(x.size(), y.size()));
		} catch (ArithmeticException e) {
			throw new ArithmeticException("Divided by zero");
		}

		return coefficient;
	}

}
