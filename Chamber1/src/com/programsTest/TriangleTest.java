package com.programsTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.programs.Triangle;

public class TriangleTest {

	@Test
	public void scalentTriangleTest() {
		Triangle triangle = new Triangle(4, 6, 5);
		assertEquals("Scalen Traingle", triangle.typeOfTriangle());
	}

	@Test
	public void equilateralTriangleTest() {
		Triangle triangle = new Triangle(6, 6, 6);
		assertEquals("Equilateral Triangle", triangle.typeOfTriangle());
	}

	@Test
	public void isoscelesTriangleTest() {
		Triangle triangle = new Triangle(6, 6, 7);
		assertEquals("Iososceles Triangle", triangle.typeOfTriangle());
	}

	@Test
	public void invalidTriangle() {
		Triangle triangle = new Triangle(1, 4, 3);
		assertEquals("Triangle Cannot be formed", triangle.typeOfTriangle());
	}

	@Test
	public void negativeEdgesTest() {
		try{
			Triangle triangle = new Triangle(-1, -3, 3);
		}catch(IllegalArgumentException e){
			fail("The edges are invalid");
		}
	}

	@Test
	public void zeroEdgeLegthTest() {
		try{
			Triangle triangle = new Triangle(0, 1, 3);
		}catch(IllegalArgumentException e){
			fail("The edges are invalid");
		}
	}

}