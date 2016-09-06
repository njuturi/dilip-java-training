package com.github.dilipptt.zipper;

// Hassle free Encoding Scheme, easy to read, write, etc
// Base16 encoding algorithms
// 1. divide the string into 1 block of 8 bits
// 2. divide the 1 byte block int0 2 block of 4 bits, 2 ^ 4 = 16
// 3. Map each 4 bits block to MYBASE26

public class Base16 {
	private String MYBASE16 = "ABCDEFGHJKMNPQ23";

	public String encode(byte[] array) {
		StringBuilder encode = new StringBuilder("");
		for (int i = 0; i < array.length; i++) {
			int j = (array[i] & 0xff);

			encode = encode.append(MYBASE16.charAt(j >> 4 & 0xf)).append(
					MYBASE16.charAt(j & 0xf));
		}
		return encode.toString();
	}

	public String decode(String string) {
		String decode = "";
		for (int i = 0; i < string.length(); i = i + 2) {
			int j = (MYBASE16.indexOf(string.charAt(i)) << 4)
					+ (MYBASE16.indexOf(string.charAt(i + 1)));
			decode = decode + (char) (j & 0xff);
			
		}
		return decode.toString();
	}

	public static void main(String[] args) {
		Base16 object = new Base16();
		String str = "0123 a";
		byte[] bite = str.getBytes();
		String encode = object.encode(bite);
		System.out.println(encode);

		String decode = object.decode(encode);
		System.out.println(decode);
	}
}
