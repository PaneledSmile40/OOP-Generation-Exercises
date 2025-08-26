package com.generation.app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire una parola da splittare");
		String parola = sc.nextLine();
		char[] parolaSplittata = new char[parola.length()];
		
		for(int i = 0; i < parola.length(); i++) {
			parolaSplittata[i] = parola.charAt(i);
		}
		
//		for(int i=0; i < parolaSplittata.length;i++) {
//			System.out.println(parolaSplittata[i]);
//		}
		
		sc.close();
		

	}

}

