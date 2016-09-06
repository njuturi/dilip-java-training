package com.github.dilipptt.stringMetrics;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.stringMetrics.LevenshteinDistance;

public class LevenshteinDistanceTest {

	@Test
	public void positiveTest1() {
		LevenshteinDistance levenshteinDistance = new LevenshteinDistance("man", "can");
		int distance = levenshteinDistance.levenshteinDistance();
		assertEquals(1, distance);
	}
	
	@Test
	public void positiveTest2() {
		LevenshteinDistance levenshteinDistance = new LevenshteinDistance("kitten", "sitting");
		int distance = levenshteinDistance.levenshteinDistance();
		assertEquals(3, distance);
	}
	
	@Test
	public void positiveTest3() {
		LevenshteinDistance levenshteinDistance = new LevenshteinDistance("kitten", "");
		int distance = levenshteinDistance.levenshteinDistance();
		assertEquals(6, distance);
	}
	
	@Test
	public void stringLengthOfZeroTest() {
		LevenshteinDistance levenshteinDistance = new LevenshteinDistance("", "");
		int distance = levenshteinDistance.levenshteinDistance();
		assertEquals(0, distance);
	}
	
}
