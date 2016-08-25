package com.javolin.chamber1;

import java.text.DecimalFormat;

public class ZipperDistance {
	public static String getDistance(HomeAddress homeAdd, HomeAddress homeAdd1) {
		double distance = 0;

		double latitude1 = homeAdd.getGeolocation().getLatitude();
		double longitude1 = homeAdd.getGeolocation().getLongitude();
		double latitude2 = homeAdd1.getGeolocation().getLatitude();
		double longitude2 = homeAdd1.getGeolocation().getLongitude();

		// calculate distance between to geolocation ->
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
		DecimalFormat dFormat = new DecimalFormat(".##");
		String d = dFormat.format(distance);

		return d;
	}
}
