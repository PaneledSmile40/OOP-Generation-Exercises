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
			String[] temp = (scanner.nextLine().split(","));
			switch(temp[0].toLowerCase()) {
			case ("calciatore") -> listaAtleti.add(new Calciatore(temp[1] +" "+ temp[2], Integer.parseInt(temp[3]),Integer.parseInt(temp[4]),temp[5],temp[6]) );
			case ("tennista") -> listaAtleti.add(new Tennista(temp[1] +" "+ temp[2], Integer.parseInt(temp[3]), temp[4], temp[5]) );
			case ("nuotatore") -> listaAtleti.add(new Nuotatore(temp[1] +" "+ temp[2], Integer.parseInt(temp[3]),temp[4]) );
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
