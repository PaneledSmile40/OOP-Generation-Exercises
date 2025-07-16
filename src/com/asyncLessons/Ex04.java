package com.asyncLessons;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double przNoIva;
		double ivaPrc;
		double przSiIva;
		
		System.out.println("Inserire prezzo da Ivare");
		przNoIva = Double.parseDouble(scanner.nextLine());
		System.out.println("Inserire valore percentuale Iva");
		ivaPrc = Double.parseDouble(scanner.nextLine());
		
		przSiIva = przNoIva + przNoIva * ivaPrc / 100;
		System.out.println("Il prezzo Ivato è di: " + przSiIva + "€");
		
		scanner.close();
	}

}
