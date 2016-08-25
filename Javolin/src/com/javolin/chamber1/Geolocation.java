package com.javolin.chamber1;

public class Geolocation {
	private double latitude;
	private double longitude;

	public Geolocation(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}

	public Geolocation setLatitude(double latitude) {
		this.latitude = latitude;
		return this;
	}

	public double getLongitude() {
		return longitude;
	}

	public Geolocation setLongitude(double longitude) {
		this.longitude = longitude;
		return this;
	}

	public String getLatitudeStringForm() {

		// For getting fraction part from double
		// http://stackoverflow.com/questions/343584/how-do-i-get-whole-and-fractional-parts-from-double-in-jsp-java

		// to get North, East, west, south direction
		// https://developer.salesforce.com/forums/?id=906F000000092lGIAQ
		String direction = "N";
		if (latitude < 0) {
			latitude = latitude * -1;
			direction = "S";
		}

		int degree = (int) latitude;
		double factionalPart1 = latitude - (double) degree;

		double minuteSec = factionalPart1 * 60;
		double minute = (int) minuteSec;

		double factionalPart2 = minuteSec * 60;
		double sec = (int) factionalPart2;

		String lat = Integer.toString(degree) + "°" + Integer.toString((int) minute)
				+ "'" + Integer.toString((int) sec) + "''" + " " + direction;
		return lat;

	}

	public String getLongitudeStringForm() {
		String direction = "E";
		if (longitude < 0) {
			longitude = longitude * -1;
			direction = "W";
		}
		int degree = (int) longitude;
		double factionalPart1 = longitude - (double) degree;

		double minuteSec = factionalPart1 * 60;
		double minute = (int) minuteSec;

		double factionalPart2 = minuteSec * 60;
		double sec = (int) factionalPart2;

		String lon = Integer.toString(degree) + "°" + Integer.toString((int)minute)
				+ "'" + Integer.toString((int)sec) + "''" + " " + direction;
		return lon;
	}

}
