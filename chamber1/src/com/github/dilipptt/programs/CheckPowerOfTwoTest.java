package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.programs.CheckPowerOfTwo;

public class CheckPowerOfTwoTest {

	@Test
	public void positiveTest1() {
		CheckPowerOfTwo checkPowerOfTwo = new CheckPowerOfTwo(4);
		boolean actual= checkPowerOfTwo.check();
		assertEquals(true, actual);
	}
	
	@Test
	public void positiveTest2() {
		CheckPowerOfTwo checkPowerOfTwo = new CheckPowerOfTwo(1024);
		boolean actual= checkPowerOfTwo.check();
		assertEquals(true, actual);
	}
	
	@Test
	public void negativeTest() {
		CheckPowerOfTwo checkPowerOfTwo = new CheckPowerOfTwo(3);
		boolean actual= checkPowerOfTwo.check();
		assertEquals(false, actual);
	}

	@Test
	public void zeroNumberNegativeTest() {
		CheckPowerOfTwo checkPowerOfTwo = new CheckPowerOfTwo(0);
		boolean actual= checkPowerOfTwo.check();
		assertEquals(false, actual);
	}
	
	@Test
	public void negativeNumberTest() {
		CheckPowerOfTwo checkPowerOfTwo = new CheckPowerOfTwo(-1);
		boolean actual= checkPowerOfTwo.check();
		assertEquals(false, actual);
	}
}
