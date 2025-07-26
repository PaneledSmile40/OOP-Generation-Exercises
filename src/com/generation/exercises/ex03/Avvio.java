package com.generation.exercises.ex03;

import java.util.Scanner;



public class Avvio {

	public static void main(String[] args) {
		Utente user01 = new Utente("RossiMario75", "123456");
		Utente user02 = new Utente("BianchiMaria68", "asdasdasd");
		Utente user03 = new Utente("EspositoGiancarlo90", "qwerty123");
		Utente user04 = new Utente("DiegoArmando", "Maradona");
		Utente user05 = new Utente("FooBar", "BazQux");

		Scanner sc = new Scanner(System.in);
		String username, password;

		

		for (int c = 0; c < 3; c++) {
			if(c!=0) {
				System.out.println("Nome utente errato, tentativi rimanenti " + (3-c));
			}
			
			System.out.println("Inserisci nome utente");
			username = sc.nextLine();
			
			if (user01.checkUser(username)) {
				for (c = 0; c < 2; c++) {
					if(c!=0) {
						System.out.println("Nome utente errato, tentativi rimanenti " + (2-c));
					}
					System.out.println("Inserisci password");
					password = sc.nextLine();
					if (user01.checkPassword(password)) {
						System.out.println("Accesso Eseguito, benvenuto " + username);
						sc.close();
						return;
					}
					
				}
			}
			
			if (user02.checkUser(username)) {
				for (c = 0; c < 2; c++) {
					if(c!=0) {
						System.out.println("Nome utente errato, tentativi rimanenti " + (2-c));
					}
					System.out.println("Inserisci password");
					password = sc.nextLine();
					if (user02.checkPassword(password)) {
						System.out.println("Accesso Eseguito, benvenuto " + username);
						sc.close();
						return;
					}
				}
			}	
			
			if (user03.checkUser(username)) {
				for (c = 0; c < 2; c++) {
					if(c!=0) {
						System.out.println("Nome utente errato, tentativi rimanenti " + (2-c));
					}
					System.out.println("Inserisci password");
					password = sc.nextLine();
					if (user03.checkPassword(password)) {
						System.out.println("Accesso Eseguito, benvenuto " + username);
						sc.close();
						return;
					}
				}
			}
			
			if (user04.checkUser(username)) {
				for (c = 0; c < 2; c++) {
					if(c!=0) {
						System.out.println("Nome utente errato, tentativi rimanenti " + (2-c));
					}
					System.out.println("Inserisci password");
					password = sc.nextLine();
					if (user04.checkPassword(password)) {
						System.out.println("Accesso Eseguito, benvenuto " + username);
						sc.close();
						return;
					}
				}
			}
			
			if (user05.checkUser(username)) {
				for (c = 0; c < 2; c++) {
					if(c!=0) {
						System.out.println("Nome utente errato, tentativi rimanenti " + (2-c));
					}
					System.out.println("Inserisci password");
					password = sc.nextLine();
					if (user05.checkPassword(password)) {
						System.out.println("Accesso Eseguito, benvenuto " + username);
						sc.close();
						return;
					}
				}
			}
		}
		
		System.out.println("Tentantivi esauriti, accesso negato, chiusura del programma");
		sc.close();
		
		
	}
}