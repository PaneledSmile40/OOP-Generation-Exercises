package com.generation.app;

import java.io.FileNotFoundException;

import com.generation.entity.Coni;
import com.generation.entity.Persona;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
	
		Coni federazione = new Coni("res/sportivi.txt");

		showAllAtletes(federazione);
		//showCategoryAtletes(federazione, "pugile");
		
	}
	
	
	
	
	
	
	
	
	private static void showAllAtletes(Coni federation) {
		for (Persona atleta : federation.getListaAtleti() ) {
			
		}
	}
	
	private static void showCategoryAtletes(Coni federation, String categoria) {
		boolean notFound = true;
		for (Persona atleta : federation.getListaAtleti() ) {
			if(atleta instance of (categoria)) {
				System.out.println(atleta.toString());
				notFound = false;
			}
		}
		if (notFound) {
			System.out.println("Nessun atleta della categoria inserita");
		}
	}
	
	private static void ricercaAtleta(Coni federation, String nominativo) {
		boolean notFound = true;
		for (Persona atleta : federation.getListaAtleti() ) {
			if(atleta[0].equalsIgnoreCase(categoria)) {
				for(String infoAtleta : atleta) {
					System.out.print(infoAtleta + ", ");
				}
				System.out.println("\n");
				notFound = false;
			}
		}
		if (notFound) {
			System.out.println("Nessun atleta della categoria inserita");
		}
	}

}
