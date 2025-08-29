package com.generation.app;


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner file = new Scanner(new File("res/nomeCognomeEta.txt"));
		String stringedFile = file.nextLine();
		String[] datiPersone = stringedFile.split(",");			//i dati di ogni persona sono in 1 unico campo
		String[][] persone = new String[datiPersone.length][3]; //ogni riga della matrice rappresenta 1 persona; la colonna 0 è il nome, la colonna 1 è il cognome, la colonna 2 è l'età
		
		for(int i=0; i < datiPersone.length; i++ ) {
			persone[i] = datiPersone[i].split(":");
		}
		
//		for(int i = 0; i<3;i++) {
//			System.out.println(persone[i][0]);
//		}
		System.out.println("Nomi:");
		for(String[] riga:persone)
			System.out.println(riga[0]);
		
		System.out.println("\nCognomi:");
		for(String[] riga:persone)
			System.out.println(riga[1]);
		
		System.out.println("\nEta maggiore di 60:");
		for(String[] riga:persone) {
			if(Integer.parseInt(riga[2]) > 60){
				for(String c:riga) {
					System.out.print(c + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\nLa media delle età comprese tra 30 e 50 è: ");
		int c = 0;
		int somma = 0;
		for(String[] riga:persone) {
			if(Integer.parseInt(riga[2]) >= 30 && Integer.parseInt(riga[2]) <= 50) {
				somma += Integer.parseInt(riga[2]);
				c++;
			}
		}
		System.out.println( (double)(somma) / c );
		
		
		file.close();
	}

}
