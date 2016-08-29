package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.programs.HexToBinary;

public class HexToBinaryTest {

	@Test
	public void postiveTest1() {
		HexToBinary hexToBinary = new HexToBinary("5");
		int actual = hexToBinary.toBinaryNum();
		int expected = 101;
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void postiveTest2() {
		HexToBinary hexToBinary = new HexToBinary("AB");
		int actual = hexToBinary.toBinaryNum();
		int expected = 10101011;
		assertEquals(expected, actual);
	}
	
	// TO DO -> ADD case for strings like "HDSC" which is not a valid HEX number
}
