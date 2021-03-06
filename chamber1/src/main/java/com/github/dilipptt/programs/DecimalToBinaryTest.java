package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.programs.DecimalToBinary;

public class DecimalToBinaryTest {

	@Test
	public void positiveTest1() {
		DecimalToBinary decimalToBinary = new DecimalToBinary(50); // 50 = 110010
		assertEquals(110010, decimalToBinary.convertToBinary());
	}
	
	@Test
	public void positiveTest2() {
		DecimalToBinary decimalToBinary = new DecimalToBinary(7); // 5 = 111
		assertEquals(111, decimalToBinary.convertToBinary());
	}
	
	@Test
	public void negativeNumberTest() {
		new DecimalToBinary(-7); 
		fail("not implement for negative number case");
	}
	
	@Test
	public void zeroNumberTest() {
		DecimalToBinary decimalToBinary = new DecimalToBinary(0); 
		assertEquals(0, decimalToBinary.convertToBinary());
	}
}
