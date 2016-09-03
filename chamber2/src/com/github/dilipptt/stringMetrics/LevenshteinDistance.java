package com.github.dilipptt.stringMetrics;

public class LevenshteinDistance {
	private String string1, string2;

	public LevenshteinDistance(String string1, String string2) {
		this.setString1(string1);
		this.setString2(string2);
	}

	public int levenshteinDistance() {
		int[] length1 = new int[string1.length() + 1];
		int[] length2 = new int[string2.length() + 1];

		// base case1 : if both strings are equal, length = 0
		if (string1.equals(string2))
			return 0;

		// base Case2 : if one of the string length is 0, then length = length
		// of
		// other string
		if (string1.length() == 0)
			return string2.length();
		if (string2.length() == 0)
			return string1.length();

		// // initial cost of skipping prefix in string1
		for (int i = 0; i < string1.length() + 1; i++)
			length1[i] = i;

		for (int i = 1; i < string2.length() + 1; i++) {
			// initial cost of skipping prefix in String string2
			length2[0] = i;

			for (int j = 1; j < string1.length() + 1; j++) {
				// cost of each transformation
				int match = (string1.charAt(j - 1) == string2.charAt(i - 1) ? 0
						: 1);
				int replace = length1[j - 1] + match;
				int insert = length1[j] + 1;
				int delete = length2[j - 1] + 1;

				// keep minimum cost
				length2[j] = Math.min(Math.min(replace, insert), delete);
			}
			// swap length1/length1 array
			int[] swap = length1;
			length1 = length2;
			length2 = swap;
		}

		// the distance is the cost for transforming all letters in both strings
		return length1[string1.length()];
	}

	public String getString2() {
		return string2;
	}

	public void setString2(String string2) {
		this.string2 = string2;
	}

	public String getString1() {
		return string1;
	}

	public void setString1(String string1) {
		this.string1 = string1;
	}
}
