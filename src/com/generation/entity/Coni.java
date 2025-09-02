package com.generation.entity;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coni {
	
	private List<Persona> listaAtleti;
	
	public Coni(String percorso) throws FileNotFoundException {
		listaAtleti = new ArrayList<Persona>();
		Scanner scanner = new Scanner(new File(percorso));
		while(scanner.hasNextLine()) {
			String[] personData = (scanner.nextLine().split(","));
			switch(personData[0].toLowerCase()) {
			case ("calciatore") -> listaAtleti.add(new Calciatore(personData[1] +" "+ personData[2], Integer.parseInt(personData[3]),Integer.parseInt(personData[4]),personData[5],personData[6]) );
			case ("tennista") -> listaAtleti.add(new Tennista(personData[1] +" "+ personData[2], Integer.parseInt(personData[3]), personData[4], personData[5]) );
			case ("nuotatore") -> listaAtleti.add(new Nuotatore(personData[1] +" "+ personData[2], Integer.parseInt(personData[3]),personData[4]) );
			case ("pugile") -> listaAtleti.add(new Pugile(personData[1] +" "+ personData[2], Integer.parseInt(personData[3]), Integer.parseInt(personData[4])) );
			case ("pilota") -> listaAtleti.add(new Pilota(personData[1] +" "+ personData[2], Integer.parseInt(personData[3]),personData[4],personData[5]) );
 			}
		}		
		scanner.close();
	}

	public List<Persona> getListaAtleti() {
		return listaAtleti;
	}

	public void setListaAtleti(List<Persona> federazione) {
		this.listaAtleti = federazione;
	}
	
	

}
