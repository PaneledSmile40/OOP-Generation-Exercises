package com.generation.entity;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	private String percorso;

	public FileReader(String percorso) {
		this.percorso = percorso;
	}

	public String readFirstLine() throws FileNotFoundException {
		Scanner sc = new Scanner(new File(percorso));
		String ris = sc.nextLine(); 
		sc.close();
		return ris;
	}
}
