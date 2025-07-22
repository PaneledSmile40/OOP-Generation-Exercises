package com.generation.exercises;

public class Utility {

	public static int quanteVocali(String word) {
		word = word.toLowerCase();
		int numVocali = 0;
		int c = word.length() - 1;
		for (int i = c; i >= 0; i--) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u') {
				numVocali++;
			}
		}
		return numVocali;
	}

	public static String alContrario(String word) {

		int c = word.length();
		String newWord = new String();
		for (int i = c - 1; i >= 0; i--) {
			newWord += word.charAt(i);
		}

		return newWord;
	}

	public static String senzaSpazi(String word) {
		return word.replaceAll("\\s+", "");
	}

	public static boolean isPalindromo(String word) {
		int i = 0;
		int c = word.length() - 1;

		while (i < c) {
			if (word.charAt(i) != word.charAt(c)) {
				return false;
			}
			i++;
			c--;
		}

		return true;
	}

	public static boolean isPalindrome2(String word) {
		int maxIndex = word.length() - 1;
		for (int i = 0; i < ((maxIndex) / 2); i++) {
			if (word.charAt(i) != word.charAt((maxIndex - i))) {
				return false;
			}
		}
		return true;
	}

}
