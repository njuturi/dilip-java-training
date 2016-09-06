package com.github.dilipptt.stringMetrics;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.stringMetrics.JaccardCofficient;

public class JaccardCofficientTest {

	@Test
	public void positiveTest() {
		JaccardCofficient cofficient = new JaccardCofficient("night", "nacht");
		double actual = cofficient.getJaccardCofficient(); // 0.1428571429
		double expected = 0.1428;
		assertEquals(expected, actual,0.001);
	}
	
	@Test
	public void nullStringTest() {
		JaccardCofficient cofficient = new JaccardCofficient("0", "nacht");
		double actual = cofficient.getJaccardCofficient(); 
		double expected = 0.0;
		assertEquals(expected, actual,0.001);
	}

}
