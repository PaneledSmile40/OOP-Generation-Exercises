package com.generation.exercises;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c;
		System.out.println("Dammi un numero positivo e mi fermerò");
		do {
		System.out.println("VAI!");
		c = sc.nextInt();
		}while(c<0);
		
		System.out.println("Spegnimento...");
		sc.close();
	}

}
