package com.generation.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.generation.entity.Persona;


public class Main3 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("res/person.txt"));
		//String[] campi = sc.nextLine().split(",");
		Map<String, Persona> mappaPersone = new HashMap<String, Persona>();
		while (sc.hasNextLine()) {
			String[] temp = sc.nextLine().split(",");
			mappaPersone.put(temp[0],(new Persona(Integer.parseInt(temp[0]), temp[1], temp[2], LocalDate.parse(temp[3]), temp[4])));
		}
		
		sc.close();
		
		System.out.println(mappaPersone);
		
	}
}
