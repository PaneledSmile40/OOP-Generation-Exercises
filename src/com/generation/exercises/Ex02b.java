package com.generation.exercises;

import java.util.Scanner;

public class Ex02b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username;
		String usernameCheck = "utenteprova01";
		String password;
		String passwordCheck = "admin1234";
		
		System.out.println("Inserire nome utente");
		username = sc.nextLine();
		if (username.equals(usernameCheck)) {
			System.out.println("Nome corretto");
			System.out.println("Inserire password");
			password = sc.nextLine();
			if (password.equals(passwordCheck)) {
				System.out.println("Password corretta, login effettuato correttamente");
			}else {
				System.out.println("Password errata, ritenta");
			}
		}else {
			System.out.println("Nome utente errato, ritenta");
		}	
		sc.close();
	}
}