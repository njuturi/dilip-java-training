package com.javolin.chamber1.junitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.javolin.chamber1.HomeAddress;

public class HomeAddressTest {

	@Test
	public void test() {
		HomeAddress homeAddress = new HomeAddress();
		homeAddress.setLongitude("51.5034070");
		homeAddress.setLatitude("-0.1275920");
		homeAddress.setCountry("India");
		homeAddress.setState("Telangana");
		homeAddress.setStreetAddress("CMC Enclave");
		homeAddress.setApartmentName("pearl Village");
		homeAddress.setFlatNumber(15);
		assertEquals("India", homeAddress.getCountry());
	}

}
