package com.github.dilipptt.stringMetrics;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.stringMetrics.TverskyCoffiecient;

public class TverskyCoffiecientTest {

	@Test
	public void positvetest() {
		TverskyCoffiecient coeCoffiecient = new TverskyCoffiecient("night",
				"nacht");
		double actual = coeCoffiecient.getTverskyCoffiecient();// 0.1111111111
		double expected = 0.11;
		assertEquals(expected, actual, 0.01);
	}
	
	@Test
	public void nullStringTest() {
		TverskyCoffiecient coeCoffiecient = new TverskyCoffiecient("", "nacht");
		double actual = coeCoffiecient.getTverskyCoffiecient();
		double expected = 0.0;
		assertEquals(expected, actual,0.01);
	}
	
	@Test
	public void exceptionTest() {
		TverskyCoffiecient coeCoffiecient = new TverskyCoffiecient("", "");
		try{
			coeCoffiecient.getTverskyCoffiecient();
		}catch(ArithmeticException e){
			assertTrue(true);
		}
	}

}
