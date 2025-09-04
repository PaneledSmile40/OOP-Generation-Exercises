package com.generation.app;

import java.util.ArrayList;
import java.util.List;

import com.generation.contract.Render;
import com.generation.entity.RenderDestinationYear;
import com.generation.entity.Viaggio;

public class Main {

	public static void main(String[] args) {
		
		
		List<Viaggio> listaViaggi = new ArrayList<Viaggio>();
		listaViaggi.add(new Viaggio("Messico", 6, 20, 2020));
		listaViaggi.add(new Viaggio("Spagna", 0, 12, 2011));
		listaViaggi.add(new Viaggio("Francia", 59, 3, 2015));
		listaViaggi.add(new Viaggio("Islanda", 4, 102, 1999));
		
		Render destYear = new RenderDestinationYear();

		
		Render destDurata = new Render() {
		    public String render(Viaggio v) {
		        return "destinazione del viaggio: " + v.getDestinazione() + ", durata: " + v.getDurata();
		    }
		};

		
		Render destAmici = v -> "destinazione del viaggio: " + v.getDestinazione() + ", amici: " + v.getPersone();

	}

}
