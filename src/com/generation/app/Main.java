package com.generation.app;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws FileNotFoundException  {
		
		Scanner file = new Scanner(new File("res/modelliMacchine.txt"));
		
		Scanner tastiera = new Scanner(System.in);
		
		List<String>cars = new ArrayList<>();
		
		while(file.hasNextLine()) {
			cars.add(file.nextLine());
		}
		
		String input;
		
		do{
			System.out.println("Cerca un modello di auto");
			input = tastiera.nextLine();
			
			
			boolean exist = false;
			for (String str: cars) {
				if(str.equalsIgnoreCase(input)) {
					exist = true;
					break;
				}
			}
			
			String message = exist?
					input+" è presente nella lista":
					input+" non è presente nella lista";
			
			System.out.println(message);
			
			System.out.println("\nVuoi cercare un altro modello? (S/N)");
			input = tastiera.nextLine();
			
		}while(input.equalsIgnoreCase("S"));
		
		System.out.println("\nGrazie e arrivederci");
		
		file.close();
		tastiera.close();

	}

}