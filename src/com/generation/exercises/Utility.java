package com.generation.exercises;

public class Utility {

	public static int quanteVocali(String word) {
		word =  word.toLowerCase();
		int numVocali = 0;
		int c = word.length()-1;
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
		String newWord = "";
		for (int i = c-1; i >= 0; i--) {
			newWord += word.charAt(i);
		}
		
		return newWord;
	}
	
	
	public static String senzaSpazi(String word) {
		return word.replaceAll("\\s+", "");
	}
	
	
	public static boolean isPalindromo(String word) {
		int i=0;
		int c = word.length()-1;
		
		while(i!=c && c>i){
			if(word.charAt(i)!=word.charAt(c)) {
				return false;
			}else {
				i++;
				c--;
			}
		}
		
		return true;
	}
	
}
