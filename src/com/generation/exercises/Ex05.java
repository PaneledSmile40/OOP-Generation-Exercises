package com.generation.exercises;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salary = 1200;
		String job;
		int years;

		System.out.println("Calcolo dello stipendio");
		System.out.println("Che mansioni ricopri all'interno dell'azienda?");
		job = sc.nextLine().toLowerCase();

		switch (job) {
		case "dipendente":
			salary += salary * 20 / 100;
			System.out.println("Applicata maggiorazione dipendente +20%");
			break;
		case "collaboratore ":
			salary += salary * 15 / 100;
			System.out.println("Applicata maggiorazione collaboratore +15%");
			break;
		case "consulente ":
			salary += salary * 10 / 100;
			System.out.println("Applicata maggiorazione consulente +10%");
			break;
		default:
			System.out.println("Nessuna maggiorazione applicata ");

		}

		
		System.out.println("Da quanti anni lavori in azienda?");
		years = sc.nextInt();

		if (years >= 30) {
			System.out.println("Anzianità massima raggiunta +500€");
			salary += 500;
		}
		if (years >= 20 && years < 30) {
			System.out.print("Anzianità tra 20 e 29 anni +350€");
			salary += 350;
		}
		if (years >= 9 && years < 20) {
			System.out.println("Anzianità tra 9 e 19 anni +200€");
			salary += 200;
		}
		if (years >= 6 && years < 9) {
			System.out.println("Anzianità tra 6 e 8 anni +100€");
			salary += 200;
		}
		if (years < 6) {
			System.out.println("Nessun bonus anzianità da applicare");
		}
		 
		System.out.println("Il tuo stipendio è di " + salary + "€ al mese");
		sc.close();

	}

}
