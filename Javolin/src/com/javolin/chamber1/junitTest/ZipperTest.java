package com.javolin.chamber1.junitTest;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.junit.Test;

import com.javolin.chamber1.Geolocation;
import com.javolin.chamber1.HomeAddress;
import com.javolin.chamber1.ZipperGenerator;

public class ZipperTest {

	@Test
	public void getZipperCodeTest() {

		// Created address object reference
		HomeAddress homeAddress = new HomeAddress();
		homeAddress.setGeolocation(new Geolocation(-51.5034070, -0.1275920));
		homeAddress.setCountry("India");
		homeAddress.setState("Telangana");
		homeAddress.setStreetAddress("CMC Enclave");
		homeAddress.setApartmentName("pearl Village");
		homeAddress.setFlatNumber(15);

		System.out.println("Hi Dilip, the zipper code for your address is: "
				+ ZipperGenerator.generator(homeAddress));
		System.out.println("Latitude = "
				+ homeAddress.getGeolocation().getLatitude());
		System.out.println("Longitude = "
				+ homeAddress.getGeolocation().getLongitude());
		assertEquals("India", homeAddress.getCountry());

	}

	@Test
	public void getAddressFromZipperTest() {

		// Created first address object for John
		HomeAddress homeAddress = new HomeAddress();
		homeAddress.setGeolocation(new Geolocation(55.5034070, -01.1275920));
		homeAddress.setCountry("Nepal");
		homeAddress.setState("Morang");
		homeAddress.setStreetAddress("Mahendra Marga");
		homeAddress.setApartmentName("My Home");
		homeAddress.setFlatNumber(21);
		assertEquals("Nepal", homeAddress.getCountry());

		// Created second address object for Tom
		HomeAddress homeAddress2 = new HomeAddress();
		homeAddress.setGeolocation(new Geolocation(51.5034070, -0.1275920));
		homeAddress2.setCountry("India");
		homeAddress2.setState("Telangana");
		homeAddress2.setStreetAddress("CMC Enclave");
		homeAddress2.setApartmentName("pearl Village");
		homeAddress2.setFlatNumber(15);
		assertEquals("India", homeAddress2.getCountry());

		// Created second address object for Adam
		HomeAddress homeAddress3 = new HomeAddress();
		homeAddress.setGeolocation(new Geolocation(51.5034070, -0.1275920));
		homeAddress3.setCountry("United Kindom");
		homeAddress2.setState("London");
		homeAddress3.setStreetAddress("10 Downing Street");
		homeAddress3.setApartmentName("Kings Tower");
		homeAddress3.setFlatNumber(18);
		assertEquals("United Kindom", homeAddress3.getCountry());

		System.out.println("Hi John! You zipper code for your address is: "
				+ ZipperGenerator.generator(homeAddress));
		System.out.println("Hi Tom! You zipper code for your address is: "
				+ ZipperGenerator.generator(homeAddress2));
		System.out.println("Hi Adam! You zipper code for your address is: "
				+ ZipperGenerator.generator(homeAddress3));

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter zipper to get Full Address: ");
		String userZipper = scan.nextLine();
		// will throw null pointer if other than existing zipper is given, so
		// kept null check
		if (ZipperGenerator.zipperAddressMap.get(userZipper) != null) {
			HomeAddress addrObj = (HomeAddress) ZipperGenerator.zipperAddressMap
					.get(userZipper);
			System.out.println("Country = " + addrObj.getCountry());
			System.out.println("State = " + addrObj.getState());
			System.out.println("Streetaddress = " + addrObj.getStreetAddress());
			System.out.println("State = " + addrObj.getState());
			System.out.println("ApartmentName = " + addrObj.getApartmentName());
			System.out.println("FlatName = " + addrObj.getFlatNumber());
			System.out.println("Latitude = "
					+ addrObj.getGeolocation().getLatitude());
			System.out.println("Longitude = "
					+ addrObj.getGeolocation().getLongitude());
		}
	}
}
