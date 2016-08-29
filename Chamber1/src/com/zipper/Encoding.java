// Encoding to base32
// reference -> https://en.wikipedia.org/wiki/Base32
package com.zipper;

public class Encoding {
	private final static String BASE32 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ012345";
	private final static String BASE64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";
	private static byte base32Length = (byte) BASE32.length();
	private static byte base64Length = (byte) BASE64.length();

	public String toBase32(byte num) {
		byte remainder = 0;
		StringBuilder base32String = new StringBuilder("");
		if(num == 0){
			return "A";
		}
		while (num != 0) {
			remainder = (byte) (num % base32Length);
			base32String.append(BASE32.charAt(remainder));
			num = (byte) (num / base32Length);
		}
		return base32String.reverse().toString();
	}
	
	public String toBase64(byte num) {
		byte remainder = 0;
		StringBuilder base32String = new StringBuilder("");
		if(num == 0){
			return "A";
		}
		while (num != 0) {
			remainder = (byte) (num % base64Length);
			base32String.append(BASE64.charAt(remainder));
			num = (byte) (num / base64Length);
		}
		return base32String.reverse().toString();
	}

	public static void main(String[] args) {
		Encoding base32 = new Encoding();
		byte number = 32;
		String result1 = base32.toBase32(number);
		String result2 = base32.toBase64(number);
		System.out.println("Base32: " + result1);
		System.out.println("Base64: " + result2);
	}
}
