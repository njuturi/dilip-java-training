package com.zipper;

import java.util.HashMap;
import java.util.Map;

public class MyEncoding {
	static Map<String, String> map = new HashMap<>();

	public String encode(String str) {
		int j = 0;
		StringBuilder encodedStr = new StringBuilder("");
		while (j < str.length()) {
			String ch = str.charAt(j) + "";
			if (map.get(ch) != null) {
				encodedStr = encodedStr.append(map.get(ch));
			} else {
				encodedStr = encodedStr.append(ch);
			}
			j++;
		}
		return encodedStr.toString();
	}

	public static void main(String[] args) {
		MyEncoding enc = new MyEncoding();
		map.put("a", "C");
		map.put("b", "T");
		map.put("c", "H");
		map.put("d", "G");
		map.put("e", "F");
		map.put("f", "A");
		map.put("g", "E");
		map.put("h", "D");
		map.put("i", "7");
		map.put("j", "J");
		map.put("i", "6");
		map.put("j", "K");
		map.put("k", "5");
		map.put("l", "L");
		map.put("t", "4");
		map.put("n", "3");
		map.put("o", "M");
		map.put("p", "2");
		map.put("q", "N");
		map.put("r", "D");
		map.put("s", "P");
		map.put("u", "C");
		map.put("t", "Q");
		map.put("u", "R");
		map.put("v", "S");
		map.put("z", "Z");
		map.put("M", "X");
		
		
		String s = enc.encode("My name is dilip");
		System.out.println(s);

	}
}
