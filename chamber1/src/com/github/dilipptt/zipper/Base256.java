package com.github.dilipptt.zipper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Base256 {
	// to get base256 character -> https://github.com/blackdoor/blackdoor/blob/master/src/main/java/black/door/util/Base256.java
	private String BASE256 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ+-/*=abcdefghijklmnopqrstuvwxyzÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõö÷øùúûüýþÿΑΒΓΔΕΖΗΘΙΚΛΜΝΞΟΠΡ΢ΣΤΥΦΧΨΩαβγδεζηθικλμνξοπρςστυφχψωЁЂЃЄЅІЇЈЉЊЋЌЍЎЏАБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдежзийклмнопрстуфхцчшщъы";

	public String encode(String str) {
		byte[] array = str.getBytes();
		StringBuilder encode = new StringBuilder("");
		// Base256 character can be represented in 8 bits
		for (int i = 0; i < str.length(); i++) {
			encode.append(BASE256.charAt(array[i]));
		}
		return encode.toString();
	}

	public String decode(String str) throws UnsupportedEncodingException {
		int size = str.length();
		byte[] decodedByte = new byte[size];
		for (int j = 0; j < str.length(); j++) {
			decodedByte[j] = (byte) BASE256.indexOf(str.charAt(j));
		}
		// convert byte to string
		// http://stackoverflow.com/questions/17574916/how-to-convert-array-of-byte-to-string-in-java
		String decode = new String(decodedByte, "UTF-8");
		return decode;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String str = reader.readLine();
		Base256 base256 = new Base256();
		String encode = base256.encode(str);
		System.out.println("Enoded String: " + encode);

		// decoding
		String decode = base256.decode(encode);
		System.out.println("Decoded String: " + decode);
	}
}
