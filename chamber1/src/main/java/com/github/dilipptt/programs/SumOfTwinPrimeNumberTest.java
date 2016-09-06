package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.programs.SumOfTwinPrimeNumber;

public class SumOfTwinPrimeNumberTest {

	@Test
	public void positiveTest() {
		SumOfTwinPrimeNumber sum = new SumOfTwinPrimeNumber(5);
		long actual = sum.printSumOfTwinPrimeNumber();
		long expected = 12;
		assertEquals(expected, actual);
	}
	
	@Test
	public void lowerThanTwinPrimeRange() {
		try{
			new SumOfTwinPrimeNumber(2);
		}catch(IllegalArgumentException e){
			fail("Please enter the number more than 5");
		}
	}
	
	@Test
	public void zeroTest() {
		try{
			new SumOfTwinPrimeNumber(0);
		}catch(IllegalArgumentException e){
			fail("Please enter the number more than 5");
		}
	}
	
	@Test
	public void negativeNumberTest() {
		try{
			new SumOfTwinPrimeNumber(-1);
		}catch(IllegalArgumentException e){
			fail("Please enter the number more than 5");
		}
	}

}
