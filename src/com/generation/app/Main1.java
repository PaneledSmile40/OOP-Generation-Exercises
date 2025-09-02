package com.generation.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.generation.entity.Persona;

public class Main1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("res/person.txt"));
		//String[] campi = sc.nextLine().split(",");
		List<Persona> listaPersone = new ArrayList<Persona>();
		while (sc.hasNextLine()) {
			String[] temp = sc.nextLine().split(",");
			listaPersone.add(new Persona(Integer.parseInt(temp[0]), temp[1], temp[2], LocalDate.parse(temp[3]), temp[4]));
		}
		
		sc.close();
		
		System.out.println(listaPersone);
		
	}

}
