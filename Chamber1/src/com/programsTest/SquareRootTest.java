package com.programsTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.programs.CubeRoot;
import com.programs.SquareRoot;

public class SquareRootTest {

	@Test
	// Right
	public void positiveTest() {
		SquareRoot squareRoot = new SquareRoot(4);
		assertEquals(2, squareRoot.printSquareRoot());
	}

	// Inverse relationship
	@Test
	public void squareRootInverseTest() throws Exception {
		SquareRoot squareRoot = new SquareRoot(16);
		int x = squareRoot.printSquareRoot();
		assertEquals(16, x * x);
	}

	// Cross-check Using Other Means
	@Test
	public void positiveTest2() {
		SquareRoot squareRoot = new SquareRoot(64);
		long x = (long) Math.sqrt(64);
		long y = squareRoot.printSquareRoot();
		assertEquals(x, y);
	}

	// Exception test
	@Test
	public void exceptionTest() {
		SquareRoot squareRoot = new SquareRoot(0);
		try {
			squareRoot.printSquareRoot();
			fail("Should have thrown an exception");
		} catch (Exception e) {
			assert (true);
		}
	}
}
