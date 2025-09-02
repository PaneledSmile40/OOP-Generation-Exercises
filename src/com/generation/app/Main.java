package com.generation.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("BENVENTUTO ALLA GESTIONE INVENTARIO\n--------------------------------------------\n");
		sc.close();
		
		Map<String,Integer> inventario = new HashMap<>();
		int c = 0;
		do {
			
			if(c < 0 || c > 6) {
				System.out.println("Inserire valore valido");
			}
			
			System.out.println("Seleziona un opzione");
			System.out.println("1) Aggiungi articolo");
			System.out.println("2) Rimuovi articolo");
			System.out.println("3) Modifica articolo");
			System.out.println("4) Verifica disponibilità articolo");
			System.out.println("5) Visualizza inventario completo");
			System.out.println("6) Visualizza articoli in surplus nel magazzino (>100)");
			System.out.println("0) Esci dal programma");
			
			
			switch(c) {
			case(1)  -> inventario.put(null, null) ; 
			};
			
		}while(c!=0);
	
		
		
		
		

	}
	
	public static void aggiungiArticolo(String nome, int quantita, HashMap<String,Integer> inventario) {
		if(inventario.putIfAbsent(nome, quantita) != null) {
			System.out.println("Prodotto già presente nell'inventario con quantità: " + inventario.get(nome));
			System.out.println("Vuoi sostituire  il valore di quantita:" + quantita + " al prodotto in inventario? (S per confermare)");
			String temp  = "N";
			Scanner sc = new Scanner(System.in);
			temp = sc.nextLine();
			sc.close();
			if(temp.equalsIgnoreCase("s")) {
				inventario.replace(nome, quantita);
			}
		}
	}
	
	public static void rimuoviArticolo(String nome, HashMap<String,Integer> inventario) {
		if(!inventario.containsKey(nome)) {
			System.out.println("Articolo " + nome + " non presente nell'inventario");
		}else inventario.remove(nome);
	}
	
	public static void modificaArticolo(String nome, int quantita, HashMap<String,Integer> inventario) {
		if(!inventario.containsKey(nome)) {
			System.out.println("Articolo " + nome + " non presente nell'inventario");
		}else inventario.replace(nome, quantita);
	}
	
	public static void disponibileArticolo(String nome, HashMap<String,Integer> inventario) {
		if(!inventario.containsKey(nome)) {
			System.out.println("Articolo " + nome + " non presente nell'inventario");
		}else {
			System.out.println("Articolo " + nome + " presente, quantità: " + inventario.get(nome));
		}
	}
	
	public static void articoliPiuCento(HashMap<String,Integer> inventario) {
		inventario.
	}

}
