package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.programs.DecimalToOctal;

public class DecimalToOctalTest {

	@Test
	public void positiveTest() {
		DecimalToOctal decimalToOctal = new DecimalToOctal(10); // 10 ---> 12
		int actual = decimalToOctal.toOctalNum();
		assertEquals(12, actual);
	}
	
	@Test
	public void positiveTest2() {
		DecimalToOctal decimalToOctal = new DecimalToOctal(0);
		int actual = decimalToOctal.toOctalNum();
		assertEquals(0, actual);
	}
	
	@Test
	public void positiveTest3() {
		DecimalToOctal decimalToOctal = new DecimalToOctal(8); // 8 --> 10
		int actual = decimalToOctal.toOctalNum();
		assertEquals(10, actual);
	}
	
	@Test
	public void negativeTest() {
		DecimalToOctal decimalToOctal = new DecimalToOctal(-1); 
		int actual = decimalToOctal.toOctalNum();
		assertEquals(-1, actual);
	}
	
	//forcely failling
	@Test
	public void positiveTest4() {
		DecimalToOctal decimalToOctal = new DecimalToOctal(8); // 8 --> 10
		int actual = decimalToOctal.toOctalNum();
		assertEquals(10, actual);
	}
}
