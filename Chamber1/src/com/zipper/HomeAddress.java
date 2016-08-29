package com.zipper;

public class HomeAddress {
	private Geolocation geolocation;
	private String country;
	private String state;
	private String streetAddress;
	private String apartmentName;
	private int flatNumber;

	public void setGeolocation(Geolocation geolocation) {
		this.geolocation = geolocation;
	}

	public Geolocation getGeolocation() {
		return geolocation;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setStreetAddress(String streetAString) {
		this.streetAddress = streetAString;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}

	public String getApartmentName() {
		return apartmentName;
	}

	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}

	public int getFlatNumber() {
		return flatNumber;
	}
}
