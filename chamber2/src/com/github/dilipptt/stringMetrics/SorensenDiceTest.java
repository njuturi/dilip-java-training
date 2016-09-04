package com.github.dilipptt.stringMetrics;

import static org.junit.Assert.*;

import org.junit.Test;

public class SorensenDiceTest {

	@Test
	public void positiveTest() {
		SorensenDice dice = new SorensenDice("night", "nacht");
		double actual = dice.getDiceCofficient();
		double expected = 0.25;
		assertEquals(expected, actual,0.001);
	}
	
	@Test
	public void nullStringTest() {
		SorensenDice dice = new SorensenDice("", "nacht");
		double actual = dice.getDiceCofficient();
		double expected = 0.0;
		assertEquals(expected, actual,0.001);
	}
	
	@Test
	public void exceptionTest() {
		SorensenDice dice = new SorensenDice("", "");
		try{
			dice.getDiceCofficient();
		}catch(ArithmeticException e){
			assertTrue(true);
		}
	}
}
