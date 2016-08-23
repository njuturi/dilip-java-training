package com.javolin;
// Convert an IP address into Integer and vice-versa.
// Algo -> http://www.aboutmyip.com/AboutMyXApp/IP2Integer.jsp?ipAddress=122.132.123.123
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IpAddress {
	private String ipAddress;
	private int ipAddress2;
	private int[] toIps;

	public IpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public IpAddress(int ipAddress2) {
		this.ipAddress2 = ipAddress2;
	}

	// Convert ip address to Integer
	public long toInteger() {
		String[] ip = ipAddress.split("\\.");
		long sum = 0;
		for (int i = 0; i < 4; i++) {
			int power = 3 - i;
			int ipParts = Integer.parseInt(ip[i]);
			sum = (long) (sum + ipParts * Math.pow(256, power)); // each octet
																	// is of
																	// base 256
		}
		return sum;
	}

	public void toIpAddress() {
		int d = ipAddress2 % 256;
		ipAddress2 = ipAddress2 / 256;

		int c = ipAddress2 % 256;
		ipAddress2 = ipAddress2 / 256;

		int b = ipAddress2 % 256;
		ipAddress2 = ipAddress2 / 256;

		int a = ipAddress2;

		System.out.println("Integer to Ip Address : " + a + "." + b + "." + c
				+ "." + d);
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Enter the ip adress");
		String ipAddress = reader.readLine();
		IpAddress ipAddressObj = new IpAddress(ipAddress);
		long integerAddress = ipAddressObj.toInteger();
		System.out
				.println("The ip address in Integer form : " + integerAddress);

		int ipAddress2 = Integer.parseInt(reader.readLine());
		IpAddress intIpAddress = new IpAddress(ipAddress2);
		intIpAddress.toIpAddress();
	}
}
