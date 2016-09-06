package com.github.dilipptt.stringMetrics;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.stringMetrics.OverlapCoefficient;

public class OverlapCoefficientTest {

	@Test
	public void PositiveTest() {
		OverlapCoefficient overlapCoefficient = new OverlapCoefficient("night",
				"nacht");
		double actual = overlapCoefficient.getOverlapCoefficient();
		double expected = 0.25;
		assertEquals(expected, actual, 0.01);
	}

	@Test
	public void PositiveTestForSameString() {
		OverlapCoefficient overlapCoefficient = new OverlapCoefficient("night",
				"night");
		double actual = overlapCoefficient.getOverlapCoefficient();
		double expected = 1;
		assertEquals(expected, actual, 0.01);
	}

}
