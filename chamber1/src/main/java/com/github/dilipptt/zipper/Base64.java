// algorithm
//http://www.herongyang.com/Encoding/Base64-Encoding-Algorithm.html
//http://www.wikihow.com/Encode-a-String-to-Base64-With-Java

package com.github.dilipptt.zipper;

public class Base64 {
	private final static String BASE64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";

	public String encode(String string) {
		StringBuilder encodeString = new StringBuilder("");
		byte[] array = string.getBytes();
		int padLength = ((3 - (array.length % 3)) % 3);
		byte[] padded = new byte[array.length + padLength];
		// Copy user string to new array with pad
		System.arraycopy(array, 0, padded, 0, array.length);

		for (int i = 0; i < padded.length; i = i + 3) {
			// 1. Divide the input bytes stream into blocks of 3 bytes.
			int j = ((padded[i] & 0xff) << 16) + ((padded[i + 1] & 0xff) << 8)
					+ (padded[i + 2] & 0xff);
			// 2. Divide 24 bits of each 3-byte block into 4 groups of 6 bits.
			// Dividing by 64, and mapping the remainder with BASE64
			encodeString = encodeString.append(BASE64.charAt((j >> 18) & 0x3f))
					.append(BASE64.charAt((j >> 12) & 0x3f))
					.append(BASE64.charAt((j >> 6) & 0x3f))
					.append(BASE64.charAt(j & 0x3f));

		}
		String encode = encodeString.toString();
		return (encode.substring(0, encodeString.length() - padLength) + "=="
				.substring(0, padLength));
	}

	public static void main(String[] args) {
		Base64 b = new Base64();
		System.out.println(b.encode("abcd"));
	}
}