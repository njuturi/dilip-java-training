package com.github.dilipptt.programs;

//Find the cube root of a given number.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CubeRoot {
	double number;

	public CubeRoot(double number) {
		this.number = number;
	}

	public int printCubeRoot() throws Exception {
		int i = 0;
		if (number > 0) {
			for (i = 1; i < number / 2; i++) {
				if ((i * i * i) == number) {
					break;
				} else if (((i * i * i) < number)
						&& ((i + 1) * (i + 1) * (i + 1)) > number) {
					// float cubeRoot = ((float) (number)) / (i + 1);
					// System.out.print("The cube root of the number is: "
					// + cubeRoot);
				}
			}
		} else if (number == 0 || number < 0) {
			throw new Exception("Cube root of zero can't be found");
		}
		return i;
	}

	public static void main(String[] args) throws Exception {
		System.out.print("Enter the number: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		CubeRoot cubeRoot = new CubeRoot(Double.parseDouble(reader.readLine()));
		int cubeRootNum = cubeRoot.printCubeRoot();
		System.out.print("The Cube root of the number is: " + cubeRootNum);
	}
}
