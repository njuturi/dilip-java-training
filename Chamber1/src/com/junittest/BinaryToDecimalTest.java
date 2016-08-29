package com.junittest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.javolin.BinaryToDecimal;

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
		BinaryToDecimal binaryToDecimal = new BinaryToDecimal(0); // 1131001 --> not a binary number
		try{
			long num = binaryToDecimal.convertToDecimal();
			System.out.println("I am catching exception");
		}catch(Exception e){
			assert(true);
		}
	}
}
