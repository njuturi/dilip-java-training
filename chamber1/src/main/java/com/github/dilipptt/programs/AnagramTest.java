package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.github.dilipptt.programs.Anagram;

public class AnagramTest {

	@Test
	public void positiveTest() {
		Anagram anagram = new Anagram("1234");
		List<Integer> actual = anagram.printAnagrams(new char[] {'1','2','3'},0);
		List<Integer> expected = Arrays.asList(123,132,213,231,321,312);
		assertEquals(expected, actual);
	}
	
	@Test
	public void zeroNumberTest() {
		try{
			new Anagram("0");
		}catch(IllegalArgumentException e){
			fail("Number is Invalid");
		}
	}
	
	@Test
	public void nullTest() {
		try{
			new Anagram("");
		}catch(IllegalArgumentException e){
			fail("Number is Invalid");
		}
	}
	
	@Test
	public void negativeNumberTest() {
		try{
			new Anagram("-123");
		}catch(IllegalArgumentException e){
			fail("Number is Invalid");
		}
	}

}
