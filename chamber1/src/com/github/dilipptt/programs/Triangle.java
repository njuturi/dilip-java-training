package com.github.dilipptt.programs;

//Find what type of triangle can be formed with given lengths of edges.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
	int x, y, z;

	public Triangle(int edge1, int edge2, int edge3) {
		if (edge1 <= 0 || edge2 <= 0 || edge3 <= 0) {
			throw new IllegalArgumentException();
		}
		x = edge1;
		y = edge2;
		z = edge3;
	}

	public String typeOfTriangle() {
		boolean bool = checkTrianglePossibility(x, y, z); // First lets check if
															// triangle can be
															// formed or not
		String str = null;
		if (bool) {
			if (x == y && y == z) { // Case 1: If all edges are equal
				str = "Equilateral Triangle";
			} else if ((x == y && x != z) || (x != y && y == z)) { // Case 2: If
																	// two edges
																	// are equal
				str = "Iososceles Triangle";
			} else { // Case 3: If non of edges are equal
				str = "Scalen Traingle";
			}
		} else {
			str = "Triangle Cannot be formed";
		}
		return str;
	}

	private boolean checkTrianglePossibility(int x, int y, int z) {
		int max = 0;
		if (x > y && x > z) {
			max = x;
		} else if (y > x && y > z) {
			max = y;
		} else {
			max = z;
		}
		if (max != 0) {
			if (max == x) {
				if (x < y + z) { // This condition should be fulfilled to form a
									// triangle, i.e
									// Longest edge should be smaller than sum
									// of other two edges
					return true;
				}
			} else if (max == y) {
				if ((y < x + z)) {
					return true;
				}
			} else {
				if (z < x + y) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String args[]) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.print("Enter first edge: ");
		int edge1 = Integer.parseInt(reader.readLine());
		System.out.print("\nEnter second edge: ");
		int edge2 = Integer.parseInt(reader.readLine());
		System.out.print("\nEnter third edge: ");
		int edge3 = Integer.parseInt(reader.readLine());
		Triangle triangle = new Triangle(edge1, edge2, edge3);
		String triangleType = triangle.typeOfTriangle();
		System.out.println(triangleType);
	}
}
