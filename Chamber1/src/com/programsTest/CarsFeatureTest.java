package com.programsTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.programs.CarsFeature;

public class CarsFeatureTest {

	@SuppressWarnings("deprecation")
	@Test
	public void positiveTestCase() throws Exception {
		CarsFeature carsFeature = new CarsFeature();
		String[] actual = carsFeature.printFeature((byte) 7);
		assertEquals(new String[] { "ABS", "Rear-view Camera",
				"Power Steering", null, null, null, null, null }, actual);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void negativeNumberTestCase() throws Exception {
		CarsFeature carsFeature = new CarsFeature();
		String[] actual = carsFeature.printFeature((byte) -7); // 1111001 = 7
		assertEquals(new String[] { "ABS", "Power windows", "AC", "FM Radio",
				"CD Player", "MP3 Player", null, null }, actual);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void zeroByteTestCase() throws Exception {
		CarsFeature carsFeature = new CarsFeature();
		String[] actual = carsFeature.printFeature((byte) 0);
		assertEquals(new String[] { null, null, null, null, null, null, null,
				null }, actual);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void largestBytetestCase() throws Exception {
		CarsFeature carsFeature = new CarsFeature();
		String[] actual = carsFeature.printFeature((byte) 127); // 127 =
																// 01111111
		assertEquals(new String[] { "ABS", "Rear-view Camera",
				"Power Steering", "Power windows", "AC", "FM Radio",
				"CD Player", null }, actual);
	}

	// failling forcely
	@SuppressWarnings("deprecation")
	@Test
	public void smallestByteTestCase() throws Exception {
		CarsFeature carsFeature = new CarsFeature();
		String[] actual = carsFeature.printFeature((byte) -128); // -128 =
																	// 10000000
		assertEquals(new String[] { "ABS", "Rear-view Camera",
				"Power Steering", "Power windows", "AC", "FM Radio",
				"CD Player", null }, actual);
	}

}
