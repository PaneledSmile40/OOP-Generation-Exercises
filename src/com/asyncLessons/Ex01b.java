package com.asyncLessons;

import java.util.Scanner;

public class Ex01b {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, somma;

		System.out.println("Dammi 2 numeri, te ne restituirò la media e la somma");
		System.out.println("Primo numero:");
		num1 = scanner.nextInt();
		System.out.println("Secondo numero:");
		num2 = scanner.nextInt();

		System.out.println("La somma dei due numeri è: " + (somma = num1 + num2) + "\nLa media dei due numeri è: "+ (somma / 2.0));
	}

}