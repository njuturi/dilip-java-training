package com.javolin.chamber1;

import java.text.DecimalFormat;

public class Geolocation {
	private double latitude;
	private double longitude;

	public Geolocation(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	//geo location to degree -> https://developer.salesforce.com/forums/?id=906F000000092lGIAQ
	// public void setLatitude(double latitude) {
	// this.latitude = latitude;
	// }
	//
	// public String getLatitude() {
	// long degree = (long) latitude;
	// double factionalPart = (long) (latitude - degree);
	//
	// double minuteSec = factionalPart * 3600;
	// double minute = minuteSec / 60;
	// double sec = minuteSec % 60;
	//
	// String lat = Double.toString(degree) + Double.toString(minute)
	// + Double.toString(sec);
	// System.out.println(lat);
	// return lat;
	//
	// }
	//
	// public LongLat setLongitude(double longitude) {
	// this.longitude = longitude;
	// return this;
	// }
	//
	// public String getLongitude(double longitude) {
	// long degree = (long) longitude;
	// double factionalPart = (long) (longitude - degree);
	//
	// double minuteSec = factionalPart * 3600;
	// double minute = minuteSec / 60;
	// double sec = minuteSec % 60;
	//
	// String lon = Double.toString(degree) + Double.toString(minute)
	// + Double.toString(sec);
	// return lon;
	// }
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
}
