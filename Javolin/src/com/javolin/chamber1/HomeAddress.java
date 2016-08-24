package com.javolin.chamber1;

public class HomeAddress {
	private String longitude;
	private String latitude;
	private String country;
	private String state;
	private String streetAddress;
	private String apartmentName;
	private int flatNumber;

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLongitude() {
		return longitude;
	}
	
	public void setLatitude(String latitude){
		this.latitude = latitude;
	}
	
	public String getLatitude(){
		return latitude;
	}
	
	public void setCountry(String country){
		this.country = country;
	}
	
	public String getCountry(){
		return country;
	}
	
	public void setState(String state){
		this.state = state;
	}
	
	public String getState(){
		return state;
	}
	
	public void setStreetAddress(String streetAString){
		this.streetAddress = streetAString;
	}
	
	public String getStreetAddress(){
		return streetAddress;
	}
	
	public void setApartmentName(String apartmentName){
		this.apartmentName = apartmentName;
	}
	
	public String getApartmentName(){
		return apartmentName;
	}
	
	public void setFlatNumber(int flatNumber){
		this.flatNumber = flatNumber;
	}
	
	public int getFlatNumber(){
		return flatNumber;
	}
}
