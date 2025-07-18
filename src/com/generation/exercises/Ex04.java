package com.generation.exercises;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 0;

		System.out.println("Inserisci numeri divisibili per 2 o 3 e te ne restituirò la somma. \nIl programma si bloccherà se il numero inserito violerà le condizioni");
		
		do {
			System.out.println("Inserisci un numero");
			n = sc.nextInt();
			sum += n;
		}while(n%3==0 || n%3==0);
		
		System.out.println("Condizione violata!");
		sum-=n;
		System.out.println("La somma dei numeri inseriti correttamente è: " + sum);
		
		sc.close();
	}
}
