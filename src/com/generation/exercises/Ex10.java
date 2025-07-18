package com.generation.exercises;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c = 0;
		String tempName = "";
		double tempPrice = 0.0;
		String maxName = "";
		double maxPrice = 0.0;
		int numArticoli = 0;
		double sum = 0;

		do {
			System.out.print("1. Aggiungi un articolo: inserire nome e costo dell'articolo.\n");
			System.out.print("2. Visualizzare totale spesa: Mostra il totale cumulativo dei costi.\n");
			System.out.print("3. Visualizzare il costo medio per articolo: Calcola e mostra il costo medio\n");
			System.out.print("4. Visualizzare l'articolo più costoso: Mostra il nome e il costo massimo registrato.\n");
			System.out.print("5. Esci dal programma: Termina l'esecuzione.");

			c = sc.nextInt();

			switch (c) {
			case 1:
				
				System.out.print("Inserisci prezzo articolo");
				tempPrice = Double.parseDouble(sc.nextLine());
				
				if(tempPrice <= 0.0) {
					System.out.println("ERROR: Prezzo articolo invalido. cleanup");
					break;
				}
				
				System.out.print("Inserisci nome articolo");
				tempName = sc.nextLine();
				
				numArticoli++;
				sum += tempPrice;
				
				if (tempPrice > maxPrice) {
					maxName = tempName;
					maxPrice = tempPrice;
				}

				break;
			case 2:
				if(numArticoli<1) { 
					System.out.println("Nessun articolo attualmente presente");
				}else {
					System.out.println("Totale spesa attuale: " +sum + "€");
				}
				break;
			case 3:
				if(numArticoli<1) { 
					System.out.println("Nessun articolo attualmente presente");
				}else {
					System.out.println("Costo medio degli articoli: " + (sum / numArticoli) + "€");
				}
				break;
			case 4:
				if(numArticoli<1) { 
					System.out.println("Nessun articolo attualmente presente");
				}else {
					System.out.println("Articolo più costoso: " + maxName + "\nCosto: " + maxPrice +"€");
				}
				break;
			case 5:
				System.out.println("Uscita dal programma...");
				break;
			default:
				System.out.println("Inserire un comando valido");
				c = 0;
				break;
			}
		} while (c != 5);

		sc.close();
	}

}
