package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.programs.SumOfNaturalNumbers;
import com.github.dilipptt.programs.SumOfSquaresOfNaturalNumbers;

public class SumOfSquaresOfNaturalNumbersTest {

	@Test
	public void positiveTest1() {
		SumOfSquaresOfNaturalNumbers sum = new SumOfSquaresOfNaturalNumbers(3);
		int actual = sum.sumOfSquaresOfNaturalNumbers();
		int expected = 14;
		assertEquals(expected, actual);
	}
	
	@Test
	public void positiveTest2s() {
		SumOfSquaresOfNaturalNumbers sum = new SumOfSquaresOfNaturalNumbers(2);
		int actual = sum.sumOfSquaresOfNaturalNumbers();
		int expected = 5;
		assertEquals(expected, actual);
	}
	

	@Test
	public void sumOfNegativeNumberTest() {
		try {
			SumOfSquaresOfNaturalNumbers sum = new SumOfSquaresOfNaturalNumbers(-3);
		} catch (IllegalArgumentException e) {
			fail("Number should be non negative");
		}
	}

	@Test
	public void zeroNumberTest() {
		try {
			SumOfSquaresOfNaturalNumbers sum = new SumOfSquaresOfNaturalNumbers(0);
		} catch (IllegalArgumentException e) {
			fail("Number should be zero");
		}
	}

}
