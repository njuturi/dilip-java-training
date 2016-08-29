package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.programs.SumOfCubesOfNaturalNumbers;

public class SumOfCubesOfNaturalNumbersTest {

	@Test
	public void positiveTest1() {
		SumOfCubesOfNaturalNumbers sum = new SumOfCubesOfNaturalNumbers(3);
		int actual = sum.sumOfCubesOfNaturalNumbers();
		int expected = 36;
		assertEquals(expected, actual);
	}
	
	@Test
	public void positiveTest2s() {
		SumOfCubesOfNaturalNumbers sum = new SumOfCubesOfNaturalNumbers(50);
		int actual = sum.sumOfCubesOfNaturalNumbers();
		int expected = 1625625;
		assertEquals(expected, actual);
	}
	

	@Test
	public void sumOfNegativeNumberTest() {
		try {
			new SumOfCubesOfNaturalNumbers(-3);
		} catch (IllegalArgumentException e) {
			fail("Number should be non negative");
		}
	}

	@Test
	public void zeroNumberTest() {
		try {
			new SumOfCubesOfNaturalNumbers(0);
		} catch (IllegalArgumentException e) {
			fail("Number should be zero");
		}
	}

}
