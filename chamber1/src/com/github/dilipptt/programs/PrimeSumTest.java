package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.programs.PrimeSum;

public class PrimeSumTest {

	@Test
	public void positiveTest() {
		PrimeSum prime = new PrimeSum(5);
		int actual = prime.getSum();
		int expected = 10;
		assertEquals(expected, actual);
	}

	@Test
	public void zeroLengthTest() {
		try {
			PrimeSum prime = new PrimeSum(0);
			int actual = prime.getSum();
		} catch (IllegalArgumentException e) {
			fail("Invalid parameters");
		}
	}

	@Test
	public void negativeRangeTest() {
		try {
			PrimeSum prime = new PrimeSum(-1);
			int actual = prime.getSum();
		} catch (IllegalArgumentException e) {
			fail("Invalid parameters");
		}
	}
}
