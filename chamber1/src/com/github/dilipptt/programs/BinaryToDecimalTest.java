package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.programs.BinaryToDecimal;

public class BinaryToDecimalTest {

	@Test
	public void positiveTest() throws Exception {
		BinaryToDecimal binaryToDecimal = new BinaryToDecimal(1101); // 1101 = 13
		long num = binaryToDecimal.convertToDecimal();
		assertEquals(13, num);
	}
	
	@Test
	public void zeroNumberTest() throws Exception {
		BinaryToDecimal binaryToDecimal = new BinaryToDecimal(0); // 0 = 0
		long num = binaryToDecimal.convertToDecimal();
		assertEquals(0, num);
	}
	
	@Test
	public void nonBinaryNumberTest() throws Exception {
		try{
			new BinaryToDecimal(11311);
		}catch(Exception e){
			fail("The number is not a valid binary number");
		}
	}
}
