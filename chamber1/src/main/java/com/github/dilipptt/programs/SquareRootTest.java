package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.programs.SquareRoot;

public class SquareRootTest {

	@Test
	// Right
	public void positiveTest() {
		SquareRoot squareRoot = new SquareRoot(4);
		int expected = 2;
		int actaul = squareRoot.getSquareRoot();
		assertEquals(expected, actaul);
	}

	@Test
	// edge condition
	public void sqrtTestforZero() {
		try {
			new SquareRoot(0);
		} catch (IllegalArgumentException e) {
			fail("The number should be greater than zero");
		}
	}

	// Inverse relationship
	@Test
	public void squareRootInverseTest(){
		SquareRoot squareRoot = new SquareRoot(4);
		int x = squareRoot.getSquareRoot();
		assertEquals(4, x * x);
	}

	// Cross-check Using Other Means
	@Test
	public void positiveTest2() {
		SquareRoot squareRoot = new SquareRoot(64);
		long x = (long) Math.sqrt(64);
		long y = squareRoot.getSquareRoot();
		assertEquals(x, y);
	}

	// force error conditions to happen and make sure appropriate exception is
	// thrown
	@Test
	public void exceptionTest() {
		try {
			SquareRoot squareRoot = new SquareRoot(-1);
			squareRoot.getSquareRoot();
		} catch (IllegalArgumentException e) {
			fail("Please enter positive number");
		}
	}
}
