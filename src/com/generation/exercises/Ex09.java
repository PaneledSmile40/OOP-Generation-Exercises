package com.generation.exercises;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int num = sc.nextInt();
		int c = 0;
		
		while (num >= 1) {
			num = num / 10;
			c++;
		}
		
		System.out.println("Il numero è  composto da " + c + " cifre");
		sc.close();
	}

}
