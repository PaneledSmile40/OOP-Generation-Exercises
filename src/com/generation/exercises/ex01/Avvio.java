package com.generation.exercises.ex01;

import java.util.Scanner;

public class Avvio {

	public static void main(String[] args) {
		Utente user01 = new Utente("RossiMario75", "123456");
		Utente user02 = new Utente("BianchiMaria68", "asdasdasd");
		Utente user03 = new Utente("EspositoGiancarlo90" ,"qwerty123");
		Utente user04 = new Utente("DiegoArmando","Maradona");
		Utente user05 = new Utente("FooBar","BazQux");
		
		Scanner sc = new Scanner(System.in);
		String username,password;
		
		System.out.println("Inserisci nome utente");
		username = sc.nextLine();
		System.out.println("Inserisci password");
		password = sc.nextLine();
		
		if(	user01.check(username, password) ||	
			user02.check(username, password) ||	
			user03.check(username, password) ||	
			user04.check(username, password) ||	
			user05.check(username, password) ) {
			System.out.println("Accesso consentito");
		}else System.out.println("Accesso negato");		
		
		sc.close();
	}

}
