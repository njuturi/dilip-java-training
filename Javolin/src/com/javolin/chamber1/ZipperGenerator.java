package com.javolin.chamber1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class ZipperGenerator {

	public static String Aphabet = "ABCDEFGHJKMNPQRSTUVWXYZ";
	public static String Numeric = "23456789";
	public static int aphabetLength = Aphabet.length(); 
	public static int numericLength = Numeric.length(); 

	// Using below map as a directory
	private Map<String, HomeAddress> zipperAddressMap = new HashMap<>();

	public String generator(HomeAddress homeAddress) {
		Set<String> zipperSet = new HashSet<String>();
		String zipper = "";
		Random rand = new Random();

		// generate random 4 character string
		for (int i = 0; i < 4; i++) {
			int randNum = rand.nextInt(aphabetLength);
			zipper = zipper + Aphabet.charAt(randNum);
		}

		// generate random 4 digit integer
		for (int i = 0; i < 4; i++) {
			int randNum = rand.nextInt(numericLength);
			zipper = zipper + Numeric.charAt(randNum);
		}

		// adding all zippers to set and allowing duplication
		Boolean bool = zipperSet.add(zipper);

		// if zipper is duplicate, then create another zipper
		if (bool == false) {
			generator(homeAddress);
		} else {
			zipperAddressMap.put(zipper, homeAddress);
		}

		return zipper;
	}

	public Map<String, HomeAddress> getZipperAddressMap() {
		return zipperAddressMap;
	}

	public void setZipperAddressMap(Map<String, HomeAddress> zipperAddressMap) {
		this.zipperAddressMap = zipperAddressMap;
	}

}
