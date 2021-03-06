package com.github.dilipptt.programs;

// Convert an IP address into Integer and vice-versa.
// Algo -> http://www.aboutmyip.com/AboutMyXApp/IP2Integer.jsp?ipAddress=122.132.123.123
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IpAddress {
	private String ipAddress;
	private int ipAddress2;

	public IpAddress(String ipAddress) {
		String[] ch = ipAddress.split("\\.");
		if (ch.length < 4) {
			throw new IllegalArgumentException();
		} else {
			int i = 0;
			while (i < 4) {
				int octat = Integer.parseInt(ch[i]);
				if (octat > 255 || octat < 0) {
					throw new IllegalArgumentException();
				}
				i++;
			}
		}
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

	public String toIpAddress() {
		int d = ipAddress2 % 256;
		ipAddress2 = ipAddress2 / 256;

		int c = ipAddress2 % 256;
		ipAddress2 = ipAddress2 / 256;

		int b = ipAddress2 % 256;
		ipAddress2 = ipAddress2 / 256;

		int a = ipAddress2;

		String ip = a + "." + b + "." + c + "." + d;
		return ip;
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
		String ip = intIpAddress.toIpAddress();
		System.out.println(ip);
	}
}
