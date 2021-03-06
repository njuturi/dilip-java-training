package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.programs.Reverse;

public class ReverseTest {

	@Test
	public void positiveTest() {
		Reverse reverse = new Reverse(123);
		String actual = reverse.reverseNumbers();
		String expected = "321";
		assertEquals(expected, actual);
	}

	@Test
	public void trailingZeroTest() {
		Reverse reverse = new Reverse(1234567890);
		String actual = reverse.reverseNumbers();
		String expected = "0987654321";
		assertEquals(expected, actual);
	}

	@Test
	public void zeroArgumentTest() {
		try {
			new Reverse(0);
		} catch (Exception e) {
			fail("Argument is invalid");
		}
	}
	
	@Test
	public void negativeArgumentTest() {
		try {
			new Reverse(-123);
		} catch (Exception e) {
			fail("Argument is invalid");
		}
	}
}
