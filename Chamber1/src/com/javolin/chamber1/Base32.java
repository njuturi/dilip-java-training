//http://www.herongyang.com/Encoding/Base32-Encoding-Algorithm.html
package com.javolin.chamber1;

import java.math.BigInteger;

import org.omg.CORBA.portable.ValueOutputStream;

public class Base32 {
	public static final String BASE32 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567";
	StringBuilder encode = new StringBuilder("");

	public String getBase32(String string) {
		String encode = "";
		byte[] array = string.getBytes();
		// to get pad length
		int this_limit = (1 + ((array.length - 1) / 5)) * 8;
		int this_ceil = (int) (((0.5 + (float) array.length) * 8) / 5);
		int limit_padding = this_limit - this_ceil;
		int padding = limit_padding % 8;
		int padLen = (5 - (array.length % 5)) % 5;
		byte[] encodeArray = new byte[padLen + array.length];
		System.arraycopy(array, 0, encodeArray, 0, array.length);
		for (int i = 0; i < encodeArray.length; i = i + 5) {
			// divided int 5 block of 8 bits
			BigInteger firstByte = (BigInteger.valueOf(encodeArray[i] & 0xff)
					.shiftLeft(32));
			BigInteger secondByte = (BigInteger
					.valueOf((encodeArray[i + 1] & 0xff)).shiftLeft(24));
			BigInteger thirdByte = (BigInteger
					.valueOf((encodeArray[i + 1] & 0xff)).shiftLeft(16));
			BigInteger forthByte = (BigInteger
					.valueOf((encodeArray[i + 1] & 0xff)).shiftLeft(8));
			BigInteger fifthByte = (BigInteger
					.valueOf((encodeArray[i + 1] & 0xff)));

			BigInteger j = firstByte.add(secondByte).add(thirdByte)
					.add(forthByte).add(fifthByte);

			// divide (5*8) = 40 bits to block of 5 bits and map the remainder
			// to string
			encode = encode
					+ BASE32.charAt((j.shiftRight(35).intValue()) & 0x1f)
					+ BASE32.charAt((int) ((j.shiftRight(30).longValue()) & 0x1f))
					+ BASE32.charAt((int) ((j.shiftRight(25).longValue()) & 0x1f))
					+ BASE32.charAt((int) ((j.shiftRight(20).longValue()) & 0x1f))
					+ BASE32.charAt((int) ((j.shiftRight(15).longValue()) & 0x1f))
					+ BASE32.charAt((int) ((j.shiftRight(10).longValue()) & 0x1f))
					+ BASE32.charAt((int) ((j.shiftRight(5).longValue()) & 0x1f))
					+ BASE32.charAt((int) (j.longValue() & 0x1f));
		}
		System.out.println(encode);
		return (encode.substring(0, encode.length() - padding) + "======"
				.substring(0, padding));
	}

	public static void main(String[] args) {
		Base32 base32 = new Base32();
		System.out.println((base32.getBase32("A")));
	}
}
