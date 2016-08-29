package com.zipperTest;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import com.zipper.Geolocation;
import com.zipper.HomeAddress;
import com.zipper.ZipperDistance;
import com.zipper.ZipperGenerator;

public class ZipperTest {

	public ZipperGenerator zipperGenerator;

	@Before
	public void setUp() {
		this.zipperGenerator = new ZipperGenerator();
	}

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
				+ this.zipperGenerator.generator(homeAddress));
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
		homeAddress2.setGeolocation(new Geolocation(17.4625110, 78.3460410));
		homeAddress2.setCountry("India");
		homeAddress2.setState("Telangana");
		homeAddress2.setStreetAddress("CMC Enclave");
		homeAddress2.setApartmentName("pearl Village");
		homeAddress2.setFlatNumber(15);
		assertEquals("India", homeAddress2.getCountry());

		// Created second address object for Adam - Gachibowli
		HomeAddress homeAddress3 = new HomeAddress();
		// http://en.mygeoposition.com/ to know your geolocation
		homeAddress3.setGeolocation(new Geolocation(17.4400800, 78.3489170));
		homeAddress3.setCountry("United Kindom");
		homeAddress3.setState("London");
		homeAddress3.setStreetAddress("10 Downing Street");
		homeAddress3.setApartmentName("Kings Tower");
		homeAddress3.setFlatNumber(18);
		assertEquals("United Kindom", homeAddress3.getCountry());

		System.out.println("Hi John! You zipper code for your address is: "
				+ zipperGenerator.generator(homeAddress));
		System.out.println("Hi Tom! You zipper code for your address is: "
				+ zipperGenerator.generator(homeAddress2));
		System.out.println("Hi Adam! You zipper code for your address is: "
				+ zipperGenerator.generator(homeAddress3));

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter zipper to get Full Address: ");
		String userZipper = scan.nextLine();
		// will throw null pointer if other than existing zipper is given, so
		// kept null check
		HomeAddress addrObj = zipperGenerator.getZipperAddressMap().get(
				userZipper);
		if (addrObj != null) {
			System.out.println("Country = " + addrObj.getCountry());
			System.out.println("State = " + addrObj.getState());
			System.out.println("Streetaddress = " + addrObj.getStreetAddress());
			System.out.println("State = " + addrObj.getState());
			System.out.println("ApartmentName = " + addrObj.getApartmentName());
			System.out.println("FlatName = " + addrObj.getFlatNumber());
			System.out.println("Latitude = "
					+ addrObj.getGeolocation().getLatitudeStringForm());
			System.out.println("Longitude = "
					+ addrObj.getGeolocation().getLongitudeStringForm());
		}
	}

	@Test
	public void getZipperDistanceTest() {

		// Created first address object for John
		HomeAddress homeAddress = new HomeAddress();
		homeAddress.setGeolocation(new Geolocation(17.5625110, 78.3460410));
		homeAddress.setCountry("Nepal");
		homeAddress.setState("Morang");
		homeAddress.setStreetAddress("Mahendra Marga");
		homeAddress.setApartmentName("My Home");
		homeAddress.setFlatNumber(21);
		assertEquals("Nepal", homeAddress.getCountry());

		// Created second address object for Tom
		HomeAddress homeAddress2 = new HomeAddress();
		homeAddress2.setGeolocation(new Geolocation(17.4625110, 78.3460410));
		homeAddress2.setCountry("India");
		homeAddress2.setState("Telangana");
		homeAddress2.setStreetAddress("CMC Enclave");
		homeAddress2.setApartmentName("pearl Village");
		homeAddress2.setFlatNumber(15);
		assertEquals("India", homeAddress2.getCountry());

		// Created second address object for Adam
		HomeAddress homeAddress3 = new HomeAddress();
		homeAddress3.setGeolocation(new Geolocation(17.4400800, 78.3489170));
		homeAddress3.setCountry("United Kindom");
		homeAddress3.setState("London");
		homeAddress3.setStreetAddress("10 Downing Street");
		homeAddress3.setApartmentName("Kings Tower");
		homeAddress3.setFlatNumber(18);
		assertEquals("United Kindom", homeAddress3.getCountry());

		System.out.println("Hi John! You zipper code for your address is: "
				+ zipperGenerator.generator(homeAddress));
		System.out.println("Hi Tom! You zipper code for your address is: "
				+ zipperGenerator.generator(homeAddress2));
		System.out.println("Hi Adam! You zipper code for your address is: "
				+ zipperGenerator.generator(homeAddress3));

		Scanner scan = new Scanner(System.in);
		System.out
				.println("Please enter two zippers to find the distance between them: ");
		String zipper1 = scan.nextLine();
		String zipper2 = scan.nextLine();
		HomeAddress homeAdd = zipperGenerator.getZipperAddressMap()
				.get(zipper1);
		HomeAddress homeAdd1 = zipperGenerator.getZipperAddressMap().get(
				zipper2);
		String distance = ZipperDistance.getDistance(homeAdd, homeAdd1);
		scan.close();
		System.out.println("The distance is: " + distance);
	}
}
