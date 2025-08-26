package com.generation.app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quanti amici vuoi invitare?");
		int c = sc.nextInt();
		if(c == 0) {
			System.out.println("Non hai amici ... sigh ... chiudo");
			sc.close();
			return;
		}
		String[] invitati = new String[c];
		sc.nextLine();
		
		String temp = new String();
		
		
		for(int i = 0; i < c; i++) {
			System.out.println("Inserire nomi invitati");
			temp = sc.nextLine();
			invitati[i] = temp != "" ? temp : "ERRORE";
		}
		
		String message = new String();
		int numeroDiErrori = 0;
		
		for(int i = 0; i < invitati.length; i++) {
			if(invitati[i].equals("ERRORE")) {
				numeroDiErrori++; 
				continue; 
			}
			if(i == invitati.length-1) {
				message += invitati[i] + ".";
				break;
			}
			message += invitati[i] + ", ";
		}
		
		System.out.println(message);
		System.out.println("Sono presenti " + numeroDiErrori + " errori");
		
		
		sc.close();
		

	}

}
