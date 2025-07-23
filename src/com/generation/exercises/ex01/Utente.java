package com.generation.exercises.ex01;

public class Utente {

	String username,password;
	
	public Utente(){}
	public Utente(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	
	public String toString() {
		return ("Nome Utente: " + username + "\nPassword: " + password);
	}
	
	
	public boolean checkUser(String username) {
		return (this.username.equals(username));
		
	}
	
	
	public boolean checkPassword(String password) {
		return (this.password.equals(password));
	}
	
	
	public boolean check(String username, String password) {
		return (checkUser(username) && checkPassword(password)); 	
	}
}
