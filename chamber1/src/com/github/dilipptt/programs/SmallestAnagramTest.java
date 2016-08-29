package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.programs.LargestAnagram;
import com.github.dilipptt.programs.SmallestAnagram;

public class SmallestAnagramTest {

	@Test
	public void positiveTest() {
		SmallestAnagram smallestAnagram = new SmallestAnagram("1234");
		int actual = smallestAnagram.printAnagrams(new char[] { '1', '2', '3', '4' },
				0);
		assertEquals(1234, actual);
	}

	@Test
	public void zeroNumberTest() {
		SmallestAnagram smallestAnagram = new SmallestAnagram("0");
		int actual = smallestAnagram.printAnagrams(new char[] { '0' }, 0);
		assertEquals(0, actual);
	}

	@Test
	public void nullTest() {
		try {
			SmallestAnagram smallestAnagram = new SmallestAnagram("");
		} catch (NumberFormatException e) {
			fail("Number is Invalid");
		}
	}

	@Test
	public void negativeNumberTest() {
		try {
			SmallestAnagram smallestAnagram = new SmallestAnagram("-123");
		} catch (NumberFormatException e) {
			fail("Number is Invalid");
		}
	}

}
