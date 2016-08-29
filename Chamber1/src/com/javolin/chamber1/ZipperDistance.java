package com.javolin.chamber1;

import java.text.DecimalFormat;

public class ZipperDistance {
	public static String getDistance(HomeAddress homeAdd, HomeAddress homeAdd1) {
		double distance = 0;
		double threshold = 0.000000000000001;
		boolean a, b;
		if(homeAdd==null || homeAdd1==null){
			throw new IllegalArgumentException();
		}
		double latitude1 = homeAdd.getGeolocation().getLatitude();
		double longitude1 = homeAdd.getGeolocation().getLongitude();
		double latitude2 = homeAdd1.getGeolocation().getLatitude();
		double longitude2 = homeAdd1.getGeolocation().getLongitude();

		a = Math.abs(latitude1 - latitude2) < threshold;
		b = Math.abs(longitude2 - longitude1) < threshold;

		// Comparing floating point number
		// http://stackoverflow.com/questions/4915462/how-should-i-do-floating-point-comparison
		if (latitude1 > latitude2) {
			a = Math.abs(latitude1 - latitude2) < threshold;
			if (longitude1 > longitude2) {
				b = Math.abs(longitude1 - longitude2) < threshold;
			} else {
				b = Math.abs(longitude2 - longitude1) < threshold;
			}
		} else if (latitude2 > latitude1) {
			a = Math.abs(latitude1 - latitude2) < threshold;
			if (longitude1 > longitude2) {
				b = Math.abs(longitude1 - longitude2) < threshold;
			} else {
				b = Math.abs(longitude2 - longitude1) < threshold;
			}
		}
		if (a == true && b == true) {
			System.out.println("Two locations are same");
			return "0 Km";
		}

		// Calculate distance between to geolocation ->
		// http://stackoverflow.com/questions/5557706/calculating-distance-using-latitude-longitude-coordinates-in-kilometers-with-jav

		double theta = longitude1 - longitude2;
		double dist = Math.sin(Math.toRadians(latitude1))
				* Math.sin(Math.toRadians(latitude2))
				+ Math.cos(Math.toRadians(latitude1))
				* Math.cos(Math.toRadians(latitude2))
				* Math.cos(Math.toRadians(theta));

		dist = Math.toDegrees(Math.acos(dist));
		distance = dist * 69.09 * 1.609344; // 1 miles = 1.6093 kilometer

		// Convert to 2 decimal points
		// https://www.mkyong.com/java/java-display-double-in-2-decimal-points/
		String d = "0 Km";
		if (distance > 0) {
			DecimalFormat dFormat = new DecimalFormat(".##");
			d = dFormat.format(distance) + " Km";
		}
		return d;
	}
}
