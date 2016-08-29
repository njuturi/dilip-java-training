package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import org.junit.Test;

public class SwappingBitwiseTest {

	@Test
	public void positiveTest() {
		int firstNum = 10;
		int secondNum = 33;
		SwappingBitwise swappingBitwise = new SwappingBitwise(firstNum,
				secondNum);
		swappingBitwise.swap();
		assertEquals(secondNum, swappingBitwise.getFirstNum());
		assertEquals(firstNum, swappingBitwise.getSecondNum());
	}

	@Test
	public void positiveTestForNegativeNumbers() {
		int firstNum = -10;
		int secondNum = -33;
		SwappingBitwise swappingBitwise = new SwappingBitwise(firstNum,
				secondNum);
		swappingBitwise.swap();
		assertEquals(secondNum, swappingBitwise.getFirstNum());
		assertEquals(firstNum, swappingBitwise.getSecondNum());
	}

	@Test
	public void negativeTestForzero() {
		int firstNum = 0;
		int secondNum = 0;
		try{
			new SwappingBitwise(firstNum,
					secondNum);
		}catch(IllegalArgumentException e){
			fail("Two arguments are same");
		}
	}

}
