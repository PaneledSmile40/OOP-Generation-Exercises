package com.generation.app;


import java.io.FileNotFoundException;
import java.util.Scanner;

import com.generation.entity.Decodificatore;
import com.generation.entity.FileReader;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		sc.close();
		
		FileReader file = new FileReader("res/alfabeto.txt");
		String[] cifrario = file.readFirstLine().split("");
		Decodificatore A1Z25 = new Decodificatore(cifrario);
		String primaParola = A1Z25.encrypt("MARIO ROSSI");
		System.out.println(primaParola);
		System.out.println(A1Z25.dencrypt(primaParola));
	}

}
