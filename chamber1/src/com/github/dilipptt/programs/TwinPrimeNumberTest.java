package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.github.dilipptt.programs.TwinPrimeNumber;

public class TwinPrimeNumberTest {

	@Test
	public void positiveTest() throws IllegalArgumentException {
		TwinPrimeNumber twinPrime = new TwinPrimeNumber(11);
		List<Long> actual = twinPrime.printTwinPrimeNumber();
		List<Long> expected = Arrays.asList((long)3,(long)5,(long)5,(long)7,(long)11,(long)13);
		assertEquals(expected, actual);
	}

	@Test
	public void lowerThanTwinPrimeRange() throws IllegalArgumentException {
		try{
			new TwinPrimeNumber(2);
		}catch(IllegalArgumentException e){
			fail("Please enter the number more than 5");
		}
	}
	
	@Test
	public void zeroTest() throws IllegalArgumentException {
		try{
			new TwinPrimeNumber(0);
		}catch(IllegalArgumentException e){
			fail("Please enter the number more than 5");
		}
	}
	
	@Test
	public void negativeNumberTest() throws IllegalArgumentException {
		try{
			new TwinPrimeNumber(-1);
		}catch(IllegalArgumentException e){
			fail("Please enter the number more than 5");
		}
	}
}
