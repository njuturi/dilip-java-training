package com.github.dilipptt.programs;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import com.github.dilipptt.programs.CubeRoot;

public class CubeRootTest {

	@Test
	public void positiveTest() throws Exception {
		CubeRoot cubeRoot = new CubeRoot(27);
		// Right data
		assertEquals(3, cubeRoot.printCubeRoot());
	}

	// Inverse relationship
	@Test
	public void cubeRootInverseTest() throws Exception {
		CubeRoot cubeRoot = new CubeRoot(64);
		int x = cubeRoot.printCubeRoot();
		assertEquals(64, x * x * x);
	}

	@Test
	public void exceptionTest() {
		CubeRoot cubeRoot = new CubeRoot(-1);
		try {
			cubeRoot.printCubeRoot();
			fail("Should have thrown an exception");
		} catch (Exception e) {
			assert (true);
		}
	}

	// cross check using other means
	public void cubeRootCrossCheckTest() throws Exception {
		CubeRoot cubeRoot = new CubeRoot(8);
		int x = cubeRoot.printCubeRoot();
		int y = (int) Math.cbrt(8);
		assertEquals(x, y, 0001);

	}

}
