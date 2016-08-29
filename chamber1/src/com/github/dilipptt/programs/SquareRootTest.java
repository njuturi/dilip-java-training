package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.programs.CubeRoot;
import com.github.dilipptt.programs.SquareRoot;

public class SquareRootTest {

	@Test
	// Right
	public void positiveTest() {
		SquareRoot squareRoot = new SquareRoot(4);
		assertEquals(2, squareRoot.printSquareRoot());
	}

	@Test
	// Boundary condition
	public void sqrtTestforZero() {
		try {
			SquareRoot squareRoot = new SquareRoot(0);
		} catch (IllegalArgumentException e) {
			fail("The number should be greater than zero");
		}
	}

	// Inverse relationship
	@Test
	public void squareRootInverseTest() throws Exception {
		SquareRoot squareRoot = new SquareRoot(4);
		int x = squareRoot.printSquareRoot();
		assertEquals(4, x * x);
	}

	// Cross-check Using Other Means
	@Test
	public void positiveTest2() {
		SquareRoot squareRoot = new SquareRoot(64);
		long x = (long) Math.sqrt(64);
		long y = squareRoot.printSquareRoot();
		assertEquals(x, y);
	}

	// force error conditions to happen and make sure appropriate exception is
	// thrown
	@Test
	public void exceptionTest() {
		try {
			SquareRoot squareRoot = new SquareRoot(-1);
			squareRoot.printSquareRoot();
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
}
