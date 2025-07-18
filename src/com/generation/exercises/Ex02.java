package com.generation.exercises;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum=0;
		
		System.out.println("Quanti numeri vuoi sommare?");
		n = sc.nextInt();
		
		if(n<1) {
			System.out.println("Se non vuoi che ti sommo i numeri cosa mi esegui a fare. Spegnimento...");
			sc.close();
			return;
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("Inserisci un numero. Numeri attualmente inseriti: " + i);
			sum += sc.nextInt();
		}
		
		System.out.println("La somma dei numeri inseriti è: " + sum);
		
		sc.close();
	}

}
