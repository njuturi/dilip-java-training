package com.junittest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.programs.Prime;

public class PrimeTest {

	@Test
	public void positiveTest() {
		Prime prime = new Prime(10);
		List<Integer> actual =  prime.printPrimeNumbers();
		List<Integer> expected = Arrays.asList(2,3,5,7);
		assertEquals(expected, actual);
	}
	
	@Test
	public void zeroLengthTest() {
		try{
			Prime prime = new Prime(0);
			List<Integer> actual =  prime.printPrimeNumbers();
		}catch(IllegalArgumentException e){
			fail("Invalid parameters");
		}
	}
	
	@Test
	public void negativeRangeTest() {
		try{
			Prime prime = new Prime(-1);
			List<Integer> actual =  prime.printPrimeNumbers();
		}catch(IllegalArgumentException e){
			fail("Invalid parameters");
		}
	}
}
