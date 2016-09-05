package com.github.dilipptt.stringMetrics;

// https://guendouz.wordpress.com/2015/02/17/implementation-of-tf-idf-in-java/

import java.util.Arrays;
import java.util.List;

public class TFIDFCalculator {
	public double tf(List<String> stringList1, String term) {
		double result = 0;
		for (String string : stringList1) {
			if (term.equalsIgnoreCase(string)) {
				result++;
			}
		}
		return result / stringList1.size();
	}

	public double idf(List<List<String>> documents, String term) {
		double numberOfDocuments = 0;
		for (List<String> doc : documents) {
			for (String string : doc) {
				if (term.equalsIgnoreCase(string)) {
					numberOfDocuments++;
					break;
				}
			}
		}
		return Math.log(documents.size() / numberOfDocuments);
	}

	public double tfidf(List<String> stringList1, List<List<String>> docs,
			String term) {
		return tf(stringList1, term) * idf(docs, term);
	}

	public static void main(String[] args) {
		List<String> stringList1 = Arrays.asList("Lorem", "ipsum", "dolor",
				"ipsum", "sit", "ipsum");
		List<String> stringList2 = Arrays.asList("Vituperata", "incorrupte",
				"at", "ipsum", "pro", "quo");
		List<String> stringList3 = Arrays.asList("Has", "persius",
				"disputationi", "id", "simul");
		List<List<String>> documents = Arrays.asList(stringList1, stringList2,
				stringList3);
		TFIDFCalculator calculator = new TFIDFCalculator();
		double tfidf = calculator.tfidf(stringList1, documents, "ipsum");
		System.out.println("tfidf = " + tfidf);
	}
}
