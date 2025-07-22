package com.generation.exercises;

public class Utility2 {

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
