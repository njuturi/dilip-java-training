package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.programs.SumOfNaturalNumbers;

public class SumOfNaturalNumbersTest {

	@Test
	public void positiveTest1() {
		SumOfNaturalNumbers sum = new SumOfNaturalNumbers(3);
		int actual = sum.sumOfNaturalNumbers();
		int expected = 6;
		assertEquals(expected, actual);
	}
	
	@Test
	public void positiveTest2s() {
		SumOfNaturalNumbers sum = new SumOfNaturalNumbers(10);
		int actual = sum.sumOfNaturalNumbers();
		int expected = 55;
		assertEquals(expected, actual);
	}
	

	@Test
	public void sumOfNegativeNumberTest() {
		try {
			new SumOfNaturalNumbers(-3);
		} catch (IllegalArgumentException e) {
			fail("Number should be non negative");
		}
	}

	@Test
	public void zeroNumberTest() {
		try {
			new SumOfNaturalNumbers(0);
		} catch (IllegalArgumentException e) {
			fail("Number should be zero");
		}
	}

}
