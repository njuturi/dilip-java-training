package com.javolin.chamber1;

import java.text.DecimalFormat;

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
}
