package com.generation.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("res/person.txt"));
		String[] campi = sc.nextLine().split(",");
		List< Map<String, String> > listaMappe = new ArrayList< Map<String, String> >();
		while (sc.hasNextLine()) {
			String[] temp = sc.nextLine().split(",");
			Map<String, String> istanzaMappa= new HashMap<String, String>();
			for(int i=0; i < campi.length; i++) {
				istanzaMappa.put(campi[i], temp[i]);
			}
			
			listaMappe.add(istanzaMappa);
		}
		
		sc.close();
		
		System.out.println(listaMappe);
	}

}
