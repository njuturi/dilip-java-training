package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.programs.SumFirstNPowerOf2;

public class SumFirstNPowerOf2Test {

	@Test // Decorator
	public void positiveTest() {
		SumFirstNPowerOf2 sum = new SumFirstNPowerOf2(3);
		int actual = sum.printSum();
		int expected = 14;
		assertEquals(expected, actual);
	}
	
	@Test 
	public void sumOfNegativeNumberTest() {
		try{
			new SumFirstNPowerOf2(-2);
		}catch(IllegalArgumentException e){
			fail("Number should be non negative");
		}
	}
	
	@Test 
	public void zeroNumberTest() {
		try{
			new SumFirstNPowerOf2(0);
		}catch(IllegalArgumentException e){
			fail("Number should be zero");
		}
	}
}

