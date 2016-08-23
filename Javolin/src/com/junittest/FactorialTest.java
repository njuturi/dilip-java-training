package com.junittest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.javolin.Factorial;

public class FactorialTest {
	
	@Test
	public void positiveTest() {
		Factorial factorial = new Factorial(3);
		assertEquals(6, factorial.printFactorials(),0.0001);
	}
	
	@Test
	public void negativeNumberTest() {
		Factorial factorial = new Factorial(-3);
		assertEquals(0, factorial.printFactorials(),0.0001);
	}
	
	@Test
	public void zeroNumberTest() {
		Factorial factorial = new Factorial(0);
		assertEquals(0, factorial.printFactorials(),0.0001);
	}
	
	public void outofRangeTest(){
		Factorial factorial = new Factorial(32);
		assertEquals(-1, factorial.printFactorials(),0.0001);
	}
}
