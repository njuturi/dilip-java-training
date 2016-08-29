package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.programs.LargestAnagram;

public class LargestAnagramTest {

	@Test
	public void positiveTest() {
		LargestAnagram largestAnagram = new LargestAnagram("1234");
		int x = largestAnagram.printAnagrams(new char[] {'1','2','3','4'},0);
		assertEquals(4321, x);
	}
	
	@Test
	public void zeroNumberTest() {
		LargestAnagram largestAnagram = new LargestAnagram("0");
		int x = largestAnagram.printAnagrams(new char[] {'0'},0);
		assertEquals(0, x);
	}
	
	@Test
	public void nullTest() {
		try{
			LargestAnagram largestAnagram = new LargestAnagram("");
		}catch(NumberFormatException e){
			fail("Number is Invalid");
		}
	}
	
	@Test
	public void negativeNumberTest() {
		try{
			LargestAnagram largestAnagram = new LargestAnagram("-123");
		}catch(NumberFormatException e){
			fail("Number is Invalid");
		}
	}
}
