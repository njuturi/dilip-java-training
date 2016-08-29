package com.junittest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.javolin.IpAddress;

public class IpAddressTest {

	// IpAddress to Integer
	@Test
	public void ipAddressToIntegerTest() {
		IpAddress ipAddress = new IpAddress("127.255.255.255");
		assertEquals(2147483647, ipAddress.toInteger());
	}
	
	// Integer to Ip address
	@Test
	public void IntegerToIpAddressTest() {
		IpAddress ipAddress = new IpAddress(2147483647);
		assertEquals("127.255.255.255", ipAddress.toIpAddress());
	}
	
	@Test
	public void ipAddressNegativeTestCase(){
		try{
			IpAddress ipAddress = new IpAddress("127.256.255.255");
		}catch(IllegalArgumentException e){
			fail("Ip address in INVALID!!!");
		}
		
	}
	@Test
	public void negativeIpAddressTest(){
		try{
			IpAddress ipAddress = new IpAddress("-1.256.255.255");
		}catch(IllegalArgumentException e){
			fail("Ip address in INVALID!!!");
		}
		
	}
}
