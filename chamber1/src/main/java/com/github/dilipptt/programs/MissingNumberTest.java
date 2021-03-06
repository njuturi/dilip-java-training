package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.programs.MissingNumber;

public class MissingNumberTest {

	@Test
	public void positiveTest() throws Exception {
		MissingNumber missingNum = new MissingNumber();
		int actualMissingNumber = missingNum.missingNumber(new int[] {1,3,4,5,6},5);
		assertEquals(2, actualMissingNumber);
	}
	
	@Test
	public void singleNumeberTest() {
		MissingNumber missingNum = new MissingNumber();
		try {
			missingNum.missingNumber(new int[] {0},1);
		} catch (Exception e) {
			fail("Array is invalid");
		}
	}
	
	@Test
	public void nullArrayTest() {
		MissingNumber missingNum = new MissingNumber();
		try {
			missingNum.missingNumber(new int[] {},1);
		} catch (Exception e) {
			fail("Array is invalid");
		}
	}
}
