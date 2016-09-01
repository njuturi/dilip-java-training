package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FibonacciTest {
	
	@Test
	public void positiveTest() {
		Fibonacci fibonacci = new Fibonacci(9);
		List<Integer> actual = fibonacci.getFibonacci();
		List<Integer> expected = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);
		assertEquals(expected, actual);
	}
	
	@Test
	public void fibonacciTestForZero() {
		Fibonacci fibonacci = new Fibonacci(0);
		List<Integer> actual = fibonacci.getFibonacci();
		List<Integer> expected = Arrays.asList(0);
		assertEquals(expected, actual);
	}
	
	@Test
	public void fibonacciTestForOne() {
		Fibonacci fibonacci = new Fibonacci(1);
		List<Integer> actual = fibonacci.getFibonacci();
		List<Integer> expected = Arrays.asList(0,1);
		assertEquals(expected, actual);
	}
	
	@Test
	public void negativeNumberTest() {
		try{
			new Fibonacci(-1);
		}catch(IllegalArgumentException e){
			fail("Please enter positive number");
		}
	}

}
