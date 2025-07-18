package com.generation.exercises;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = 101;
		int rnd =  (int) (Math.random()*100);
		System.out.println("Indovina a che numero sto pensando");
		
		while(rnd != c) {
			if (c!=101) {
				System.out.println("Sbagliato! Ritenta");
			} 
			c = sc.nextInt();
		}
		
		System.out.println("Esatto! Il numero a cui stavo pensando era "  + c);
		
		sc.close();
	}

}
