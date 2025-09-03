package com.generation.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.generation.entity.Persona;

public class Main1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("res/person.txt"));
		String[] campi = sc.nextLine().split(",");
		List<Persona> listaPersone = new ArrayList<Persona>();
		while (sc.hasNextLine()) {
			String[] datiPersona = sc.nextLine().split(",");
			//listaPersone.add(new Persona(Integer.parseInt(datiPersona[0]), datiPersona[1], datiPersona[2], LocalDate.parse(datiPersona[3]), datiPersona[4]));
			listaPersone.add(new Persona(datiPersona));
		}
		
		sc.close();
		
		System.out.println(listaPersone);
		
	}

}
