package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.programs.Factorial;

public class FactorialTest {
	
	@Test
	public void positiveTest() {
		Factorial factorial = new Factorial(3);
		assertEquals(6, factorial.printFactorials(),0.0001);
	}
	
	@Test
	public void negativeNumberTest() {
		try{
			new Factorial(-1);
		}catch(IllegalArgumentException e){
			fail("Please enter the number in the range 1 to 31");
		}
	}
	
	@Test
	public void zeroNumberTest() {
		try{
			new Factorial(0);
		}catch(IllegalArgumentException e){
			fail("Please enter the number in the range 1 to 31");
		}
	}
	
	@Test
	public void outofRangeTest(){
		try {
			new Factorial(32);
		} catch (IllegalArgumentException e) {
			fail("Please enter the number in the range 1 to 31");
		}
	}
}
