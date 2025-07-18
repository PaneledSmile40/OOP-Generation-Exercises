package com.generation.exercises;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username;
		String usernameCheck = "utenteprova01";
		String password;
		String passwordCheck = "admin";
		int c = 3;

		while (c > 0){
			if(c!=3) {
				System.out.println("Tentativi rimanenti: " + c);
			}
			
			System.out.println("Inserire nome utente");
			username = sc.nextLine();
			if (username.equals(usernameCheck)) {
				System.out.println("Nome utente corretto");
			} else {
				System.out.println("Nome utente errato");
				c--;
			}

			System.out.println("Inserire password");
			password = sc.nextLine();
			if (password.equals(passwordCheck)) {
				System.out.println("Password corretta");
				break;
			} else {
				System.out.println("Password errata");
				c--;
			}
		}
		
		if(c > 0) {
			System.out.println("Login effettuato correttamente");
		}else {
			System.out.println("Login fallito, uscita dal programma");
		}
		
		sc.close();
	}

}