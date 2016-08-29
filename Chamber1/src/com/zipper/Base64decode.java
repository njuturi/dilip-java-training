// Online checking for base64 encoding-decoding -> https://emn178.github.io/online-tools/base64_encode.html
//https://en.wikibooks.org/wiki/Algorithm_Implementation/Miscellaneous/Base64

package com.zipper;

public class Base64decode {
	private final static String BASE64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";

	public String decode(String string) {
		String decoded = "";
		int paddingLength = 0;
		String pad = string.charAt(string.length() - 1) == '=' ? "A" : "";
		if (pad.length() > 0) {
			pad = pad + (string.charAt(string.length() - 2) == '=' ? "A" : "");
		}
		paddingLength = pad.length();
		string = string.substring(0, string.length() - paddingLength) + pad;
		for (int i = 0; i < string.length(); i = i + 4) {
			// concatenate each 6 bits character to make it 24 bits
			int n = (BASE64.indexOf(string.charAt(i)) << 18)
					+ (BASE64.indexOf(string.charAt(i + 1)) << 12)
					+ (BASE64.indexOf(string.charAt(i + 2)) << 6)
					+ (BASE64.indexOf(string.charAt(i + 3)));
			// Converting to original 3 bytes
			decoded = decoded + "" + (char) (n >> 16 & 0xff)
					+ (char) (n >> 8 & 0xff) + (char) (n & 0xff);
		}
		return decoded.substring(0, decoded.length() - paddingLength);
	}

	public static void main(String[] args) {
		Base64decode b = new Base64decode();
		System.out.println(b.decode("QQBhQQ=="));
	}
}