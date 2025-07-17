package com.generation.exercises;

import java.util.Scanner;

public class Ex02v2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username;
		String usernameCheck = "utenteprova01";
		String password;
		String passwordCheck = "admin1234";

		System.out.println("Inserire nome utente");
		username = sc.nextLine();
		if (username.equals(usernameCheck)) {
			System.out.println("Nome utente corretto");
		} else {
			System.out.println("Nome utente errato, ritentare");
			username = sc.nextLine();
			if (username.equals(usernameCheck)) {
				System.out.println("Nome utente corretto");
			} else {
				System.out.println("Nome utente errato, login fallito");
				sc.close();
				return;
			}
		}

		System.out.println("Inserire password");
		password = sc.nextLine();
		if (password.equals(passwordCheck)) {
			System.out.println("Password corretta");
		} else {
			System.out.println("Password errata, ritentare");
			password = sc.nextLine();
			if (password.equals(passwordCheck) == false) {
				System.out.println("Password errata, login fallito");
				sc.close();
				return;
			}
			System.out.println("Password corretta, login effettuato correttamente");
			sc.close();
		}
		
		
	}
}
