package com.junittest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.programs.NextPowerOfTwo;

public class NextPowerOfTwoTest {

	@Test
	public void positiveTest() {
		NextPowerOfTwo next = new NextPowerOfTwo(9);
		int actualNumber = next.find();
		assertEquals(16, actualNumber);
	}
	
	@Test
	public void nextPowerOfZeroTest() {
		NextPowerOfTwo next = new NextPowerOfTwo(0);
		int actualNumber = next.find();
		assertEquals(1, actualNumber);
	}
	
	@Test
	public void nextPowerOfNegativeNumberTest() {
		NextPowerOfTwo next = new NextPowerOfTwo(-2);
		int actualNumber = next.find();
		assertEquals(0, actualNumber);
	}
}
