package com.generation.app;

import java.io.FileNotFoundException;

import com.generation.entity.Calciatore;
import com.generation.entity.Coni;
import com.generation.entity.Nuotatore;
import com.generation.entity.Persona;
import com.generation.entity.Pilota;
import com.generation.entity.Pugile;
import com.generation.entity.Tennista;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
	
		Coni federazione = new Coni("res/sportivi.txt");

		showAllAtletes(federazione);
		showCategoryAtletes(federazione, "pugile");
		showAtleteByName(federazione, "Muhammad ali");
		
	}
	
	
	
	
	
	public static void addAtlete(Coni federation, String categoria) {
		//atleta da inserire? TODO
		switch(categoria.toLowerCase()) {
		case ("calciatore") ->  addCalciatore();
		case ("tennista") -> addTennista();
		case ("nuotatore") -> addNuotatore();
		case ("pugile") -> addPugile();
		case ("pilota") -> addPilota();
		default -> System.out.println("categoria inserita invalida");
		};	
	}
	
	
	
	
	private static void showAllAtletes(Coni federation) {
		for (Persona atleta : federation.getListaAtleti() ) {
			System.out.println(atleta);
		}
	}
	
	private static void showCategoryAtletes(Coni federation, String categoria) {
		boolean notFound = true;
		for (Persona atleta : federation.getListaAtleti() ) {
			if(SuppInstanceOfInput (atleta, categoria)) {
				System.out.println(atleta.toString());
				notFound = false;
			}
		}
		if (notFound) {
			System.out.println("Nessun atleta della categoria inserita");
		}
	}
	
	private static void showAtleteByName(Coni federation, String nominativo) {
		boolean notFound = true;
		for (Persona atleta : federation.getListaAtleti() ) {
			if (atleta.getNominativo().equalsIgnoreCase(nominativo)) {
				System.out.print(atleta);
				System.out.println("\n");
				notFound = false;
			}
		}
		if (notFound) {
			System.out.println("Nessun atleta con quel nominativo");
		}
	}
	
	
	private static boolean SuppInstanceOfInput(Persona atleta, String categoria) {
//		return switch (categoria.toLowerCase()) {
//        case "calciatore", "tennista", "nuotatore", "pugile", "pilota" -> true;
//        default -> false;
//		};
		
		return switch(categoria.toLowerCase()) {
		case ("calciatore") -> atleta instanceof Calciatore;
		case ("tennista") -> atleta instanceof Tennista;
		case ("nuotatore") -> atleta instanceof Nuotatore;
		case ("pugile") -> atleta instanceof Pugile;
		case ("pilota") -> atleta instanceof Pilota;
		default -> false;
		};
		
		
	}	
		
		
	

}
