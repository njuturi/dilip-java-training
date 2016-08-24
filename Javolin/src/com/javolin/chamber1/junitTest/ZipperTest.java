package com.javolin.chamber1.junitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.javolin.chamber1.HomeAddress;
import com.javolin.chamber1.ZipperGenerator;

public class ZipperTest {

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
		
		ZipperGenerator zipper = new ZipperGenerator();
		int i = 0;
		while(i!=10){
			String zip = zipper.generator();
			System.out.println(zip);
			i++;
		}
		
	}

}
