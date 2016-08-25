package com.javolin.chamber1;

public class ZipperDistance {
	public static double getDistance(String zipper1, String zipper2) {
		double distance = 0;
		HomeAddress address1 = (HomeAddress) ZipperGenerator.zipperAddressMap
				.get(zipper1);
		HomeAddress address2 = (HomeAddress) ZipperGenerator.zipperAddressMap
				.get(zipper2);

		double latitude1 = address1.getGeolocation().getLatitude();
		double longitude1 = address1.getGeolocation().getLongitude();
		double latitude2 = address2.getGeolocation().getLatitude();
		double longitude2 = address2.getGeolocation().getLongitude();

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
		return distance;
	}
}
